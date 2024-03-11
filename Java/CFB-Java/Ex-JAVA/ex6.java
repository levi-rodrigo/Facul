import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int soma=0;
        final int MEDIA=60;
        String nome="",res="";


        System.out.print("Digite o nome do aluno: ");
        nome=scan.nextLine();      
        System.out.print("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.print("Digite a quarta nota: ");
        n4=scan.nextInt();
        soma=n1+n2+n3+n4;
        if(soma >= MEDIA){
            res="aprovado";
        }else if(soma >=40){
            res="recuperacao";
        }else{
            res="reprovado";
        }
        System.out.printf("Aluno %s foi %s ,com nota %d" ,nome,res,soma);
    }    
}
