package controller;

import model.Paciente;
import service.PacienteService;
import java.util.List;

public class PacienteController {

    private PacienteService service = new PacienteService();

    public String registrar(String dni, String nombre, int edad) {
        Paciente p = new Paciente(dni, nombre, edad);

        boolean exito = service.registrarPaciente(p);

        return exito ? "Paciente registrado correctamente"
                : "Error: DNI ya existe";
    }

    public List<Paciente> listar() {
        return service.listarPacientes();
    }

//    public List<Paciente> buscar(String nombre) {
//        return service.buscarPorNombre(nombre);
//    }
    public Paciente buscarPorDni(String dni) {
        return service.buscarPorDni(dni);
    }
}
