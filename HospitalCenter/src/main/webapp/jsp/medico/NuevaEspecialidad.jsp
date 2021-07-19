<%-- 
    Document   : NuevaEspecialidad
    Created on : 14/07/2021, 01:50:56
    Author     : luis
--%>

<div class="modal fade" id="agregarEspecialidadModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-secondary text-white">
                <h5 class="modal-title"><i class="fas fa-user-md pr-3"></i>Agregar Especialidad</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/controladorMedico?tarea=agregarEspecialidad"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->
                <div class="form-group">
                    <label for="especialidad">Agregar especialidad</label>
                    <input type="text" class="form-control" name="especialidad" required placeholder="Escribe la especialidad del médico">
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="reset">Borrar datos</button>
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>

            </form>
        </div>
    </div>
</div>