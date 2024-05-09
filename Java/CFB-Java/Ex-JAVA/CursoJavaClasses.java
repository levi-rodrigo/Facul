public class CursoJavaClasses {
    public static void main(String[] args){

        int num=0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        Jogador.alerta=true;

        j1.info();
        j1.info();
        j1.info();


        //System.out.printf("%nVidas do Jogador 1: %d", j1.getVidas());





    }

}
