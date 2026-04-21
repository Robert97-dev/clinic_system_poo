package ui;

import controller.*;
import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PacienteController pacienteCtrl = new PacienteController();
        DoctorController doctorCtrl = new DoctorController();
        CitaController citaCtrl = new CitaController();

        while (true) {
            System.out.println("\n=== SISTEMA CLÍNICA ===");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar doctor");
            System.out.println("3. Crear cita");
            System.out.println("4. Listar pacientes");
            System.out.println("5. Listar doctores");
            System.out.println("6. Listar citas");
            System.out.println("7. Salir");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.println(pacienteCtrl.registrar(dni, nombre, edad));
                }

                case 2 -> {
                    System.out.print("ID Doctor: ");
                    String id = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Especialidad: ");
                    String esp = sc.nextLine();

                    doctorCtrl.registrar(id, nombre, esp);
                    System.out.println("Doctor registrado");
                }

                case 3 -> {
                    System.out.print("ID Cita: ");
                    String idCita = sc.nextLine();

                    System.out.print("DNI Paciente: ");
                    String dni = sc.nextLine();

                    System.out.print("ID Doctor: ");
                    String idDoctor = sc.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    // buscar paciente y doctor
                    Paciente paciente = pacienteCtrl.listar()
                            .stream()
                            .filter(p -> p.getDni().equals(dni))
                            .findFirst()
                            .orElse(null);

                    Doctor doctor = doctorCtrl.listar()
                            .stream()
                            .filter(d -> d.getId().equals(idDoctor))
                            .findFirst()
                            .orElse(null);

                    System.out.println(
                        citaCtrl.registrar(idCita, paciente, doctor, fecha, hora)
                    );
                }

                case 4 -> pacienteCtrl.listar()
                        .forEach(p -> System.out.println(p.getNombre()));

                case 5 -> doctorCtrl.listar()
                        .forEach(d -> System.out.println(d.getNombre()));

                case 6 -> citaCtrl.listar()
                        .forEach(c ->
                            System.out.println(
                                c.getPaciente().getNombre() + " - " +
                                c.getDoctor().getNombre() + " - " +
                                c.getFecha() + " " + c.getHora()
                            )
                        );

                case 7 -> {
                    System.out.println("Saliendo...");
                    return;
                }
            }
        }
    }
}

