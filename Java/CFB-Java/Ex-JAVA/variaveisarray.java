public class variaveisarray {
    public static void main(String[] args){

        final int tamanho=7;
        int[] num=new int[tamanho];

        num[0]=50;
        num[1]=450;
        num[2]=350;
        num[3]=250;
        num[4]=150;
        num[5]=120;
        num[6]=1150;

        /*for(int i=0;i<num.length;i++){
          //  System.out.printf("%d%n",num[i]);
        */

        for(int n:num){
            System.out.printf("%d%n", n);
        }
    }

}
