package pregunta1;
import java.util.HashMap;

public class administrador {
    private String nombre;
    private String codigo;

    public administrador{

        private String nombre;
        private String codigo;

        public administrador(){}

        public void numeroDeVehiculos(){
            HasMap<Integer, vehiculo> auto = Pasaje.getInstance().getAutos();
            int numVehiculo = Pasaje.getInstance().getNumeroVehiculo();

            system.out.println("nombre de vehiculo"+nombreVehiculo);
            system.out.println("lista de autos");
            for(Integer num : autos.keySet()){
                autos.get(num.showVehiculo());
            }

        }
        public void obtenerSaldoCaseta(){
            int saldo = Peaje.getInstance().getSaldo();
            system.out.println("saldo"+saldo);
        }
    }
}