package src.main.java;

public class Auto {
    private String modelo;
    private String color;
    private int año;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean tieneTransmisionAutomatica;

    // Constructor
    public Auto(String modelo, String color, int año, Marca marca, String chasis, Propietario propietario,
            int velocidadMaxima, int numeroPuertas, boolean tieneTechoSolar, int numeroMarchas,
            boolean tieneTransmisionAutomatica) {
        if (modelo == null || color == null || marca == null || chasis == null || propietario == null) {
            throw new IllegalArgumentException("Los datos del auto no pueden estar vacíos");
        }
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    // Método para acelerar el auto
    public void acelerar() {
        if (velocidadActual < velocidadMaxima) {
            velocidadActual += 1;
        }
    }

    // Método para frenar el auto
    public void frenar() {
        velocidadActual = 0;
    }

    // Método para cambiar de marcha
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha < 0 || nuevaMarcha > numeroMarchas) {
            throw new IllegalArgumentException("Marcha inválida");
        }
        // No se puede cambiar a marcha atrás si la velocidad es mayor que 0
        if (nuevaMarcha == -1 && velocidadActual > 0) {
            throw new IllegalArgumentException(
                    "No se puede engranar la marcha atrás si la velocidad supera los 0 km/h");
        }
        // Aquí deberías implementar la lógica de cambio de marchas
    }

    // Método para reducir la marcha
    public void reducirMarcha(int marchaActual) {
        if (marchaActual <= 0) {
            throw new IllegalArgumentException("Marcha inválida");
        }
        // Aquí deberías implementar la lógica de reducción de marchas
    }

    // Método para calcular la autonomía de viaje
    public double calcularAutonomia(double consumoMedio, double volumenCombustible) {
        return volumenCombustible / consumoMedio;
    }

    // Método para mostrar el volumen de combustible
    public void mostrarVolumenCombustible(double volumenCombustible) {
        System.out.println("El volumen de combustible es: " + volumenCombustible + " litros");
    }
}
