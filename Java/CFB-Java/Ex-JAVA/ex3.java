//Op Ternaria

public class ex3 {
    public static void main(String[] args){

        int nota=6;
        int faltas=10;
        int maxFaltas=5;
        int media=5;
        int res;

        res=(nota >= media ? 1 : 0); 
        
        System.out.println("Resultado: " + (res==1?"Aprovado":"Reprovado"));
    }
}
