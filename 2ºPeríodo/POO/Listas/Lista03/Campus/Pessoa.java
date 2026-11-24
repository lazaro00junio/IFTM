public class Pessoa {
    private String nome;
    private Universidade universidade;
    private String local;

    public Pessoa(String nome, String local){
        this.nome=nome;
        this.local=local;
    }

    public void exibe(){
        return nome+" trabalha no setor "+local;
    }
}
