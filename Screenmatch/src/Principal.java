import br.com.muacidev.screenmacth.modelos.Filme;
import br.com.muacidev.screenmacth.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setDuracaoEmMinutos(1980);
        meuFilme.setAnoDeLancamento(1970);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacao);
        //System.out.println(meuFilme.totalAvalicao);
        //System.out.println(meuFilme.pegaMediaDasAvaliacao());
        System.out.println("Total de Valiacao:" + meuFilme.getTotalAvalicao());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);

        System.out.println(lost.getNome());
        System.out.println(lost.getAnoDeLancamento());
        System.out.println(lost.getTemporadas());

    }
}