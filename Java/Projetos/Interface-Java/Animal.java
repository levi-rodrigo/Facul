
public class Animal implements SerVivo {
    public Boolean vivo;

    public Animal(){
        this.vivo=false;
    }

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.printf("%s",this.vivo ? "Sim" : "Nao");
    }
}
