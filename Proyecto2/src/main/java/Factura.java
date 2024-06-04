package src.main.java;

public class Factura {
    private String numero;
    private String descripcion;
    private int cantidadComprada;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numero, String descripcion, int cantidadComprada, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidadComprada = Math.max(0, cantidadComprada);
        this.precioPorArticulo = Math.max(0.0, precioPorArticulo);
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = Math.max(0, cantidadComprada);
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = Math.max(0.0, precioPorArticulo);
    }

    // Método para calcular el total de la factura
    public double getTotalFactura() {
        return cantidadComprada * precioPorArticulo;
    }

    // Clase de prueba para Factura
    public static class FacturaTest {
        public static void main(String[] args) {
            Factura factura = new Factura("001", "Monitor", 2, 150.0);
            System.out.println("Número de factura: " + factura.getNumero());
            System.out.println("Descripción: " + factura.getDescripcion());
            System.out.println("Cantidad comprada: " + factura.getCantidadComprada());
            System.out.println("Precio por artículo: " + factura.getPrecioPorArticulo());
            System.out.println("Total de la factura: " + factura.getTotalFactura());
        }
    }
}