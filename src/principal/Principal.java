package principal;

import codigosstream.Filme;
import modelosaudio.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Exagerado");
        minhaMusica.setCantor("Cazuza");

        Filme meuFilme = new Filme();
        meuFilme.setNome("Forrest Gump: O contador de histórias");
        System.out.println(meuFilme.getNome());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        System.out.println(outroFilme.getNome());

        Musica umaMusica = new Musica();
        umaMusica.setTitulo("Down em Mim");
        System.out.println(umaMusica.getTitulo());
    }
}
