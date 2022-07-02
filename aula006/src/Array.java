public class Array {
    public static void main(String[] args) {
        String[] gabarito = {"a", "b", "c", "d", "e"};
        String[] respostaGabirto = {"a", "b", "c", "c", "c"};
        int acertos = 0;
        int erros = 0;
        System.out.println("===============PROVA===============");

        for (int count = 0; count < gabarito.length; count++) {
            if (respostaGabirto[count] == gabarito[count]) {
                acertos++;
            } else {
                erros++;
            }
        }

        if (acertos > 3) {
            System.out.println("Você passou com " + acertos + " acertos");
        } else {
            System.out.println("Você reprovou com " + erros + " erros");
        }
    }
}
