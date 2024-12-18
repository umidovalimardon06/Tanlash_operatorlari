import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uzunlik birligini bildiruvchi sonni kiriting (1-5): ");
        int birlik = scanner.nextInt();

        System.out.println("Kesma uzunligini kiriting: ");
        double uzunlik = scanner.nextDouble();

        double metrda = 0;
        switch (birlik) {
            case 1: // Desimetr
                metrda = uzunlik * 0.1;
                break;
            case 2: // Kilometr
                metrda = uzunlik * 1000;
                break;
            case 3: // Metr
                metrda = uzunlik;
                break;
            case 4: // Millimetr
                metrda = uzunlik * 0.001;
                break;
            case 5: // Santimetr
                metrda = uzunlik * 0.01;
                break;
            default:
                System.out.println("Noto'g'ri birlik soni kiritildi!");
                return;
        }

        // Natijani chiqarish
        System.out.println("Kesmaning uzunligi metrda: " + metrda);

        // Scanner yopiladi
        scanner.close();
    }
}
