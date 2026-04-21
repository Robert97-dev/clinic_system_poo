package model;

public class Cita {
    private String id;
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;

    public Cita(String id, Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.id = id;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
