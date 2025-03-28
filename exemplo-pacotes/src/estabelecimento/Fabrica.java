package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();
        impressora = new Laserjet();
        impressora.imprimir();
        impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        impressora = em;
        copiadora.copiar();
        em.copiar();
        digitalizadora.digitalizar();
        em.digitalizar();
        impressora.imprimir();
        em.imprimir();
    }
}
