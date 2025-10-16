import java.util.ArrayList;

public class Fila {
    //cotações
    private ArrayList<Float> fila;

    public Fila() {
        fila = new ArrayList<Float>();
    }

    public void adicionarFila(float cotacao){
        fila.add(cotacao);
    }

    public void removerFila(){
        fila.remove(0);
    }

    public int getTamanhoFila(){
        return fila.size();
    }
    public void exibirFila(){
        System.out.println("[");
        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.get(i));
        }
        System.out.println("]");
    }

}
