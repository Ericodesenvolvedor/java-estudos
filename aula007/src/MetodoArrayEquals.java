import java.util.Arrays;

public class MetodoArrayEquals {
    public static void main(String[] args) {
        String[] gabarito = {"a", "b", "c", "d", "e"};
        String[] respostas = {"a", "b", "c", "b", "e"};

        boolean equal = Arrays.equals(gabarito, respostas);

        if (equal) {
            System.out.println("São iguais!");
        } else  {
            System.out.println("São diferentes!");
        }
    }
}