package repository;

import model.Cita;
import java.util.ArrayList;
import java.util.List;

public class CitaRepository {

    private List<Cita> citas = new ArrayList<>();

    public void guardar(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> obtenerTodas() {
        return citas;
    }
}
