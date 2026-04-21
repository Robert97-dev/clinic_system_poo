package service;

import model.Doctor;
import repository.DoctorRepository;
import java.util.List;

public class DoctorService {

    private DoctorRepository repository = new DoctorRepository();

    public void registrarDoctor(Doctor doctor) {
        repository.guardar(doctor);
    }

    public List<Doctor> listarDoctores() {
        return repository.obtenerTodos();
    }

    public Doctor buscarPorId(String id) {
        return repository.obtenerTodos()
                .stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
