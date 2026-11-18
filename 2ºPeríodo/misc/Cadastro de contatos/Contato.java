public class Contato{
    private String nome;
    private String telefone;
    private String celular;
    private String email;
    
    public Contato(String nome, String telefone, String celular, String email){
        this.nome=nome;
        this.telefone=telefone;
        this.celular=celular;
        this.email=email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    
}