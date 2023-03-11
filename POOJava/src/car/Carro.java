package car;

//classe filha/especializada de veiculos (extends veiculo)
public class Carro extends Veiculo {
    //Encapsulamento(Os métodos para ligar o carro foram "escondidos" para o condutor)
    public void ligar (){
        conferirCambio();
        conferirCombustível();
        System.out.println("Ligando o carro!");
    }

    private void conferirCombustível(){
        System.out.println("Conferindo combustível!");
    }
    private void conferirCambio(){
        System.out.println("Conferindo câmbio!");
    }
}
