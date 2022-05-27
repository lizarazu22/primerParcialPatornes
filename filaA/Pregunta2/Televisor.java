package primerParcialPatrones.pregunta2;
public class Televisor implements ITelevisor{
    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private int pulgadas;
    private int resolución ;
    private boolean hdmi;
    private int puertosUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Object clone() {
        Televisor t=new Televisor();
        t.setSistemaOperativo(this.sistemaOperativo);
        t.setVersionSistemaOperativo(this.versionSistemaOperativo);
        t.setPulgadas(this.pulgadas);
        t.setResolución(this.resolución);
        t.setHdmi(this.hdmi);
        t.setPuertosUsb(this.puertosUsb);
        t.setBluetooth(this.bluetooth);
        t.setControlRemoto(this.controlRemoto);
        t.setSerial(this.serial);
        return t;
    }
    public void showInformation(){
        System.out.println("****************************************");
        System.out.println("Sistema operativo:"+sistemaOperativo);
        System.out.println("Version Sistema operativo:"+versionSistemaOperativo);
        System.out.println("Pulgadas:"+pulgadas);
        System.out.println("Resolucióno:"+resolución);
        System.out.println("Hdmi:"+hdmi);
        System.out.println("Numero puertos Usb:"+puertosUsb);
        System.out.println("Bluetooth:"+bluetooth);
        System.out.println("Control remoto:"+controlRemoto);
        System.out.println("Serial:"+serial);

    }
}
