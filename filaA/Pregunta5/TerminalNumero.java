package primerParcialPatrones.pregunta5;
public class TerminalNumero extends AbstractExpresion{
    public TerminalNumero(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(Context context) {

        context.output= context.output + Integer.parseInt(context.input.substring(0,this.amountDigit))*(context.signo);
        context.input= context.input.substring(this.amountDigit);

    }
}
