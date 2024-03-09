public class ex4 {
    public static void main(String[] args){
        
      int pos=5;


        switch(pos){
        case 1:
                System.out.println("Primeiro Lugar");
            break;

        case 2:
            System.out.println("Segundo Lugar");
            break;

        case 3:
            System.out.println("Terceiro Lugar");
            break;
        case 4: case 5: case 6:
            System.out.println("Premio de Participacao");
            break;

        default:
        System.err.println("Nao Subiu no Podio");
        break;
        }
    }
}
