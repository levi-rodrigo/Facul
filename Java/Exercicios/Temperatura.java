public class Temperatura {
    public static void main (String[] args){
        double C, K, F, Re, Ra;
        C=2.43;

        K = C + 273;
        F = C * 1.8 + 32;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit é:" + F);
        System.out.println("A temperatura em Kelvin é:" + K);
        System.out.println("A temperatura em Reaumur é:" + Re);
        System.out.println("A temperatura em Rakine é:" + F);

    }
}
