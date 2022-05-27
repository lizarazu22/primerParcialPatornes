package primerParcialPatrones.pregunta1;
public class Conductor {

    private String nombreConductor;
    private Vehiculo vehiculo;

    public Conductor(){
        this.vehiculo = new Vehiculo("","","");
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void pagarPeaje(int amount, Vehiculo vehiculo){
        Peaje.getInstance().cobroPeaje(amount,vehiculo);
    }
}
