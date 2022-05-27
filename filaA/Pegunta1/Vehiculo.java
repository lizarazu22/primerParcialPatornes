package primerParcialPatrones.pregunta1;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;

    public Vehiculo(){}
    public Vehiculo(String placa, String modelo, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return kilometraje;
    }

    public void setColor(String color) {
        this.colore = color;
    }

    public void showVehiculo(){
        System.out.println("************************************");
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("color: "+color);
    }
}
