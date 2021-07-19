<%-- 
    Document   : nuevoMedico
    Created on : 28/06/2021, 02:13:36
    Author     : luis
--%>

<div class="modal fade" id="agregarMedicoModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-secondary text-white">
                <h5 class="modal-title"><i class="fas fa-user-nurse pr-3"></i>Agregar médico</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/controladorMedico?tarea=insertar"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->

                <div class="modal-body">
                    <div class="form-group">
                        <label for="codigo">Codigo</label>
                        <input type="text" class="form-control" name="codigo" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required>
                    </div>
                    <div class="form-group">
                        <label for="colegiado">Colegiado</label>
                        <input type="text" class="form-control" name="colegiado" required>
                    </div>
                    <div class="form-group">
                        <label for="especialidad">Agregar especialidad</label>
                        <input type="text" class="form-control" name="especialidad" required placeholder="Escribe la especialidad del médico">
                    </div>
                    <div class="form-group">
                        <label for="dpi">DPI</label>
                        <input type="number" class="form-control" name="dpi" required>
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="number" class="form-control" name="telefono" required min="0">
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required>
                    </div>
                    <div class="form-group">
                        <label for="horarioInicio">Horario de Inicio</label>
                        <input type="time" class="form-control" name="horarioInicio" required>
                    </div>
                    <div class="form-group">
                        <label for="horarioFin">Horario final</label>
                        <input type="time" class="form-control" name="horarioFin" required>
                    </div>
                    <div class="form-group">
                        <label for="fechaInicioTrabajo">Fecha en que inició a trabajar</label>
                        <input type="date" class="form-control" name="fechaInicioTrabajo" required>
                    </div>
                    <div class="form-group">
                        <label for="contraseña">Contraseña</label>
                        <input type="text" class="form-control" name="contraseña" required>
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
