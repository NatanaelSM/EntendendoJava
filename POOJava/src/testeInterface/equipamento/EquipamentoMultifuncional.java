package testeInterface.equipamento;

import testeInterface.Copiadora.Copiadora;
import testeInterface.Digitalizadora.Digitalizadora;
import testeInterface.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void copiar() {
        System.out.println("Copiando pelo Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando pelo Equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pelo Equipamento Multifuncional");
    }
}
