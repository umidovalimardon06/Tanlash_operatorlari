import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int element;
        double a,R1,R2;

        System.out.print("a ni kiritng:");
        a  = in.nextInt();
//        System.out.print("c ni kiritng:");
//        c  = in.nextInt();
//        System.out.print("h ni kiritng:");
//        h  = in.nextInt();

        System.out.println("Elemenni kiriting: 1- katet,2-gipotenuza,3-gp tushirilgan balandllik,4-yuzasi.");
        element = in.nextInt();

        switch (element)
        {
            case (1):
                System.out.println("Bu elemenent tomonini chiqaradi! "+a); break;

            case (2):
                System.out.println("Ichki chizilgan aylana elementi:");
                R1 = a*Math.sqrt(3)/6;
                System.out.println("Ichki chizilgan aylana "+R1);
                break;

            case (3):
                System.out.println("Tashqi chizilgan aylana radiusini chiqaruvchi element:");
                R1 = a*Math.sqrt(3)/6;
                R2 = R1 *2;
                System.out.println("tashqi chizilgan aylana radiusi: "+R2);
                break;

            case (4):
                System.out.println("Yuzasi elementi:");
                double S;
                S = Math.pow(a,2)*Math.sqrt(3)/4;
                System.out.println("Yuzasi "+S);
                break;

        }




    }
}