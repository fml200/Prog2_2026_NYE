import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double masodperc;


        do {
            System.out.print("Hány másodperccel a villámlás után hallottad a dörgést? ");
            masodperc = scanner.nextDouble();

            if (masodperc < 0) {
                System.out.println("Negatív érték nem megengedett! Próbáld újra.");
            }

        } while (masodperc < 0);


        double tavolsag = masodperc * 300;

        System.out.println("A villámlás körülbelül " + tavolsag + " méterre volt.");

        scanner.close();
    }
}
