package pe.edu.cibertec.t1_auqui_backend.service.interfaces;

import pe.edu.cibertec.t1_auqui_backend.dto.VehiculoRequest;

import java.io.IOException;

public interface VehiculoService {
    String[] buscarVehiculo(VehiculoRequest request) throws IOException;
}
