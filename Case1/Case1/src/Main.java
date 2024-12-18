import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day;
        System.out.print("Hafta kunini kiriting:");
        day = in.nextInt();

        switch (day)
        {
            case (1): System.out.print("Dushanba");break;
            case (2): System.out.print("Seshanba");break;
            case (3): System.out.print("Chorshanba");break;
            case (4): System.out.print("Payshanba");break;
            case (5): System.out.print("Juma");break;
            case (6): System.out.print("Shanba");break;
            case (7): System.out.print("Yakshanba");break;
        }



    }
}