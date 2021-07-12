public class EncomendaEstadoEncaminhado implements EncomendaEstado{
    private EncomendaEstadoEncaminhado() {};
    private static EncomendaEstadoEncaminhado instance = new EncomendaEstadoEncaminhado();

    public static EncomendaEstadoEncaminhado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Encaminhado";
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
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        System.out.println("Objeto Cancelado");
    }

    @Override
    public void encaminhar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoEncaminhado.getInstance());
        System.out.println("Objeto Encaminhado");
    }

    @Override
    public void extraviada(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoExtraviado.getInstance());
        System.out.println("Objeto Extraviado");
    }

    @Override
    public void receber(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoRecebido.getInstance());
        System.out.println("Objeto Recebido");
    }

    @Override
    public void devolver(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoDevolvido.getInstance());
        System.out.println("Objeto Devolvido");
    }
}
