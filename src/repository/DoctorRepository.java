package repository;

import model.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepository {

    private List<Doctor> doctores = new ArrayList<>();

    public void guardar(Doctor doctor) {
        doctores.add(doctor);
    }

    public List<Doctor> obtenerTodos() {
        return doctores;
    }
}
