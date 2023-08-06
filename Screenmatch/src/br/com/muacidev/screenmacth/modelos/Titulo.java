package br.com.muacidev.screenmacth.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPLano;
    private double somaDasAvaliacao;
    private int totalAvalicao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPLano() {
        return incluidoNoPLano;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public void setSomaDasAvaliacao(double somaDasAvaliacao) {
        this.somaDasAvaliacao = somaDasAvaliacao;
    }

    public int getTotalAvalicao() {
        return totalAvalicao;
    }

    public void setTotalAvalicao(int totalAvalicao) {
        this.totalAvalicao = totalAvalicao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacao += nota;
        totalAvalicao++;
    }

    public double pegaMediaDasAvaliacao(){
        return somaDasAvaliacao / totalAvalicao;
    }
}
