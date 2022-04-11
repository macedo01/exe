package recursividade;

import java.util.Scanner;

public class ativ {

    //2) Escreva em java um método recursivo que receba um número inteiro na base
    //decimal e realize a conversão deste número para base binária.

    public static void main(String[] args) {
        conversor(13);
        System.out.println();
        System.out.println(decimalToBinary(13));

    }

    private static void conversor(int i) {
        if(i > 0) {
            conversor(i / 2);
            System.out.print(i % 2);
        }
    }

    public static String decimalToBinary (int i) {
        String restoAtual = "" + i % 2 ;

        if(i <= 0) {
            return "";
        }else {
            return decimalToBinary(i/2) + restoAtual ;
        }
    }
}
