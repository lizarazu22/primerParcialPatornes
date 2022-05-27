package primerParcialPatrones.pregunta3;
public abstract class FactoryArtefactos {
    public enum artefacto{
        TELEVISION,
        RADIO,
        BATIDORA,
        REFRIGERADOR,
        MICROOONDAS
    }
    public static IArtefactoElectronico make(artefacto tipo){
        IArtefactoElectronico artefactoElectronico;
        switch (tipo){
            case TELEVISION:
                System.out.println("Television");
                artefactoElectronico=new Television();
                ((Television)artefactoElectronico).setPrecio("1580 $us");
                break;
            case RADIO:
                System.out.println("Radio");
                artefactoElectronico=new Radio();
                ((Radio)artefactoElectronico).setPrecio("35 $us");
                break;
            case BATIDORA:
                artefactoElectronico=new Batidora();
                System.out.println("Batidora");
                ((Batidora)artefactoElectronico).setPrecio("220 $us");
                break;
            case REFRIGERADOR:
                artefactoElectronico=new Refrigerador();
                System.out.println("Refrigerador");
                ((Refrigerador)artefactoElectronico).setPrecio("1100 $us");
                break;
            case MICROOONDAS:
                artefactoElectronico=new Microondas();
                System.out.println("Microondas");
                ((Microondas)artefactoElectronico).setPrecio("300 $us");
                break;
            default:
                artefactoElectronico=new Television();
                ((Television)artefactoElectronico).setPrecio("60 $us");
                break;

        }
        return artefactoElectronico;
    }
}
