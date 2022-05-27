package primerParcialPatrones.pregunta5;

public class Cliente {
    public static void main (String []args){
        String interpretar="1 sumar 2 restar 2 sumar 1 sumar 1";

        NoTerminalExpresion parser = new NoTerminalExpresion(interpretar);

        System.out.println("Interpretar: "+interpretar);
        System.out.println("Operación: "+parser.interpretar());
    }
}
