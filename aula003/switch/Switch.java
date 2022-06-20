public class Switch {
    public static void main(String[] args) {
        int sun = 5 + 5;

        switch(sun) {
            case 8:
                System.out.println("O resultado deu 8");
                break;
            case 10: 
                System.out.println("O resultado deu 10");
                break;
            default: 
                System.out.println("Resultado fora dos cases");
                break;
        }
    }
}