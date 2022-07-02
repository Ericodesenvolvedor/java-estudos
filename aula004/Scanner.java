import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, res = 0;
        
        System.out.println("Digite um número: ");
        n1 = input.nextInt();

        System.out.println("Digite outro número: ");
        n2 = input.nextInt();

        res = n1 + n2;
        System.out.println("A soma dos número é: " + res);

        input.close();
    }
}