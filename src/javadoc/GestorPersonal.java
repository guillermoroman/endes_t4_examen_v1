package javadoc;

import java.util.ArrayList;
import java.util.List;


public class GestorPersonal {


    private List<Empleado> empleados;


    public GestorPersonal() {
        empleados = new ArrayList<>();
    }


    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }


    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }


    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }


    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
