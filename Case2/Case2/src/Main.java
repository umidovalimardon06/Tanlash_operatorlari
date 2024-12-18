import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day;
        System.out.print("Olgan bahoyingizni kiritng:");
        day = in.nextInt();

        switch (day)
        {
            case (1): System.out.print("Yomon");break;
            case (2): System.out.print("Qoniqarsiz");break;
            case (3): System.out.print("Qoniqarli");break;
            case (4): System.out.print("Yaxshi");break;
            case (5): System.out.print("A'lo");break;
            default:
                System.out.println("xato");
        }



    }
}