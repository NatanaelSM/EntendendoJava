//Classe genérica (Herança de características)
//É abstrata pois indica as classes filhas que devem reescrever os métodos.
public abstract class Veiculo {
    private String chassi;

    public String getChassi(){
        return chassi;
    }
    public void setChassi (String chassi){
        this.chassi = chassi;
    }

    public abstract void ligar();
}
