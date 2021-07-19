<%-- 
    Document   : editarPerfil
    Created on : 18/07/2021, 01:10:05
    Author     : luis
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="modal fade" id="editarMedicoModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-warning text-white">
                <h5 class="modal-title"><i class="fas fa-edit pr-3"></i>Edición de perfil</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/controladorExamen?tarea=nuevo"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" value="${medico.nombre}" required >
                    </div>
                    <div class="form-group">
                        <label for="colegiado">Colegiado</label>
                        <input type="text" class="form-control" name="colegiado" value="${medico.colegiado}" required>
                    </div>
                    <div class="form-group">
                        <label for="dpi">DPI</label>
                        <input type="number" class="form-control" name="dpi" value="${medico.dpi}" required>
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="number" class="form-control" name="telefono" value="${medico.telefono}" required min="0">
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" value="${medico.email}" required>
                    </div>
                    <div class="form-group">
                        <label for="contraseña">Contraseña</label>
                        <input type="text" class="form-control" name="contraseña" value="${medico.contraseña}" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary w-100" type="submit">Guardar cambios</button>
                </div>
            </form>
        </div>
    </div>
</div>
