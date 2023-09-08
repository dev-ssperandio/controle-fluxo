package excepcional;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;

        // Unchecked Exception:
        /* valor = Double.valueOf("a1.75");
        System.out.println(valor ); */
        
        
        // Checked Exception:
        try {
            valor = NumberFormat.getInstance(null).parse("a1.75");
            System.out.println(valor );
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
}
