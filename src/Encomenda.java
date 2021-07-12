import java.util.ArrayList;
import java.util.List;

public class Encomenda {

    private EncomendaEstado estado;
    private List<EncomendaEstado> memento = new ArrayList<EncomendaEstado>();
    private String nome;
    private String peso;
    private String origem;
    private String destino;

    public Encomenda(String nome, String peso, String origem, String destino) {
        this.nome = nome;
        this.peso = peso;
        this.origem = origem;
        this.destino = destino;
        setEstado(EncomendaEstadoPostado.getInstance());
    }

    public String getEstado() {
        return this.estado.getEstado();
    }

    public void setEstado(EncomendaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public List<EncomendaEstado> getEstados(){
        return this.memento;
    }

    public String estadosToString(){
        String allEstados="";
        int contadorEstados=0;
        for(EncomendaEstado estado : this.memento){
            allEstados += "Estado"+
                    contadorEstados+
                    ": "+
                    estado.getEstado()+
                    "\n";
            contadorEstados++;
        }
        return allEstados;
    }

    public void restauraEstado(int indice){
        if(indice <0 || indice>this.memento.size() - 1){
            throw new IllegalArgumentException("Indice Invalido");
        }
        this.estado = this.memento.get(indice);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void postar() {
        this.estado.postar(this);
    }

    public void despachar() {
        this.estado.despachar(this);
    }

    public void cancelar() {
        this.estado.cancelar(this);
    }

    public void encaminhar() {
        this.estado.encaminhar(this);
    }

    public void extraviada() {
        this.estado.extraviada(this);
    }

    public void receber() {
        this.estado.receber(this);
    }

    public void devolver() {
        this.estado.devolver(this);
    }
}
