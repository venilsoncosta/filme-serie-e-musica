package calculo;

public class FiltroRecomendacao {

    public void filtro(Classificavel classificavel){
        if(classificavel.getClassficacao() >= 4){
            System.out.println("Está entre os preferidos dos usuarios");
        }
        else if(classificavel.getClassficacao() >= 2){
            System.out.println("Está muito bem avaliado");
        }
        else{
            System.out.println("Coloque na sua lista de desejos");
        }
    }
}
