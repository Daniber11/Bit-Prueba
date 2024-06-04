package src.main.java;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = Math.max(0.0, salarioMensual);
        contadorEmpleados++;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = Math.max(0.0, salarioMensual);
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    // Clase de prueba para Empleado
    public static class EmpleadoTest {
        public static void main(String[] args) {
            Empleado empleado1 = new Empleado("Juan", "Pérez", 2500);
            Empleado empleado2 = new Empleado("Ana", "García", 3000);

            System.out.println("Salario de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": "
                    + empleado1.getSalarioMensual());
            System.out.println("Salario de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": "
                    + empleado2.getSalarioMensual());

            empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
            empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

            System.out.println("Salario anual de " + empleado1.getNombre() + " " + empleado1.getApellido()
                    + " después del aumento: " + (empleado1.getSalarioMensual() * 12));
            System.out.println("Salario anual de " + empleado2.getNombre() + " " + empleado2.getApellido()
                    + " después del aumento: " + (empleado2.getSalarioMensual() * 12));

            System.out.println("Número de empleados: " + Empleado.getContadorEmpleados());
        }
    }
}