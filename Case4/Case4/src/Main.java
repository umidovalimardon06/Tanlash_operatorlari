import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int oyRaqami;
        System.out.print("Oy raqanini kiritng:");
        oyRaqami = in.nextInt();

        switch (oyRaqami)
        {
            case (1): System.out.print("31 kun");break;
            case (2): System.out.print("28 yoki 29 kun");break;
            case (3): System.out.print("31 kun");break;
            case (4): System.out.print("30 kun");break;
            case (5): System.out.print("31 kun");break;
            case (6): System.out.print("30 kun");break;
            case (7): System.out.print("31 kun");break;
            case (8): System.out.print("31 kun");break;
            case (9): System.out.print("30 kun");break;
            case (10): System.out.print("31 kun");break;
            case (11): System.out.print("30 kun");break;
            case (12): System.out.print("31 kun");break;
            default:
                System.out.println("xato");
        }



    }
}