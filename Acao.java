
public class Acao {
    private Fila cotacoes;
    private String nome;

    public Acao(String nome) {
        this.cotacoes = new Fila();
        this.nome = nome;
    }
    
    public Fila getCotacoes() {
        return cotacoes;
    }
    public void adicionarCotacao(float cotacao){
        if(this.cotacoes.getTamanhoFila() == 10){
            this.cotacoes.removerFila();
        }
        this.cotacoes.adicionarFila(cotacao);
    }

    public String getNome() {
        return nome;
    }

}
