public class ex9 {
    
    public static void main(String[] args) {

        final  int tam=5;

        int[] num=new int[tam];
        int[] numeros={10,20,30,40,50,60,80,90,70,60};

        num[0]=10;
        num[1]=2;
        num[2]=15;
        num[3]=20;
        num[4]=16;

        for(int i=0;i<numeros.length;i++){
            System.out.printf("%d  - ",numeros[i]);
        }
        
    }
}
