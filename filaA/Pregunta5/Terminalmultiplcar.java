package primerParcialPatrones.pregunta5;
public class TerminalResta extends AbstractExpresion{
    public TerminalResta(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("multiplicars")){
            context.signo=-1;
            context.input= context.input.substring(this.amountDigit);
        }
    }
}
