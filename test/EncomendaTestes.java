
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncomendaTestes {
    @Test
    public void deveRetornarEstadosCorretamente(){
        Encomenda encomenda = new Encomenda("Computador", "5Kg", "Belo Horizonte", "Juiz de Fora");
        encomenda.encaminhar();
        encomenda.encaminhar();
        encomenda.encaminhar();
        encomenda.receber();
        Assertions.assertEquals("Estado0: Postado\n" +
                "Estado1: Encaminhado\n" +
                "Estado2: Encaminhado\n" +
                "Estado3: Encaminhado\n" +
                "Estado4: Recebido\n", encomenda.estadosToString());
    }

    @Test
        public void deveRestaurarAoPostado(){
            Encomenda encomenda = new Encomenda("Computador", "5Kg", "Belo Horizonte", "Juiz de Fora");
            encomenda.extraviada();
            encomenda.receber();
            encomenda.restauraEstado(0);
            Assertions.assertEquals("Postado", encomenda.getEstado());
        }
}
