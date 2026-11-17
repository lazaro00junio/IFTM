public class Venda{
    private int quantidadeVendida;
    private double valorTotalVenda;
    private static double  totalVendasMes;

    public Venda(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    
    public boolean processarVenda(Produto p){
        if(EstoqueUtil.temEstoqueDisponivel(p.getQuantidadeEstoque(), quantidadeVendida)){
            try{
            p.setQuantidadeEstoque(p.getQuantidadeEstoque()-quantidadeVendida);
            if(p.isPromocao() && quantidadeVendida>=3){
                valorTotalVenda=p.getPrecoUnitario()*0.9*quantidadeVendida;
                totalVendasMes+=valorTotalVenda;
            }else{
                valorTotalVenda=p.getPrecoUnitario()*quantidadeVendida;
                totalVendasMes+=valorTotalVenda;
            }
            return true;
            } catch(Exception e){
                return false;
            }   
        }
        return false;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public static double getTotalVendasMes() {
        return totalVendasMes;
    }

}