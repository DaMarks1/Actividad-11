public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public Vehiculo(String marca, int anioFabricacion) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String mostrarInformacion() {
        return "Marca: " + marca + " Modelo: " + modelo + " Año de fabricación: " + anioFabricacion;
    }
}
