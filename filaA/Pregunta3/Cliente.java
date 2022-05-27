package primerParcialPatrones.pregunta3;

public class Cliente {
    public static void main (String []args){
        Television television=(Television)FactoryArtefactos.make(FactoryArtefactos.artefacto.TELEVISION);
        television.crear();

        Radio radio=(Radio) FactoryArtefactos.make(FactoryArtefactos.artefacto.RADIO);
        radio.crear();

        Batidora batidora=(Batidora) FactoryArtefactos.make(FactoryArtefactos.artefacto.BATIDORA);
        batidora.crear();

        Refrigerador refrigerador=(Refrigerador) FactoryArtefactos.make(FactoryArtefactos.artefacto.REFRIGERADOR);
        refrigerador.crear();

        Microondas microondas=(Microondas) FactoryArtefactos.make(FactoryArtefactos.artefacto.MICROOONDAS);
        microondas.crear();


    }

}
