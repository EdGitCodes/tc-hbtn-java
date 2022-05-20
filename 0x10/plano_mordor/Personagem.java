import comida.*;
import humor.*;

public class Personagem {

    private int pontosDeFelicidade;

    public Humor obterHumorAtual(){

        if(this.pontosDeFelicidade < -5){
            return new Irritado();
        }else if(pontosDeFelicidade <= 0 && pontosDeFelicidade >= -5){
            return new Triste();
        }else if(pontosDeFelicidade <= 15 && pontosDeFelicidade >= 1){
            return new Feliz();
        }else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida: comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    public String toString(){
       return (pontosDeFelicidade + " - " + obterHumorAtual().humor() );
    }
}
