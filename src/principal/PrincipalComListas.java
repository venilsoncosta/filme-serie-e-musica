package principal;

import codigosstream.Filme;
import codigosstream.Serie;
import codigosstream.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);

        meuFilme.avalia(6.0);
        meuFilme.avalia(9.0);
        meuFilme.avalia(8.0);
        outroFilme.avalia(10);
        filmeDoPaulo.avalia(9);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(lost);
        for(Titulo item : listaDeFilmes){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassficacao() > 2){
                System.out.println("Classificação: " + filme.getClassficacao());
            }
        }
    }
}
