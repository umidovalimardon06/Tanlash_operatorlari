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
            case (1): System.out.print("Qish");break;
            case (2): System.out.print("Qish");break;
            case (3): System.out.print("Bahor");break;
            case (4): System.out.print("Bahor");break;
            case (5): System.out.print("Bahor");break;
            case (6): System.out.print("Yoz");break;
            case (7): System.out.print("Yoz");break;
            case (8): System.out.print("Yoz");break;
            case (9): System.out.print("Kuz");break;
            case (10): System.out.print("Kuz");break;
            case (11): System.out.print("Kuz");break;
            case (12): System.out.print("Qish");break;
            default:
                System.out.println("xato");
        }



    }
}