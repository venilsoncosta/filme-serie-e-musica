package modelosaudio;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    @Override
    public int getClssificacao() {
        if(this.getTotalReproducoes() >= 1000){
            return 10;
        }
        else if(this.getTotalReproducoes() >= 500){
            return 7;
        }
        else {
            return 5;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
