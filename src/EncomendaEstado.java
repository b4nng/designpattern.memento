public interface EncomendaEstado {

    String getEstado();
    void postar(Encomenda encomenda);
    void despachar(Encomenda encomenda);
    void cancelar(Encomenda encomenda);
    void encaminhar(Encomenda encomenda);
    void extraviada(Encomenda encomenda);
    void receber(Encomenda encomenda);
    void devolver(Encomenda encomenda);
}
