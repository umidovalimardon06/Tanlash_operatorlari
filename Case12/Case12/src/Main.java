import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int element,R;
        double pi;
        pi = Math.PI;

        System.out.print("R ni kiritng:");
        R  = in.nextInt();

        System.out.println("Elemenni kiriting: 1- radius,2-diametr,3-uzunlik,4-doira yuzasi.");
        element = in.nextInt();

        switch (element)
        {
            case (1):
                System.out.println("Bu elemenent doira radiusini chiqaradi! "+R); break;

            case (2):
                System.out.println("Diametr elementi:");
                double D;
                D = 2*R;
                System.out.println("Diametr "+D);
                break;

            case (3):
                System.out.println("Uzunlik elementi:");
                double L;
                L = 2*pi*R;
                System.out.println("Uzunlik "+L);
                break;

            case (4):
                System.out.println("Doira yuzasi elementi:");
                double S;
                S = pi*Math.pow(R,2);
                System.out.println("Doira yuzasi "+S);
                break;

        }




    }
}