import java.util.ArrayList;
import java.util.List;

public class Corretora {
    private List<Acao> listaAcoes;

    public Corretora() {
        listaAcoes = new ArrayList<Acao>();
    }

    private Acao buscarAcao(String nome){
        for (int i = 0; i < listaAcoes.size(); i++) {
            Acao acao = listaAcoes.get(i);
            if(acao.getNome().equalsIgnoreCase(nome)){
                return acao;
            }
        }
        return null;
    }
    public void adicionaAcaao(String nome){
        if(buscarAcao(nome)== null){
            Acao acao = new Acao(nome);
            listaAcoes.add(acao);
        }else {
            System.out.println("Ação ja existe");
        }
       
    }

    public void addCotacao(String nome, float cotacao){
        Acao acao = buscarAcao(nome);
        if(acao != null){
            acao.adicionarCotacao(cotacao);
        }else {
            System.out.println("Ação não existe");
        }
    }

    public void snapshot(String nome){
        if(listaAcoes.isEmpty()){
            System.out.println("Não existe ações");
        }else {
            for(Acao acao : listaAcoes){
                System.out.println("Ação: " + acao.getNome() + "Cotações: " + acao.getCotacoes());
                
            }
        }
    }

    public void excluirAcao(String nome){
        Acao acao = buscarAcao(nome);
        if(acao != null){
            listaAcoes.remove(acao);
        }else {
            System.out.println("Ação não existe");
        }
    }
}
