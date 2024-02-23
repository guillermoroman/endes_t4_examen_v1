package javadoc;

public class Empleado {
    // Atributos de la clase
    private String nombre;
    private String id;
    private double sueldo;



    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getId() {
        return id;
    }



    public double getSueldo() {
        return sueldo;
    }



    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }


    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
