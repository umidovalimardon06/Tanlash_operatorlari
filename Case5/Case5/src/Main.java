import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B,raqam;
        System.out.print("A ni kiriting:");
        A = in.nextInt();
        System.out.print("B ni kiriting:");
        B = in.nextInt();
        System.out.print("Ifoda raqamini kiriting: \n Qoshish==>1 \n Ayirish==>2 \n Bo'lish==>3 \n Qoshish==>4 " );
        raqam = in.nextInt();

        switch (raqam)
        {
            case (1): System.out.print("Qoshish "+(A+B));break;
            case (2): System.out.print("Ayirish "+(A-B));break;
            case (3): System.out.print("Bo'lish "+((double)A/(double)B));break;
            case (4): System.out.print("Ko'paytirish "+(A*B));break;

            default:
                System.out.println("xato");
        }



    }
}