package service;

import model.Paciente;
import repository.PacienteRepository;
import java.util.List;

public class PacienteService {

    private PacienteRepository repository = new PacienteRepository();

    public boolean registrarPaciente(Paciente paciente) {

        // Validación: DNI único
        for (Paciente p : repository.obtenerTodos()) {
            if (p.getDni().equals(paciente.getDni())) {
                return false; // duplicado
            }
        }

        repository.guardar(paciente);
        return true;
    }

    public List<Paciente> listarPacientes() {
        return repository.obtenerTodos();
    }

    public Paciente buscarPorDni(String dni) {
        return repository.obtenerTodos()
                .stream()
                .filter(p -> p.getDni().equals(dni))
                .findFirst()
                .orElse(null);
    }
}
