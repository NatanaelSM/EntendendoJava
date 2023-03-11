package testeInterface.estabelecimento;

import testeInterface.Copiadora.Copiadora;
import testeInterface.Copiadora.Xerox;
import testeInterface.Digitalizadora.Digitalizadora;
import testeInterface.Digitalizadora.Scanner;
import testeInterface.Impressora.Impressora;
import testeInterface.Impressora.Letjet;
import testeInterface.equipamento.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Letjet();
        impressora.imprimir();

        Copiadora copiadora = new Xerox();
        copiadora.copiar();

        Digitalizadora digitalizadora= new Scanner();
        digitalizadora.digitalizar();

        impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

        copiadora = new EquipamentoMultifuncional();
        copiadora.copiar();

        digitalizadora = new EquipamentoMultifuncional();
        digitalizadora.digitalizar();


    }
}
