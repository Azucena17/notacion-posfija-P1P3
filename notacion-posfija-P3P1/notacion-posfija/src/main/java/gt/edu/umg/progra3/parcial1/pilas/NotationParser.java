package gt.edu.umg.progra3.parcial1.pilas;

public class NotationParser {

    private Pila pila;

    public NotationParser(Pila pila) {

        this.pila = pila;
    }
    public String posFixToInfix(String expression){
        PilIm en = stringAPila(delSpacing(expression));
        PilIm op = new PilIm();
        PilIm sa = new PilIm();

        String strPostToIn;

        while (!en.isEmpty()){
            switch (prefer(en.peek())){
                case 1:
                    op.push(en.pop());
                    break;
                default:
                    sa.push(en.pop());
                    if(!op.isEmpty()) sa.push(op.pop());
                    break;
            }
        }

        strPostToIn = addSpacing(pilaAString(sa));
        return strPostToIn;
    }

    private String delSpacing(String s){
        return s.replaceAll("\\s","");
    }

    private String addSpacing(String str){
        StringBuilder strSpacing = new StringBuilder();
        String symbols = "*/+-";

        for (int i=0;i<str.length();i++){
            if(symbols.contains(""+str.charAt(i))){
                strSpacing.append(" ").append(str.charAt(i)).append(" ");
            }else {
                strSpacing.append(str.charAt(i));
            }
        }
        return strSpacing.toString();
    }

    private int prefer(String str){
        int n = 10;
        if(str.equals("+") || str.equals("+") || str.equals("*") || str.equals("/")) n = 1;
        return n;
    }

    private PilIm stringAPila(String string){
        PilIm pila = new PilIm();
        for (int i=0;i<string.length();i++){
            pila.push(String.valueOf(string.charAt(i)));
        }
        return pila;
    }

    private String pilaAString(PilIm pila){

        StringBuilder strb = new StringBuilder();
        while (!pila.isEmpty()){
            strb.append(pila.pop());
        }
        return strb.toString();
    }

}





