import java.util.Arrays;

public class CursoJava {
    public static void main(String[] args){


        final int tam=10;
        int[] num={9,2,3,5,6,4,1,7,8,0};
        int[] numeros= new int[tam];

        //Arrays.sort(num);
        //Arrays.fill(numeros, 10);

        System.arraycopy(num, 0, numeros, 0, tam);

        System.out.printf("Arrays sao iguais:%s", Arrays.equals(num, numeros) ? "SIM" : "NAO");

//equals faz comparação de arrays

       // for(int n:numeros){
         //   System.out.printf("%d - ",n);
        //}
    }
}
