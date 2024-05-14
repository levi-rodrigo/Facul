public class CarroCombate {
    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdeArmamento=100;
    }

    public void setQtdeArmamento(int armamento){

    }
}
