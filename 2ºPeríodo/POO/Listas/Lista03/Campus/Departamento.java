public class Departamento {
    private String nome;
    private String localizacao;

    public Departamento(String nome, String localizacao){
        this.nome=nome;
        this.localizacao=localizacao;
    }

    public String exibe(){
        return "O departamento "+nome+" está localizado em "+localizacao+".";
    }
}
