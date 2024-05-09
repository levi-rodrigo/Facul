public class Jogador {

    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qtdJogadores=0;


    public Jogador(int num){
        this.num=num;
        this.setVidas(1);
        System.out.printf("Jogador numero %d Criado%n", num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas){
        if(vidas > 3){
            this.vidas=maxVidas;
        }else if(vidas < 0){
            this.vidas=0;
        }else{
            this.vidas=vidas;
        }
    }
    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
    public void info(){
        System.out.printf("%nJogador:%d", this.num);
        System.out.printf("%nVidas:%d", this.vidas);
        System.out.printf("%nAlerta:%s",(alerta ? "Sim" : "Nao"));
        System.out.printf("%nJogadores:%d", qtdJogadores);
        System.out.printf("%n--------------------------------------");
    }

}

