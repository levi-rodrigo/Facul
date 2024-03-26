public class ex2 {
    public static void main(String[] args){

        int nota=6;
        int faltas=10;
        int maxFaltas=5;
        int media=5;
        String res;
        res=(nota >= media ? "Aprovado" : "Reprovado"); 
        
        //Tabela Verdade AND
        // Verdadeiro + Verdadeiro = Verdadeiro
        // Verdadeiro + Falso = Falso
        // Falso + Verdadeiro = Falso
        // Falso + Falso = Falso

        //Tabela Verdade OR
        // Verdadeiro + Verdadeiro = Verdadeiro
        // Verdadeiro + Falso = Verdadeiro
        // Falso + Verdadeiro = Verdadeiro
        // Falso + Falso = Falso






        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("Aprovado!");
        }else if(nota >=4){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado!");
        }
        System.out.println("Fim do Programa!");
    }
}
