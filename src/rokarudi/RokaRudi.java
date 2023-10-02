package rokarudi;

import java.util.Scanner;

public class RokaRudi {

    private static String[] pakli = new String[22];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        feltolt();
        megjelenit();
        for (int i = 0; i < 3; i++) {
            System.out.println("Válasszon egy oszlopot(1-3): ");
            int oszlop = sc.nextInt();
            kever(oszlop);
        }
        ezVolt();
    }

    private static void feltolt() {
        String[] szin = {"P", "T", "M", "S"};
        String[] ertek = {"Á", "K", "J", "IX", "X", "VIII"};

        for (String sz : szin) {
            for (int e = 0; e < ertek.length && e < pakli.length; e++) {
                //pakli = szin + "_" + e;
            }
        }

    }

    private static void megjelenit() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static void kever(int oszlop) {
        String[] ujPakli = new String[22];

        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {

                    ujPakli[i] = 20 - (i - 1) * 3;
                    ujPakli[i + 7] = 19 - (i - 1) * 3;
                    ujPakli[i + 14] = 21 - (i - 1) * 3;
                }
                break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    //más algoritmus
                    ujPakli[i] = 20 - (i - 1) * 3;
                    ujPakli[i + 7] = 21 - (i - 1) * 3;
                    ujPakli[i + 14] = 19 - (i - 1) * 3;
                }
                break;
            case 3:
                //más algoritmus
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = 19 - (i - 1) * 3;
                    ujPakli[i + 7] = 20 - (i - 1) * 3;
                    ujPakli[i + 14] = 21 - (i - 1) * 3;
                }
                break;
            default:
                throw new AssertionError();
        }

        pakli = ujPakli;
    }

    private static void ezVolt() {
        System.out.println("Ez volt az a lap: " + pakli[11] + "?");
    }

}
