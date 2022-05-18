public class PersonagemGame {

    private int quantidadeDeDano;
    private int quantidadeDeCura;
    private int saudeAtual;
    private String status;
    private String nome;


    public int tomarDano(int quantidadeDeDano) {
        if(saudeAtual > 0){
            this.saudeAtual = this.saudeAtual - quantidadeDeDano;
            if (saudeAtual < 0) {
                this.saudeAtual = 0;
            }
        }else{
            this.saudeAtual = 0;
        }
        return saudeAtual;
    }

    public int receberCura(int quantidadeDeCura) {
        if(saudeAtual < 100){
            this.saudeAtual = quantidadeDeCura + this.saudeAtual;
            if (saudeAtual > 100) {
                this.saudeAtual = 100;
            }
        }
        return saudeAtual;
    }

    public String getStatus(){
        if(saudeAtual == 0){
            this.status = "morto";
        }else {
            this.status = "vivo";
        }
        return status;
    }

    public int getSaudeAtual(){
        return saudeAtual;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setSaudeAtual (int saudeAtual){
        this.saudeAtual = saudeAtual;
    }
}
