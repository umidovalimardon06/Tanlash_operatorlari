import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Og'irlik birligini bildiruvchi sonni kiriting (1-5): ");
        System.out.println("1 - Kilogram, 2 - Milligram, 3 - Gramm, 4 - Tonna, 5 - Sentner");
        int birlik = scanner.nextInt();

        System.out.println("Og'irlikni kiriting: ");
        double ogirlik = scanner.nextDouble();

        double kilogramda = 0;
        switch (birlik) {
            case 1: // Kilogram
                kilogramda = ogirlik;
                break;
            case 2: // Milligram
                kilogramda = ogirlik * 0.000001;
                break;
            case 3: // Gramm
                kilogramda = ogirlik * 0.001;
                break;
            case 4: // Tonna
                kilogramda = ogirlik * 1000;
                break;
            case 5: // Sentner
                kilogramda = ogirlik * 100;
                break;
            default:
                System.out.println("Noto'g'ri birlik soni kiritildi!");
                scanner.close();
                return;
        }

        // Natijani chiqarish
        System.out.println("Og'irlik kilogramda: " + kilogramda);

        // Scanner yopiladi
        scanner.close();
    }
}
