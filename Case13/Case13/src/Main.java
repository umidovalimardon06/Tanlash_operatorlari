import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int element;
        double a,c,h;

        System.out.print("a ni kiritng:");
        a  = in.nextInt();
        System.out.print("c ni kiritng:");
        c  = in.nextInt();
        System.out.print("h ni kiritng:");
        h  = in.nextInt();

        System.out.println("Elemenni kiriting: 1- katet,2-gipotenuza,3-gp tushirilgan balandllik,4-yuzasi.");
        element = in.nextInt();

        switch (element)
        {
            case (1):
                System.out.println("Bu elemenent katetni chiqaradi! "+a); break;

            case (2):
                System.out.println("Gipotenuza elementi:");
                c = a*Math.sqrt(2);
                System.out.println("Gipotenuza "+c);
                break;

            case (3):
                System.out.println("Gipotenuzaga tushgan balandlik:");
                h = c/2;
                System.out.println("Gipotenuzaga tushgan balandlik: "+h);
                break;

            case (4):
                System.out.println("Yuzasi elementi:");
                double S;
                S = (c*h)/2;
                System.out.println("Yuzasi "+S);
                break;

        }




    }
}