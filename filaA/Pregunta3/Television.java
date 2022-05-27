package primerParcialPatrones.pregunta3;
public class Television implements IArtefactoElectronico{
    private String precio;

    public Television() {
    }


    @Override
    public void crear() {
        System.out.println("Precio:"+precio);
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
