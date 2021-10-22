package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;
public class Main {
    private static int SumaCifara(int i) {
        int sumaCifara = 0;
        while(i > 0) {
            sumaCifara = sumaCifara + i%10;
            i = i/10;
        }
        return sumaCifara;
    }

    public static void main(String args[]) {
        System.out.println("Unesite broj n:");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i <= n; i++) {
            if( i % SumaCifara(i) == 0) System.out.println(i);
        }
    }

}
