import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eletkor;

        do {
            System.out.print("Hány éves vagy? (1-20 között): ");
            eletkor = scanner.nextInt();

            if (eletkor < 1 || eletkor > 20) {
                System.out.println("Hibás érték! 1 és 20 közötti számot adj meg.");
            }

        } while (eletkor < 1 || eletkor > 20);


        System.out.print("    ");
        for (int i = 0; i < eletkor; i++) {
            System.out.print("* ");
        }

        System.out.println();


        System.out.print("    ");
        for (int i = 0; i < eletkor; i++) {
            System.out.print("| ");
        }

        System.out.println();
        System.out.print("    ");
        for (int i=0;i<eletkor;i++){
            System.out.print("- ");
        }
        scanner.close();
    }
}
