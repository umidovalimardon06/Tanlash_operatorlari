import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int D,M;
        System.out.print("D:");
        D = in.nextInt();
        System.out.print("M:");
        M = in.nextInt();

        switch (D%7)
        {
            case (0): System.out.print("Yakshanba ");break;
            case (1): System.out.print("Dushanba ");break;
            case (2): System.out.print("Seshanba ");break;
            case (3): System.out.print("Chorshanba ");break;
            case (4): System.out.print("Payshanba ");break;
            case (5): System.out.print("Juma ");break;
            case (6): System.out.print("Shanba ");break;
        }
       switch (M%12)
        {
            case (0): System.out.println("Dekabr ");break;
            case (1): System.out.println("Yanvar ");break;
            case (2): System.out.println("Fevral ");break;
            case (3): System.out.println("Mart ");break;
            case (4): System.out.println("Aprel ");break;
            case (5): System.out.println("May ");break;
            case (6): System.out.println("Iyun ");break;
            case (7): System.out.println("Iyul ");break;
            case (8): System.out.println("Avgust ");break;
            case (9): System.out.println("Sentabr ");break;
            case (10): System.out.println("Oktabr ");break;
            case (11): System.out.println("Noyabr ");break;
        }


    }
}