package switchCaseemJava;

public class SwitchemJava {
    public static void main(String[] args){

        int nota=8;
        String res="";

        switch (nota){
            case 10: case 9: case 8: case 7:
                res="Aprovado";
                break;
            case 6: case 5: case 4:
                res="Recuperacao";
                break;
            case 3: case 2: case 1:
                res="Reprovado";
                break;
            default:
                res="Nota invalida";
                break;
        }
       System.out.printf("Resultado:...%s%n",res);

    }
}
