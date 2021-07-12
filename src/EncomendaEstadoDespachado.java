public class EncomendaEstadoDespachado implements EncomendaEstado {
    private EncomendaEstadoDespachado() {};
    private static EncomendaEstadoDespachado instance = new EncomendaEstadoDespachado();

    public static EncomendaEstadoDespachado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Despachado";
    }

    @Override
    public void postar(Encomenda encomenda) {
        System.out.println("Postagem não executada: Objeto já despachado");
    }

    @Override
    public void despachar(Encomenda encomenda) {
        System.out.println("Despacho não executado: Objeto já despachado");
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
        System.out.println("Recebimento não executado: Objeto ainda despachado");
    }

    @Override
    public void devolver(Encomenda encomenda) {
        System.out.println("Devolução não executado: Objeto já despachado");
    }
}
