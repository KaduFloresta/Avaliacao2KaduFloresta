public class Filme {
    // Atributos
    int idFilme;
    String titulo;
    String dataLanc;
    String sinopse;
    Double valorLoc;
    int estoque;
    int locado;

    // Construtor
    public Filme(int idFilme, String titulo, String dataLanc, String sinopse, Double valorLoc, int estoque) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.dataLanc = dataLanc;
        this.sinopse = sinopse;
        this.valorLoc = valorLoc;
        this.estoque = estoque;
        this.locado = 0;
    }

    // Método com a Quantidade de locações realizadas
    public void filmeLocado() {
        this.estoque -= 1;
        this.locado += 1;
    }

    // Impressão Dados do Filme
    public void mostrarFilme() {
        System.out.println("----------------------------FILME----------------------------------------------------------------------------------------------------------");
        System.out.println("--> Nº ID DO FILME: " + idFilme);
        System.out.println("-> TÍTULO: " + titulo);
        System.out.println("-> DATA DE LANÇAMENTO: " + dataLanc);
        System.out.println("-> SINOPSE: " + sinopse);
        System.out.println("-> VALOR DA LOCAÇÃO: R$ " + valorLoc);
        System.out.println("-> QTDE EM ESTOQUE: " + estoque);
        System.out.println("-> QTDE DE LOCAÇÕES REALIZADAS: " + locado);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    }
}