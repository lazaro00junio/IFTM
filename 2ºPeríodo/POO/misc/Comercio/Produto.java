public class Produto{
    private String nome;
    private int quantidadeEstoque;
    private double precoUnitario;
    private boolean promocao;
    private static  int totalProdutosCadastrados;

    public Produto(String nome, int quantidadeEstoque, double  precoUnitario){
        this.nome=nome;
        this.quantidadeEstoque=quantidadeEstoque;
        this.precoUnitario=precoUnitario;
        totalProdutosCadastrados++;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) throws Exception{
        
        if(quantidadeEstoque<0){
            throw new Exception("A quantidade não pode ser negativa!");
        }else{
            this.quantidadeEstoque=quantidadeEstoque;
        }
    }

    public void setPrecoUnitario(double precoUnitario) throws Exception{
        if(precoUnitario<=0){
            throw new Exception("A quantidade precisa ser maior que zero!");
        }else{
            this.precoUnitario = precoUnitario;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    
}