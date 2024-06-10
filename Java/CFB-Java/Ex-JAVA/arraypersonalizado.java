public class arraypersonalizado {
    public static void main(String[] args){

        final int numCarros=5;
        Carro[] carros=new Carro[numCarros];
        String[] nomesCarros={"Toro","Golf","Palio","Camaro","Ferrari"};

        //inicializar o array carros

        for(int i=0;i<numCarros;i++){
            carros[i]=new Carro(nomesCarros[i]);
        }


        //imprimir carros

        for(Carro c:carros){
            c.info();
        }










    }

}
