public class EncomendaEstadoExtraviado implements EncomendaEstado {
    private EncomendaEstadoExtraviado() {}
    private static EncomendaEstadoExtraviado instance = new EncomendaEstadoExtraviado();

    public static EncomendaEstadoExtraviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Extraviado";
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
        System.out.println("Encaminhamento não executado");
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
