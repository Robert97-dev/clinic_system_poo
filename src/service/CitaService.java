package service;

import model.Cita;
import model.Paciente;
import model.Doctor;
import repository.CitaRepository;

import java.util.List;

public class CitaService {

    private CitaRepository repository = new CitaRepository();

    public void registrarCita(Cita cita) {
        repository.guardar(cita);
    }

    public List<Cita> listarCitas() {
        return repository.obtenerTodas();
    }
}
