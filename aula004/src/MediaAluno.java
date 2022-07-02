import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota01, nota02, nota03, nota04 = 0;
        final int MEDIA = 0;

        System.out.println("DIGITE SUAS NOTAS PARA CALCULAR A MÉDIA");
        System.out.println("================Nota 01================");
        nota01 = entrada.nextFloat();
        System.out.println("================Nota 02================");
        nota02 = entrada.nextFloat();
        System.out.println("================Nota 03================");
        nota03 = entrada.nextFloat();
        System.out.println("================Nota 04================");
        nota04 = entrada.nextFloat();

        System.out.println("================MÉDIA FINAL============");
        System.out.println("");
        System.out.println("Média:" + (nota01 + nota02 + nota03 + nota04) / 4);

    }
}
