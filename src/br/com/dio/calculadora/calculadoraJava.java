package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadoraJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero inteiro: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int sub = sub(a, b);
        int multi = multi(a, b);
        double div = div(a, b);
        int resto = resto(a, b);

        System.out.println("Somar: "+ somar);
        System.out.println("Sub: " + sub);
        System.out.println("Multi: " + multi);
        System.out.println("Div: " + div);
        System.out.println("Resto: " + resto);


    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static double div(int a, int b){
        return a/b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static int resto(int a, int b){
        return a%b;
    }
}
