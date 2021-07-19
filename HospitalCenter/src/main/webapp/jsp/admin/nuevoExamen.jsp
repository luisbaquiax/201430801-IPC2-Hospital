<%-- 
    Document   : nuevoExamen
    Created on : 30/06/2021, 01:43:43
    Author     : luis
--%>

<div class="modal fade" id="agregarExamenModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-secondary text-white">
                <h5 class="modal-title"><i class="fas fa-stethoscope pr-3"></i>Crear examen de laboratorio</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/controladorExamen?tarea=nuevo"
                  method="POST" class="was-validated">
                <!--class="was-validated" (sirve para validar los campos)-->

                <div class="modal-body">
                    <div class="form-group">
                        <label for="codigo">Codigo</label>
                        <input type="text" class="form-control" name="codigo" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre del exámen</label>
                        <input type="text" class="form-control" name="nombreExamen" required>
                    </div>
                    <div class="form-group">
                        <label>¿Requiere la orden de un médico?</label>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline1" name="orden" value="false" class="custom-control-input" required="">
                            <label class="custom-control-label text-dark" for="customRadioInline1">No</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline2" name="orden" value="true" class="custom-control-input bg-dark" required="">
                            <label class="custom-control-label text-dark" for="customRadioInline2">Sí</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="descripcion">Descripción del examen</label>
                        <textarea class="form-control is-invalid" id="validationTextarea" name="descripcion" placeholder="Descripción del examen" required></textarea>
                        <div class="invalid-feedback">
                            Por favor escribe aquí la descripción del examen.
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="costo">Costo del exámen</label>
                        <input type="number" class="form-control" name="costo" required min="0">
                    </div>
                    <div class="form-group">
                        <label for="email">Formato del examen</label>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="radio" name="formato" value="PDF" class="custom-control-input" required="">
                            <label class="custom-control-label text-dark" for="radio">PDF</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="radio2" name="formato" value="IMG" class="custom-control-input bg-dark" required="">
                            <label class="custom-control-label text-dark" for="radio2">IMG</label>
                        </div>
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
