package src.main.java;

public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int añoDeLanzamiento;
    private String codigoIdentificador;

    // Constructor
    public Marca(String nombre, int nrDeModelos, int añoDeLanzamiento, String codigoIdentificador) {
        if (nombre == null || codigoIdentificador == null) {
            throw new IllegalArgumentException("Los datos de la marca no pueden estar vacíos");
        }
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.añoDeLanzamiento = añoDeLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}