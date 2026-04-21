🏥 Sistema de Gestión de Citas Médicas
📌 Descripción
Este proyecto consiste en el desarrollo de un sistema de gestión de citas médicas implementado en Java, aplicando principios de Programación Orientada a Objetos y una arquitectura por capas (Controller, Service, Repository, Model).
El sistema permite administrar pacientes, doctores y citas médicas, optimizando procesos que comúnmente se realizan de forma manual en clínicas pequeñas o consultorios.
________________________________________
🚀 Funcionalidades principales
•	✅ Registro de pacientes con validación de DNI único
•	🔍 Búsqueda de pacientes por nombre (coincidencia parcial)
•	👨‍⚕️ Registro de doctores
•	📅 Creación de citas médicas
•	📋 Listado de pacientes, doctores y citas
•	❌ Validación de errores (datos inexistentes o duplicados)
________________________________________
🧠 Arquitectura del sistema
El proyecto sigue una arquitectura basada en capas:
model/        → Entidades (Paciente, Doctor, Cita)
repository/   → Acceso a datos (simulado en memoria)
service/      → Lógica de negocio
controller/   → Interacción entre UI y lógica
ui/           → Interfaz de usuario (consola)
🔄 Flujo de ejecución
Usuario → UI → Controller → Service → Repository → Datos
________________________________________
🛠️ Tecnologías utilizadas
•	Java (POO)
•	Stream API
•	Git & GitHub
•	IDE: NetBeans / IntelliJ IDEA
________________________________________
▶️ Cómo ejecutar el proyecto
1.	Clonar el repositorio:
git clone https://github.com/Robert97-dev/clinic_system_poo.git
2.	Abrir el proyecto en tu IDE
3.	Ejecutar la clase:
ui.Main
________________________________________
🧪 Ejemplo de uso
=== SISTEMA CLÍNICA ===
1. Registrar paciente
2. Registrar doctor
3. Crear cita

> 1
DNI: 12345678
Nombre: Juan Pérez
Edad: 30
Paciente registrado correctamente

> 3
Cita registrada correctamente
________________________________________
📊 Pruebas realizadas
El sistema fue validado mediante:
•	Registro exitoso de pacientes y doctores
•	Validación de duplicidad de DNI
•	Búsqueda de pacientes
•	Creación de citas con datos válidos e inválidos
________________________________________
⚠️ Limitaciones actuales
•	No cuenta con base de datos (persistencia en memoria)
•	Interfaz basada en consola
•	No valida conflictos de horario en citas
________________________________________
🚧 Mejoras futuras
•	Integración con base de datos (MySQL / PostgreSQL)
•	Desarrollo de API REST con Spring Boot
•	Implementación de interfaz gráfica o web
•	Sistema de autenticación de usuarios
________________________________________
👨‍💻 Autor
[Tu Nombre Aquí]
Estudiante de Ingeniería de Sistemas enfocado en desarrollo backend y buenas prácticas de software.
________________________________________
⭐ Valor del proyecto
Este proyecto demuestra:
•	Aplicación real de Programación Orientada a Objetos
•	Diseño de arquitectura escalable
•	Separación de responsabilidades
•	Implementación de lógica de negocio
________________________________________
📬 Contacto
Puedes contactarme a través de LinkedIn o GitHub para colaboraciones o oportunidades profesionales.
www.linkedin.com/in/robert-enrique-castro-diaz-893bb63aa
https://github.com/Robert97-dev
