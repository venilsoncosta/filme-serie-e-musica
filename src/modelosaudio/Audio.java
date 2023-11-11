package modelosaudio;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int clssificacao;

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClssificacao() {
        return clssificacao;
    }

}
