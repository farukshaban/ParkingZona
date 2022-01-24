package testingmesting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zoni za parkiranje:");
        System.out.println("Zona 1: Centar");
        System.out.println("Zona 2: Karpos");
        System.out.println("Zona 3: Crnice");
        System.out.println("Zona 4: Cair");
        System.out.println("Zona 5: Butel");
        System.out.println("Zona 6: Aerodrom");

        System.out.println("Odberete parking zona pomegju 1 i 6: ");

        Zona1 centar = new Zona1();
        Zona2 karpos = new Zona2();
        Zona3 crnice = new Zona3();
        Zona4 cair = new Zona4();
        Zona5 butel = new Zona5();
        Zona6 aerodrom = new Zona6();

        Scanner scanner = new Scanner(System.in);

        int zona = scanner.nextInt();

        while(zona<1 || zona>6)
        {
            System.out.print("Odbravte pogresna zona. Ve molime odberete zona megju 1 i 6: ");
            zona = new Scanner(System.in).nextInt();
        }
        if (zona == 1) {
            centar.getZona1text();
        }
        else if (zona == 2) {
            karpos.getZona2text();
        }
        else if (zona == 3) {
            crnice.getZona3text();
        }
        else if (zona == 4) {
            cair.getZona4text();
        }
        else if (zona == 5) {
            butel.getZona5text();
        }
        else if (zona == 6) {
            aerodrom.getZona6text();
        }
    }


}
