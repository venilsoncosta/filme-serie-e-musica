package excecoes;

public class ErroDEConversaoDeAno extends RuntimeException {
    private String mensagem;

    public ErroDEConversaoDeAno(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
