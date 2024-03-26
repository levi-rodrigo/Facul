class Carro {
    String marca;
    String modelo;

    // Construtor da classe Carro

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para dirigir o carro
    public void dirigir() {
        System.out.println("O " + marca + " " + modelo + " esta andando.");
    }
}



public class Main {
    public static void main(String[] args) {
        
        // Criando um objeto a partir da classe Carro

        Carro meuCarro = new Carro("Ford", "Fiesta");

        // Chamando o método dirigir do objeto

        meuCarro.dirigir();

        // Criando outro objeto da mesma classe Carro

        Carro carroAmigo = new Carro("BMW", "M4");
        carroAmigo.dirigir();
    }
}