import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Y,K;
        System.out.println("Tomonni kiriting \n 1-shimol \n 2-janub \n 3-sharq \n 4-garb:");
        Y = in.nextInt();
        System.out.println("0 dan 2 gacha son kiriting \n 0-harakatni davom et \n 1-chapga buril \n 2-o'nga buril :");
        K = in.nextInt();

        switch (Y)
        {
            case (1): System.out.print("shimol "); break;
            case (2): System.out.print("janub "); break;
            case (3): System.out.print("sharq "); break;
            case (4): System.out.print("garb "); break;
        }

        System.out.print(" ga ");

        switch (K)
        {
            case (0): System.out.print("davom ettir"); break;
            case (1): System.out.print("chapga buril"); break;
            case (2): System.out.print("o'nga buril"); break;
        }


    }
}