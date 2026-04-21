package controller;

import model.Doctor;
import service.DoctorService;
import java.util.List;

public class DoctorController {

    private DoctorService service = new DoctorService();

    public void registrar(String id, String nombre, String especialidad) {
        service.registrarDoctor(new Doctor(id, nombre, especialidad));
    }

    public List<Doctor> listar() {
        return service.listarDoctores();
    }

    public Doctor buscar(String id) {
        return service.buscarPorId(id);
    }
}
