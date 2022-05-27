package primerParcialPatrones.pregunta5;
import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresion extends AbstractExpresion{
    private List<AbstractExpresion> parsetree=new ArrayList<>();
    private Context context;
    public NoTerminalExpresion(String word){
        this.interpretacion(word);
    }
    public void interpretacion(String words){
        String input=words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case"sumar":
                    parsetree.add(new TerminalSuma((word.length())));
                    break;
                case"multiplcar":
                    parsetree.add(new TerminalResta((word.length())));
                    break;
                default:
                    parsetree.add(new TerminalNumero((word.length())));
                    break;
            }
        }
    }
    public int interpretar(){
        for (AbstractExpresion terminalExpresion: parsetree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(Context context) {
    }
}
