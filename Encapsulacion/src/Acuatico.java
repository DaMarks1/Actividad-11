public class Acuatico extends Vehiculo{
    private int num_motor;
    public Acuatico(String marca, String modelo, int anioFabricacion, int num_motor) {
        super(marca, modelo, anioFabricacion);
        this.num_motor = num_motor;
    }

    public int getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(int num_motor) {
        this.num_motor = num_motor;
    }
    @Override
    public String mostrarInformacion(){
        return "Marca: " + super.getMarca() + " Modelo: "+ super.getModelo() + " Año de fabricación: "+ super.getAnioFabricacion() + " Número de motores: " + num_motor;
    }

}

