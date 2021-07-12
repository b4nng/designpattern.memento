public class EncomendaEstadoPostado implements EncomendaEstado {
    private EncomendaEstadoPostado() {};
    private static EncomendaEstadoPostado instance = new EncomendaEstadoPostado();
    public static EncomendaEstadoPostado getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Postado";
    }

    @Override
    public void postar(Encomenda encomenda) {
        System.out.println("Objeto já postado");
    }

    @Override
    public void despachar(Encomenda encomenda) {
        System.out.println("Objeto Despachado");
        encomenda.setEstado(EncomendaEstadoDespachado.getInstance());
    }

    @Override
    public void cancelar(Encomenda encomenda) {
        System.out.println("Objeto Cancelado");
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
    }

    @Override
    public void encaminhar(Encomenda encomenda) {
        System.out.println("Objeto Encaminhado");
        encomenda.setEstado(EncomendaEstadoEncaminhado.getInstance());
    }

    @Override
    public void extraviada(Encomenda encomenda) {
        System.out.println("Objeto Extraviado");
        encomenda.setEstado(EncomendaEstadoExtraviado.getInstance());
    }

    @Override
    public void receber(Encomenda encomenda) {
        System.out.println("Objeto Recebido");
        encomenda.setEstado(EncomendaEstadoRecebido.getInstance());
    }

    @Override
    public void devolver(Encomenda encomenda) {
        System.out.println("Objeto Devolvido");
        encomenda.setEstado(EncomendaEstadoDevolvido.getInstance());
    }
}
