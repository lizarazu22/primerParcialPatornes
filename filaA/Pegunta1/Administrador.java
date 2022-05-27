package primerParcialPatrones.pregunta1;

import java.util.HashMap;

public class Administrador {

    private String nombre;
    private String codigo;

    public  Administrador(){}


    public void numeroDeVehiculos(){
        HashMap<Integer, Vehiculo> autos = Peaje.getInstance().getAutos();
        int numVehiculos = Peaje.getInstance().getNumeroVehiculos();

        System.out.println("Numero de vehiculos: "+numVehiculos);
        System.out.println("Lista de autos: ");
        for(Integer num : autos.keySet()){
            autos.get(num).showVehiculo();
        }
    }
    public void obtenerSaldoCaseta(){
        int saldo= Peaje.getInstance().getSaldo();
        System.out.println("Saldo acumulado: "+saldo);
    }
}
