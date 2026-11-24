import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList <Departamento> deptos;
    
    public Universidade(String nome){
        this.nome=nome;
        this.deptos = new ArrayList<>();
    }

    public void criaDepto(String nome,String localizacao){
        Departamento depto = new Departamento(nome,localizacao);
        this.deptos.add(depto);
    }

    public String exibe(){
        return "A universidade "+nome+" possui "+deptos.size()+" departamentos.";
    }

    public String getNome(){
        return nome;
    }
}
