public class EncomendaEstadoDevolvido implements EncomendaEstado{
    private EncomendaEstadoDevolvido() {};
    private static EncomendaEstadoDevolvido instance = new EncomendaEstadoDevolvido();

    public static EncomendaEstadoDevolvido getInstance() {
        return instance;
    }
    
    @Override
    public String getEstado() {
        return "Devolvido";
    }

    @Override
    public void postar(Encomenda encomenda) {
        System.out.println("Postagem não executada");
    }

    @Override
    public void despachar(Encomenda encomenda) {
        System.out.println("Despache não executado");
    }

    @Override
    public void cancelar(Encomenda encomenda) {
        System.out.println("Cancelamento não executado");
    }

    @Override
    public void encaminhar(Encomenda encomenda) {
        System.out.println("Objeto Encaminhado");
        encomenda.setEstado(EncomendaEstadoEncaminhado.getInstance());
    }

    @Override
    public void extraviada(Encomenda encomenda) {
        System.out.println("Extraviamento não executado");
    }

    @Override
    public void receber(Encomenda encomenda) {
        System.out.println("Recebimento não executado");
    }

    @Override
    public void devolver(Encomenda encomenda) {
        System.out.println("Devolução não executada");
    }
}
