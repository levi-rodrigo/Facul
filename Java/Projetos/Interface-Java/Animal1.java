
public class Animal1 implements SerVivo1 {
    public Boolean vivo;

    public Animal1(){
        this.vivo=false;
    }

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.printf("%s",this.vivo ? "Sim" : "Nao");
    }
}
