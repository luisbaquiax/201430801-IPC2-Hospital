<%-- 
    Document   : nuevoLaboratorista
    Created on : 30/06/2021, 00:28:52
    Author     : luis
--%>

<div class="modal fade" id="agregarLaboratoristaModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-secondary text-white">
                <h5 class="modal-title">Agregar Laboratorista</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/ControladorLaboratorista?tarea=insertar"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->

                <div class="modal-body">
                    <div class="form-group">
                        <label for="codigo">Codigo</label>
                        <input type="text" class="form-control" name="codigo" required placeholder="45 carácteres máximo">
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required>
                    </div>
                    <div class="form-group">
                        <label for="registro">Registro</label>
                        <input type="text" class="form-control" name="registro" required>
                    </div>
                    <div class="form-group">
                        <label for="dpi">DPI</label>
                        <input type="text" class="form-control" id="dpi" name="dpi" required placeholder="Debe ser 13 dígitos" pattern="[0-9]{13}" title="Debe ser 13 digitos">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="text" class="form-control" name="telefono" required placeholder="Debe ser 8 dígitos" pattern="[0-9]{8}" title="Debe ser 8 dígitos">
                    </div>
                    <div class="form-group">
                        <label for="tipoExamen">Tipo de examen</label>
                        <input type="text" class="form-control" name="tipoExamen" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required>
                    </div>
                    <div class="form-group">
                        <label for="fechaInicioTrabajo">Fecha en que inició a trabajar</label>
                        <input type="date" class="form-control" name="fechaInicioTrabajo" required>
                    </div>
                    <div class="form-group">
                        <label for="diasTrabajo">Días de trabajo / jornada</label>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Lunes" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Lunes</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Martes" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Martes</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Miércoles" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Miércoles</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Jueves" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Jueves</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Viernes" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Viernes</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Sábado" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Sábado</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="dia" value="Domingo" id="defaultCheck1">
                            <label class="form-check-label text-dark" for="defaultCheck1">Domingo</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="contraseña">Contraseña</label>
                        <input type="text" class="form-control" name="contraseña" required placeholder="45 carácteres máximo" title="45 carácteres máximo">
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="reset">Borrar datos</button>
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>

            </form>
        </div>
    </div>
</div>