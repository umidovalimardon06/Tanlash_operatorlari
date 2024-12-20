import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son;

        System.out.print("1-999 gacha son kiritng:");
        son = in.nextInt();

        if (son>=100 && son<=999) {
            switch (son/100) {
                case (1): System.out.print("bir yuz "); break;
                case (2): System.out.print("ikki yuz "); break;
                case (3): System.out.print("uch yuz "); break;
                case (4): System.out.print("to'rt yuz "); break;
                case (5): System.out.print("besh yuz "); break;
                case (6): System.out.print("olti yuz "); break;
                case (7): System.out.print("yetti yuz "); break;
                case (8): System.out.print("sakkiz yuz "); break;
                case (9): System.out.print("to'qqiz yuz "); break;
            }


            switch (son%100/10) {
                case (0): break;
                case (1): System.out.print("o'n"); break;
                case (2): System.out.print("yigirma"); break;
                case (3): System.out.print("o'ttiz"); break;
                case (4): System.out.print("qirq"); break;
                case (5): System.out.print("ellik"); break;
                case (6): System.out.print("oltmish"); break;
                case (7): System.out.print("yetmish"); break;
                case (8): System.out.print("sakson"); break;
                case (9): System.out.print("toqson"); break;
            }


            switch (son%10) {
                case (0): break;
                case (1): System.out.print(" bir"); break;
                case (2): System.out.print(" ikki"); break;
                case (3): System.out.print(" uch"); break;
                case (4): System.out.print(" to'rt"); break;
                case (5): System.out.print(" besh"); break;
                case (6): System.out.print(" olti"); break;
                case (7): System.out.print(" yetti"); break;
                case (8): System.out.print(" sakkiz"); break;
                case (9): System.out.print(" to'qqiz"); break;
            }
        } else {


            switch (son/10) {
                case (1): System.out.print("o'n "); break;
                case (2): System.out.print("yigirma "); break;
                case (3): System.out.print("o'ttiz "); break;
                case (4): System.out.print("qirq "); break;
                case (5): System.out.print("ellik "); break;
                case (6): System.out.print("oltmish "); break;
                case (7): System.out.print("yetti "); break;
                case (8): System.out.print("sakkiz "); break;
                case (9): System.out.print("to'qqiz "); break;
            }


            switch (son%10) {
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


        System.out.print(" so'm");



    }
}