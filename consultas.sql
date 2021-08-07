SELECT * FROM MEDICO C, TITULO T WHERE C.CODIGO = T.codigo_medico;
SELECT * FROM MEDICO C, TITULO T WHERE C.CODIGO = T.codigo_medico AND C.nombre = 'Luis';  //buscar medico por nombre
SELECT * FROM MEDICO C, TITULO T WHERE C.CODIGO = T.codigo_medico AND C.nombre LIKE '%L%'; // buscar medico por nombre like

//MEDICO - REPORTE
//CITAS EN UN INTERVALO DE TIEMPO
SELECT * FROM CITA WHERE fecha BETWEEN '2020-10-21' AND '2020-10-31' AND codigo_medico = 'MED-768876';

//CITAS DE HOY
SELECT * FROM CITA WHERE fecha = '2020-10-21' AND codigo_medico = 'MED-768876';

//Los pacientes con mayor cantidad de informes médicos dentro de un intervalo de tiempo.
/*PRIMERA OPCION*/
SELECT COUNT(informe), codigo_paciente
FROM REPORTE WHERE fecha BETWEEN '2019-10-21' AND '2020-10-31'
GROUP BY codigo_paciente ORDER BY COUNT(informe) DESC;

/*SEGUDNA OPCION*/ //inclye el medico en cuestión, el presete médico
SELECT COUNT(informe), codigo_paciente
FROM REPORTE WHERE fecha BETWEEN '2019-10-21' AND '2020-10-31' AND codigo_medico = 'MED-691286'
GROUP BY codigo_paciente ORDER BY COUNT(informe) DESC;

LABORATORISTA - REPORTE
/*Reporte de exámenes a realizarse en su turno del día */

/*Reporte de las 10 fechas con más trabajo realizado */
SELECT COUNT(codigo_laboratorista), fecha, codigo_laboratorista
FROM RESULTADO WHERE codigo_laboratorista = 'LAB-253'
GROUP BY fecha, codigo_laboratorista ORDER BY codigo_laboratorista DESC LIMIT 10;


PACIENTE - REPORTE
/* Últimos 5 exámenes de laboratorio realizados. */
SELECT * FROM RESULTADO WHERE codigo_paciente = '142476' order by fecha DESC LIMIT 5;
/*Exámenes realizados de un tipo en específico dentro de un intervalo de tiempo. */
SELECT * FROM RESULTADO WHERE codigo_examen = '736' AND fecha BETWEEN '2014-09-16' AND '2020-12-25' AND codigo_paciente = '857808';

