import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        /*int number = 0;
        int soucet = 0;
        int kladnaCisla = 0;
        int zapornaCisla = 0;
        int jednocifernaCisla = 0;

        int nejvetsiCislo = 0;
        int nejmensiCislo = 0;

        for(int i = 0; i < 20; i++){
            number = random.nextInt(-100, 100);
            System.out.print(number + " ");
            soucet += number;
            if(number > 0){
                kladnaCisla++;
            }
            else if(number < 0){
                zapornaCisla++;
            }
            if(number < 10 && number> -10 ){
                jednocifernaCisla++;
            }
            if(number > nejvetsiCislo){ // obnoveni nejvetsiho
                nejvetsiCislo = number;
            }
            else if(number < nejmensiCislo){ // obnoveni nejmensiho
                nejmensiCislo = number;
            }
        }
        System.out.println("\nSoucet se rovna " + soucet);
        System.out.println("\nPrumer se rovna " + soucet/20);
        System.out.println("\nKladnych cisel je  " + kladnaCisla);
        System.out.println("\nZapornych cisel je " + zapornaCisla);
        System.out.println("\nJednocifernych cisel je " + jednocifernaCisla);
        System.out.println("Nejvetsi cislo je " + nejvetsiCislo);
        System.out.println("Nejmensi cislo je " + nejmensiCislo);*/
        /*int cislo = 0;
        int stareCislo = 0;
        boolean rostouci = false;
        boolean klesajici = false;
        for(int i = 1; i<11; i++){
            System.out.print("Zadejte cislo " + i + ": ");
            cislo = scanner.nextInt();
            if(cislo > stareCislo){
                rostouci = true;
            }
            else if(cislo < stareCislo){
                klesajici = true;
            }
            stareCislo = cislo;
        }
        if(rostouci){
            System.out.println("Rostouci posloupnost");
        }
        else if(klesajici){

            System.out.println("Klesajici posloupnost");
        }*/
        String jmeno1, jmeno2, jmeno3, jmeno4, jmeno5;
        int pocet1,pocet2, pocet3, pocet4, pocet5;
        for (int i = 1; i < 6; i++) {
            if(i == 1){
                System.out.print("Zadejte nazev 1. mesta: ");
                jmeno1 = scanner.toString();
                System.out.print("Zadejte pocet obyvatel 1. mesta: ");
                pocet1 = scanner.nextInt()
            }
            else if(i == 2){
                Mesto mesto2 = new Mesto(scanner.toString(), scanner.nextInt());
            }
            else if(i == 3){
                Mesto mesto3 = new Mesto(scanner.toString(), scanner.nextInt());
            }
            else if(i == 4){
                Mesto mesto4 = new Mesto(scanner.toString(), scanner.nextInt());
            }
            else if(i == 5){

            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}