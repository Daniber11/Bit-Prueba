package src.main.java;

public class Propietario {
    private String nombre;
    private String fechaNacimiento;
    private Direccion direccion;

    // Constructor
    public Propietario(String nombre, String fechaNacimiento, Direccion direccion) {
        if (nombre == null || fechaNacimiento == null || direccion == null) {
            throw new IllegalArgumentException("Los datos del propietario no pueden estar vacíos");
        }
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}