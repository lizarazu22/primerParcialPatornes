package primerParcialPatrones.pregunta2;

public class Cliente {
    public static void main (String []args){
        Televisor t1 =new Televisor();
        t1.setSistemaOperativo("Android");
        t1.setVersionSistemaOperativo("11.0");
        t1.setPulgadas(80);
        t1.setResolución(50);
        t1.setHdmi(true);
        t1.setPuertosUsb(4);
        t1.setControlRemoto(true);
        t1.setBluetooth(true);
        t1.setSerial("xxxxxxxxxx");

        Televisor t2=(Televisor) t1.clone();
        t2.setSerial("1284828394");
        Televisor t3=(Televisor) t1.clone();
        t3.setSerial("2343756767");
        Televisor t4=(Televisor) t1.clone();
        t4.setSerial("1653238394");
        Televisor t5=(Televisor) t1.clone();
        t5.setSerial("1233328394");
        Televisor t6=(Televisor) t1.clone();
        t6.setSerial("128489753X");

        t2.showInformation();
        t3.showInformation();
        t4.showInformation();
        t5.showInformation();
        t6.showInformation();
    }
}
