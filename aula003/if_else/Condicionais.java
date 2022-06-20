package if_else;

public class Condicionais {
    public static void main(String[] args) {
        int notaProva = 5;
        boolean aprovado = notaProva >= 6;

        if(aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}