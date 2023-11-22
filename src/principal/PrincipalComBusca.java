package principal;

import codigosstream.Titulo;
import codigosstream.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import excecoes.ErroDEConversaoDeAno;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme que você quer buscar: ");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+")
                + "&apikey=84d40d95";

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

             HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido");
                System.out.println(meuTitulo);

        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){ //excecoes podem ser previstas, um erro não
            System.out.println("Aconteceu outro erro");
        }catch (ErroDEConversaoDeAno e){
            System.out.println("Aconteceu algo de errado");
            System.out.println(e.getMessage());
        }

        System.out.println("Programa finalizado");
    }
}
