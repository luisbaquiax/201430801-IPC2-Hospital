/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controladores.cargaDatos;

import com.hospital.coneccion.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
public class Archivo {

    private ModeloAdministrador modeloAdministrador;
    private ModeloCita modeloCita;
    private ModeloConsulta modeloConsulta;
    private ModeloExamnen modeloExamnen;
    private ModeloHistorialMedico modeloHistorialMedico;
    private ModeloLaboratorista modeloLaboratorista;
    private ModeloMedico modeloMedico;
    private ModeloTitulo modeloTitulo;
    private ModeloPaciente modeloPaciente;
    private ModeloReporte modeloReporte;
    private ModeloResultado modeloResultado;

    private ArrayList<String> errores;

    /**
     * Constructor que recibe de parámetro una lista de errores, donse
     * almacenará los errores en la carga de datos
     *
     * @param errores
     */
    public Archivo(ArrayList<String> errores) {
        this.modeloAdministrador = new ModeloAdministrador();
        this.modeloCita = new ModeloCita();
        this.modeloConsulta = new ModeloConsulta();
        this.modeloExamnen = new ModeloExamnen();
        this.modeloHistorialMedico = new ModeloHistorialMedico();
        this.modeloLaboratorista = new ModeloLaboratorista();
        this.modeloMedico = new ModeloMedico();
        this.modeloPaciente = new ModeloPaciente();
        this.modeloReporte = new ModeloReporte();
        this.modeloResultado = new ModeloResultado();
        this.modeloTitulo = new ModeloTitulo();

        this.errores = this.errores;
    }

