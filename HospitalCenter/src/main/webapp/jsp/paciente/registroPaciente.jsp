<%-- 
    Document   : registroPaciente
    Created on : 22/06/2021, 01:15:55
    Author     : luis
--%>

<div class="modal fade" id="agregarPacienteModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Enviar Solicitud</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/ControladorPaciente?tarea=enviar"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->

                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required placeholder="Nombre">
                    </div>
                    <div class="form-group">
                        <label for="sexo">Sexo</label>
                        <select class="form-control form-select form-select-sm" aria-label=".form-select-sm example" required="" name="sexo">
                            <option value="MASCULINO">MASCULINO</option>
                            <option value="FEMENINO">FEMENINO</option>
                        </select>

                    </div>
                    <div class="form-group">
                        <label for="birthday">Fecha de nacimiento</label>
                        <input type="date" class="form-control" name="birthday" required>
                    </div>
                    <div class="form-group">
                        <label for="dpi">DPI</label>
                        <input type="number" class="form-control" min="0" name="dpi" required placeholder="8 car�cteres">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Tel�fono</label>
                        <input type="number" class="form-control" min="0" name="telefono" required placeholder="N�mero de tel�fono">
                    </div>
                    <div class="form-group">
                        <label for="peso">Peso (en kg)</label>
                        <input type="number" class="form-control" min="1" name="peso" required>
                    </div>
                    <div class="form-group">
                        <label for="sangre">Tipo de sangre</label>
                        <input type="text" class="form-control" name="sangre" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Direcci�n de correo el�ctronico</label>
                        <input type="email" class="form-control" name="email" required>
                    </div>
                    <div class="form-group">
                        <label for="contrase�a">Contrase�a</label>
                        <input type="text" class="form-control" name="contrase�a" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="reset">Borrar datos</button>
                    <button class="btn btn-primary" type="submit">Enviar solicitud</button>
                </div>    
            </form>
        </div>
    </div>
</div>
