import java.util.Arrays;

public class MetodoArraySorte {
    public static void main(String[] args) {
        int[] array = {10, 7, 4, 9, 8};

        Arrays.sort(array);

        for (int loop: array) {
            System.out.println(loop);
        }
    }
}