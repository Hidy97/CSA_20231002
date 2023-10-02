package rokarudi;

import java.util.Scanner;

public class RokaRudi {

    private static String[] pakli = new String[22];
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        feltolt();
        megjelenit();
        int oszlop = sc.nextInt();
        kever(oszlop);
        ezVolt();
    }

    private static void feltolt() {
        String[] szin = {"P", "T", "M", "S"};
        String[] ertek = {"Á", "K", "J", "IX", "X", "VIII"};
        
        for (String sz : szin) {
            for (int e = 0; e < ertek.length && e < pakli.length; e++) {
                pakli = szin + "_" + e;
            }
        }
        
    }

    private static void megjelenit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static void kever(oszlop) {
        String[] ujPakli = new String[22];
        
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = 20-(i-1)*3;
                    ujPakli[i+7] = 19-(i-1)*3;
                    ujPakli[i+14] = 21-(i-1)*3;
                }
                break;
            case 2:
                
                break;
            case 3:
                
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
