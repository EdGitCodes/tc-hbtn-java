import java.util.ArrayList;

public class Pedido {


    private ArrayList<PedidoCookie> cookies = new ArrayList<PedidoCookie>();
    private int quantidadeRemovidos = 0;
    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie sabor) {
        cookies.add(sabor);
    }

    public Object obterTotalCaixas() {
        int total = 0;
        for(PedidoCookie l: cookies){
            total += l.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        quantidadeRemovidos = 0;
        for(PedidoCookie l: cookies) {
            if(l.getSabor().equals(sabor)){
               quantidadeRemovidos += l.getQuantidadeCaixas();
            }
        }
        cookies.removeIf(total -> total.getSabor().equals(sabor));
        return quantidadeRemovidos;
    }
}
