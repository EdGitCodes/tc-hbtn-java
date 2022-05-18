public class PersonagemGame {

    private int saudeAtual;
    private String status;
    private String nome;
    private String nomeFix;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        if(nome != null && nome != "") {
            this.nomeFix = nome;
        }
    }

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

    public String getNome (){
        if(nome == null || nome == "") {
         this.nome = nomeFix;
        }else{
            this.nome = nome;
        }
        return nome;
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