    /**
     * Método que servirá en la carga de datos, dependiendo del tipo de objeto
     * se leerá según los nodos correspondientes
     *
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public void cargarDatos() throws ParserConfigurationException, SAXException, IOException {

        JFileChooser seleccionar = new JFileChooser();

        int selecionado = seleccionar.showOpenDialog(null);
        try {

            if (selecionado == JFileChooser.APPROVE_OPTION) {
                File archivo = seleccionar.getSelectedFile();

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = factory.newDocumentBuilder();
                Document document = documentBuilder.parse(archivo);

                document.getDocumentElement().normalize();

                System.out.println("ELEMENTO RAÍZ " + document.getDocumentElement().getNodeName());

                NodeList listaAdministradores = document.getElementsByTagName("admin");

                for (int i = 0; i < listaAdministradores.getLength(); i++) {
                    String codigo = "";
                    String dpi = "";
                    String nombre = "";
                    String contraseña = "";
                    Node nodo = listaAdministradores.item(i);

                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) nodo;
                        NodeList hijos = element.getChildNodes();
                        System.out.println("CODIGO: " + element.getElementsByTagName("CODIGO").item(0).getTextContent());
                        codigo = element.getElementsByTagName("CODIGO").item(0).getTextContent();

                        System.out.println("DPI: " + element.getElementsByTagName("DPI").item(0).getTextContent());
                        dpi = element.getElementsByTagName("DPI").item(0).getTextContent();

                        System.out.println("NOMBRE: " + element.getElementsByTagName("NOMBRE").item(0).getTextContent());
                        nombre = element.getElementsByTagName("NOMBRE").item(0).getTextContent();

                        System.out.println("PASSWORD: " + element.getElementsByTagName("PASSWORD").item(0).getTextContent());
                        contraseña = element.getElementsByTagName("PASSWORD").item(0).getTextContent();
                        try {
                            modeloAdministrador.agregarAdministrador(codigo, dpi, nombre, contraseña);
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                            //this.errores.add(codigo+dpi+nombre+contraseña);
                        }

                    }
                    System.out.println("");
                }
                System.out.println("MEDICOS");
                NodeList listaDoctores = document.getElementsByTagName("doctor");
                for (int i = 0; i < listaDoctores.getLength(); i++) {

                    String horarioInicio = "";
                    String horarioFin = "";
                    String contraseña = "";
                    Node nodo = listaDoctores.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;

                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        String codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();

                        System.out.println("NOMBRE " + elemento.getElementsByTagName("NOMBRE").item(0).getTextContent());
                        String nombre = elemento.getElementsByTagName("NOMBRE").item(0).getTextContent();
                        System.out.println("COLEGIADO " + elemento.getElementsByTagName("COLEGIADO").item(0).getTextContent());
                        String colegiado = elemento.getElementsByTagName("COLEGIADO").item(0).getTextContent();

                        System.out.println("DPI " + elemento.getElementsByTagName("DPI").item(0).getTextContent());
                        String dpi = elemento.getElementsByTagName("DPI").item(0).getTextContent();

                        System.out.println("TELEFONO " + elemento.getElementsByTagName("TELEFONO").item(0).getTextContent());
                        String telefono = elemento.getElementsByTagName("TELEFONO").item(0).getTextContent();

                        System.out.println("CORREO " + elemento.getElementsByTagName("CORREO").item(0).getTextContent());
                        String email = elemento.getElementsByTagName("CORREO").item(0).getTextContent();

                        NodeList horariosInicio = elemento.getElementsByTagName("INICIO");
                        for (int j = 0; j < horariosInicio.getLength(); j++) {
                            Node nodo2 = horariosInicio.item(j);

                            if (nodo2.getNodeType() == nodo2.ELEMENT_NODE) {
                                Element horaInicio = (Element) nodo2;
                                System.out.println("horario inicial: " + horaInicio.getTextContent());
                                horarioInicio = horaInicio.getTextContent();
                            }
                        }
                        NodeList horariosFinal = elemento.getElementsByTagName("FIN");

                        for (int j = 0; j < horariosFinal.getLength(); j++) {
                            Node nodo3 = horariosFinal.item(j);

                            if (nodo3.getNodeType() == nodo3.ELEMENT_NODE) {
                                Element horaFin = (Element) nodo3;
                                System.out.println("horario fin: " + horaFin.getTextContent());
                                horarioFin = horaFin.getTextContent();
                            }
                        }

                        System.out.println("TRABAJO " + elemento.getElementsByTagName("TRABAJO").item(0).getTextContent());
                        String fechaInicioTrabajo = elemento.getElementsByTagName("TRABAJO").item(0).getTextContent();

                        System.out.println("PASSWORD " + elemento.getElementsByTagName("PASSWORD").item(0).getTextContent());
                        contraseña = elemento.getElementsByTagName("PASSWORD").item(0).getTextContent();
                        try {
                            modeloMedico.agregarMedico(codigo, nombre, colegiado, dpi, telefono, email, horarioInicio, horarioFin, fechaInicioTrabajo, contraseña);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                            //this.errores.add(modeloMedico.toString());
                        }
                        NodeList especialidades = elemento.getElementsByTagName("TITULO");
                        for (int j = 0; j < especialidades.getLength(); j++) {
                            String especialidad = "";
                            Node nodo1 = especialidades.item(j);

                            if (nodo1.getNodeType() == nodo1.ELEMENT_NODE) {
                                Element titulo = (Element) nodo1;

                                System.out.println("titulo " + titulo.getTextContent());
                                especialidad = titulo.getTextContent();
                                try {
                                    modeloTitulo.agregarTituloMedico(especialidad, codigo);
                                    System.out.println("titulo agregado");

                                } catch (SQLException e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("no se agrego el titulo");
                                    //this.errores.add(modeloTitulo.toString());
                                }

                            }
                        }

                    }
                    System.out.println("");
                }

                System.out.println("LABORATORISTAS");
                NodeList listaLaboratoristas = document.getElementsByTagName("laboratorista");
                for (int i = 0; i < listaLaboratoristas.getLength(); i++) {
                    String codigo = "";
                    String nombre = "";
                    String registro = "";
                    String dpi = "";
                    String telefono = "";
                    String tipoExamen = "";
                    String email = "";
                    String fechaInicioTrabajo = "";
                    String contraseña = "";
                    Node nodo = listaLaboratoristas.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        System.out.println("NOMBRE " + elemento.getElementsByTagName("NOMBRE").item(0).getTextContent());
                        nombre = elemento.getElementsByTagName("NOMBRE").item(0).getTextContent();
                        System.out.println("REGISTRO " + elemento.getElementsByTagName("REGISTRO").item(0).getTextContent());
                        registro = elemento.getElementsByTagName("REGISTRO").item(0).getTextContent();
                        System.out.println("DPI " + elemento.getElementsByTagName("DPI").item(0).getTextContent());
                        dpi = elemento.getElementsByTagName("DPI").item(0).getTextContent();
                        System.out.println("TELEFONO " + elemento.getElementsByTagName("TELEFONO").item(0).getTextContent());
                        telefono = elemento.getElementsByTagName("TELEFONO").item(0).getTextContent();
                        System.out.println("EXAMEN " + elemento.getElementsByTagName("EXAMEN").item(0).getTextContent());
                        tipoExamen = elemento.getElementsByTagName("EXAMEN").item(0).getTextContent();
                        System.out.println("CORREO " + elemento.getElementsByTagName("CORREO").item(0).getTextContent());
                        email = elemento.getElementsByTagName("CORREO").item(0).getTextContent();
                        System.out.println("TRABAJO " + elemento.getElementsByTagName("TRABAJO").item(0).getTextContent());
                        System.out.println("TRABAJOF " + elemento.getElementsByTagName("TRABAJOF").item(0).getTextContent());
                        fechaInicioTrabajo = elemento.getElementsByTagName("TRABAJOF").item(0).getTextContent();
                        System.out.println("PASSWORD " + elemento.getElementsByTagName("PASSWORD").item(0).getTextContent());
                        contraseña = elemento.getElementsByTagName("PASSWORD").item(0).getTextContent();
                        try {
                            modeloLaboratorista.agregarLaboratorista(codigo, nombre, registro, dpi, telefono, tipoExamen, email, fechaInicioTrabajo, contraseña);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                        NodeList dias = elemento.getElementsByTagName("DIA");
                        for (int j = 0; j < dias.getLength(); j++) {
                            String diaLab = "";
                            Node nodo1 = dias.item(j);
                            if (nodo1.getNodeType() == nodo1.ELEMENT_NODE) {
                                Element dia = (Element) nodo1;
                                System.out.println("dia> " + dia.getTextContent());
                                diaLab = dia.getTextContent();
                                try {
                                    modeloLaboratorista.agregarDiasTrabajoLaboratorista(diaLab, codigo);
                                    System.out.println("dias de trabajo agregado");
                                } catch (SQLException e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("dias de trabajo no agregado");
                                }
                            }

                        }

                    }
                    System.out.println("");
                }

                System.out.println("");
                System.out.println("PACIENTES");
                NodeList listaPaciente = document.getElementsByTagName("paciente");
                for (int i = 0; i < listaPaciente.getLength(); i++) {
                    String codigo = "";
                    String nombre = "";
                    String sexo = "";
                    String fechaNacimiento = "";
                    String dpi = "";
                    String telefono = "";
                    String peso = "";
                    String tipoSangre = "";
                    String email = "";
                    String contraseña = "";
                    Node nodo = listaPaciente.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        System.out.println("NOMBRE " + elemento.getElementsByTagName("NOMBRE").item(0).getTextContent());
                        nombre = elemento.getElementsByTagName("NOMBRE").item(0).getTextContent();
                        System.out.println("SEXO " + elemento.getElementsByTagName("SEXO").item(0).getTextContent());
                        sexo = elemento.getElementsByTagName("SEXO").item(0).getTextContent();
                        System.out.println("BIRTH " + elemento.getElementsByTagName("BIRTH").item(0).getTextContent());
                        fechaNacimiento = elemento.getElementsByTagName("BIRTH").item(0).getTextContent();
                        System.out.println("DPI " + elemento.getElementsByTagName("DPI").item(0).getTextContent());
                        dpi = elemento.getElementsByTagName("DPI").item(0).getTextContent();
                        System.out.println("TELEFONO " + elemento.getElementsByTagName("TELEFONO").item(0).getTextContent());
                        telefono = elemento.getElementsByTagName("TELEFONO").item(0).getTextContent();
                        System.out.println("PESO " + elemento.getElementsByTagName("PESO").item(0).getTextContent());
                        peso = elemento.getElementsByTagName("PESO").item(0).getTextContent();
                        System.out.println("SANGRE " + elemento.getElementsByTagName("SANGRE").item(0).getTextContent());
                        tipoSangre = elemento.getElementsByTagName("SANGRE").item(0).getTextContent();
                        System.out.println("CORREO " + elemento.getElementsByTagName("CORREO").item(0).getTextContent());
                        email = elemento.getElementsByTagName("CORREO").item(0).getTextContent();
                        System.out.println("PASSWORD " + elemento.getElementsByTagName("PASSWORD").item(0).getTextContent());
                        contraseña = elemento.getElementsByTagName("PASSWORD").item(0).getTextContent();
                        try {
                            modeloPaciente.agregarPaciente(codigo, nombre, sexo, fechaNacimiento, dpi, telefono, peso, tipoSangre, email, contraseña);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    System.out.println("");
                }
                System.out.println("EXAMENES");
                NodeList listaExamenes = document.getElementsByTagName("examen");
                for (int i = 0; i < listaExamenes.getLength(); i++) {
                    String codigo = "";
                    String nombre = "";
                    String orden = "";
                    String descripcion = "";
                    String costo = "";
                    String informeTipo = "";
                    Node nodo = listaExamenes.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        System.out.println("NOMBRE " + elemento.getElementsByTagName("NOMBRE").item(0).getTextContent());
                        nombre = elemento.getElementsByTagName("NOMBRE").item(0).getTextContent();
                        System.out.println("ORDEN " + elemento.getElementsByTagName("ORDEN").item(0).getTextContent());
                        orden = elemento.getElementsByTagName("ORDEN").item(0).getTextContent();
                        System.out.println("DESCRIPCION " + elemento.getElementsByTagName("DESCRIPCION").item(0).getTextContent());
                        descripcion = elemento.getElementsByTagName("DESCRIPCION").item(0).getTextContent();
                        System.out.println("COSTO " + elemento.getElementsByTagName("COSTO").item(0).getTextContent());
                        costo = elemento.getElementsByTagName("COSTO").item(0).getTextContent();
                        System.out.println("INFORME " + elemento.getElementsByTagName("INFORME").item(0).getTextContent());
                        informeTipo = elemento.getElementsByTagName("INFORME").item(0).getTextContent();
                        try {
                            modeloExamnen.agregarExamen(codigo, nombre, esVerdadero(orden), descripcion, costo, informeTipo);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("REPORTES");
                NodeList listaReportes = document.getElementsByTagName("reporte");
                for (int i = 0; i < listaReportes.getLength(); i++) {
                    String codigo = "";
                    String codigoPaciente = "";
                    String codigoMedico = "";
                    String informe = "";
                    String fecha = "";
                    String hora = "";
                    Node nodo = listaReportes.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        System.out.println("PACIENTE " + elemento.getElementsByTagName("PACIENTE").item(0).getTextContent());
                        System.out.println("MEDICO " + elemento.getElementsByTagName("MEDICO").item(0).getTextContent());
                        System.out.println("INFORME " + elemento.getElementsByTagName("INFORME").item(0).getTextContent());
                        System.out.println("FECHA " + elemento.getElementsByTagName("FECHA").item(0).getTextContent());
                        System.out.println("HORA " + elemento.getElementsByTagName("HORA").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        codigoPaciente = elemento.getElementsByTagName("PACIENTE").item(0).getTextContent();
                        codigoMedico = elemento.getElementsByTagName("MEDICO").item(0).getTextContent();
                        informe = elemento.getElementsByTagName("INFORME").item(0).getTextContent();
                        fecha = elemento.getElementsByTagName("FECHA").item(0).getTextContent();
                        hora = elemento.getElementsByTagName("HORA").item(0).getTextContent();
                        try {
                            modeloReporte.agregarReporte(codigo, codigoPaciente, codigoMedico, informe, fecha, hora);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.println("");
                }
                System.out.println("RESULTADOS");
                NodeList listaResultados = document.getElementsByTagName("resultado");
                for (int i = 0; i < listaResultados.getLength(); i++) {

                    String codigo = "";
                    String codigoPaciente = "";
                    String codigoExamen = "";
                    String codigoLaboratorista = "";
                    String ordenPath = "";
                    String informePath = "";
                    String fecha = "";
                    String hora = "";
                    Node nodo = listaResultados.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        System.out.println("PACIENTE " + elemento.getElementsByTagName("PACIENTE").item(0).getTextContent());
                        System.out.println("EXAMEN " + elemento.getElementsByTagName("EXAMEN").item(0).getTextContent());
                        System.out.println("LABORATORISTA " + elemento.getElementsByTagName("LABORATORISTA").item(0).getTextContent());
                        System.out.println("ORDEN " + elemento.getElementsByTagName("ORDEN").item(0).getTextContent());
                        System.out.println("INFORME " + elemento.getElementsByTagName("INFORME").item(0).getTextContent());
                        System.out.println("FECHA " + elemento.getElementsByTagName("FECHA").item(0).getTextContent());
                        System.out.println("HORA " + elemento.getElementsByTagName("HORA").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        codigoPaciente = elemento.getElementsByTagName("PACIENTE").item(0).getTextContent();
                        codigoExamen = elemento.getElementsByTagName("EXAMEN").item(0).getTextContent();
                        codigoLaboratorista = elemento.getElementsByTagName("LABORATORISTA").item(0).getTextContent();
                        ordenPath = elemento.getElementsByTagName("ORDEN").item(0).getTextContent();
                        informePath = elemento.getElementsByTagName("INFORME").item(0).getTextContent();
                        fecha = elemento.getElementsByTagName("FECHA").item(0).getTextContent();
                        hora = elemento.getElementsByTagName("HORA").item(0).getTextContent();
                        try {
                            modeloResultado.agregarResultado(codigo, codigoPaciente, codigoExamen, codigoLaboratorista, ordenPath, informePath, fecha, hora);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("CITAS");
                NodeList listaCitas = document.getElementsByTagName("cita");
                for (int i = 0; i < listaCitas.getLength(); i++) {
                    String codigo = "";
                    String codigoPaciente = "";
                    String codigoMedico = "";
                    String especialidad = "";
                    String fecha = "";
                    String hora = "";
                    Node nodo = listaCitas.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("codigo " + elemento.getElementsByTagName("CODIGO").item(0).getTextContent());
                        System.out.println("PACIENTE " + elemento.getElementsByTagName("PACIENTE").item(0).getTextContent());
                        System.out.println("MEDICO " + elemento.getElementsByTagName("MEDICO").item(0).getTextContent());
                        System.out.println("Especialidad " + elemento.getElementsByTagName("ESPECIALIDAD").item(0).getTextContent());
                        System.out.println("FECHA " + elemento.getElementsByTagName("FECHA").item(0).getTextContent());
                        System.out.println("HORA " + elemento.getElementsByTagName("HORA").item(0).getTextContent());
                        codigo = elemento.getElementsByTagName("CODIGO").item(0).getTextContent();
                        codigoPaciente = elemento.getElementsByTagName("PACIENTE").item(0).getTextContent();
                        codigoMedico = elemento.getElementsByTagName("MEDICO").item(0).getTextContent();
                        especialidad = elemento.getElementsByTagName("ESPECIALIDAD").item(0).getTextContent();
                        fecha = elemento.getElementsByTagName("FECHA").item(0).getTextContent();
                        hora = elemento.getElementsByTagName("HORA").item(0).getTextContent();
                        try {
                            modeloCita.agregarCita(codigo, codigoPaciente, codigoMedico, especialidad, fecha, hora);

                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("CONSULTAS");

                NodeList listaConsultas = document.getElementsByTagName("consulta");
                for (int i = 0; i < listaConsultas.getLength(); i++) {
                    String tipoConsulta = "";
                    String costo = "";
                    Node nodo = listaConsultas.item(i);
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nodo;
                        System.out.println("TIPO " + elemento.getElementsByTagName("TIPO").item(0).getTextContent());
                        System.out.println("COSTO " + elemento.getElementsByTagName("COSTO").item(0).getTextContent());
                        tipoConsulta = elemento.getElementsByTagName("TIPO").item(0).getTextContent();
                        costo = elemento.getElementsByTagName("COSTO").item(0).getTextContent();
                        try {
                            modeloConsulta.agregarConsulta(tipoConsulta, costo);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("");
                }

            }

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getSuppressed());
        }

    }

    public boolean esVerdadero(String valor) {
        return (valor.equalsIgnoreCase("true"));
    }
}
