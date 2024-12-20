import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yosh;

        System.out.print("20-69 son kiritng:");
        yosh = in.nextInt();

        switch (yosh/10) {
            case (2): System.out.print("yigirma "); break;
            case (3): System.out.print("o'ttiz "); break;
            case (4): System.out.print("qirq "); break;
            case (5): System.out.print("ellik "); break;
            case (6): System.out.print("oltmish "); break;
        }


        switch (yosh%10) {
            case (0): break;
            case (1): System.out.print("bir"); break;
            case (2): System.out.print("ikki"); break;
            case (3): System.out.print("uch"); break;
            case (4): System.out.print("to'rt"); break;
            case (5): System.out.print("besh"); break;
            case (6): System.out.print("olti"); break;
            case (7): System.out.print("yetti"); break;
            case (8): System.out.print("sakkiz"); break;
            case (9): System.out.print("to'qqiz"); break;
        }


    }
}