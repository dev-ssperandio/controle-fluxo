package condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        // Condicional composta:
        /* int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado"); */


        // Condicional encadeadas:
        /* int nota = 6;

        if(nota >= 7)
        System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7)
        System.out.println("Prova Recuperação");
        else
        System.out.println("Reprovado"); */
        
        // Condição ternária
        int nota = 5;
        /* String resultado = nota >= 7 ? "Aprovado" : "reprovado";

        System.out.println(resultado); */

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
