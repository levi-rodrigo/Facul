   //Calculadora com POO


import java.util.Scanner;

public class calc {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        numero n1 = new numero(0);
        numero n2 = new numero(0);
        numero res = new numero(0);

        String opc="S";

        while(opc.equals("s") || opc.equals("S")){
        System.out.printf("%nDigite o valor 1: ");
        n1.setValor(scan.nextInt());

        System.out.printf("%nDigite o valor 2:");
        n2.setValor(scan.nextInt());

        res.setValor(n1.getValor() + n2.getValor());

        System.out.printf("%n A soma de %d com %d e igual a %d", n1.getValor(),n2.getValor(),res.getValor());
        System.out.printf("%n Deseja somar outro valor?");
           opc=scan.next();
           System.out.printf("%n%n%n");
       }
    }
}