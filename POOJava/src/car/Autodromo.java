package car;

public class Autodromo {
    public static void main(String[] args) {
        Carro supra = new Carro();
        supra.setChassi("542353523");
        System.out.println(supra.getChassi());
        supra.ligar();

        Moto z1000 = new Moto();
        z1000.setChassi("423847238");
        System.out.println(z1000.getChassi());
        z1000.ligar();
    }
}