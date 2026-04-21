package controller;

import model.Cita;
import model.Paciente;
import model.Doctor;
import service.CitaService;

import java.util.List;

public class CitaController {

    private CitaService service = new CitaService();

    public String registrar(String id, Paciente paciente, Doctor doctor,
                             String fecha, String hora) {

        if (paciente == null || doctor == null) {
            return "Error: paciente o doctor no válido";
        }

        Cita cita = new Cita(id, paciente, doctor, fecha, hora);
        service.registrarCita(cita);

        return "Cita registrada correctamente";
    }

    public List<Cita> listar() {
        return service.listarCitas();
    }
}
