package src.main.java;

public class Direccion {
    private String calle;
    private String barrio;
    private String ciudad;

    // Constructor
    public Direccion(String calle, String barrio, String ciudad) {
        if (calle == null || barrio == null || ciudad == null) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}