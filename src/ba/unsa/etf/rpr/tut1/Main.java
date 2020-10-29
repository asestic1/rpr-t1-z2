package ba.unsa.etf.rpr.tut1;

import java.util.Scanner;

public class Main {

    public static int SumaCifara(int broj) {
        int suma = 0;
        while(broj > 0) {
            suma = suma + broj % 10;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i=1; i<=n; i++) {
            if(i % SumaCifara(i) == 0) System.out.println(i);
        }
    }
}
