import java.util.ArrayDeque;
import java.util.Queue;

public class Acao {
    private Queue<Float> cotacoes;
    private String nome;

    public Acao(String nome) {
        this.cotacoes = new ArrayDeque<>();
        this.nome = nome;
    }
    
    public Queue<Float> getCotacoes() {
        return cotacoes;
    }
    public void adicionarCotacao(float cotacao){
        if(this.cotacoes.size() == 10){
            this.cotacoes.poll();
        }
        this.cotacoes.offer(cotacao);
    }

    public String getNome() {
        return nome;
    }

}
