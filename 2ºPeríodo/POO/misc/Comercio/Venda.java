
import com.sun.source.tree.TryTree;

public class Venda{
    private int quantidadeVendida;
    private double valorTotalVenda;
    private static double  totalVendaMes;

    public Venda(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    
    public boolean processarVenda(Produto p){
        if(EstoqueUtil.temEstoqueDisponivel(p.getQuantidadeEstoque(), quantidadeVendida)){
            p.setQuantidadeEstoque(p.getQuantidadeEstoque()-quantidadeVendida);
            valorTotalVenda=p.getPrecoUnitario()*quantidadeVendida;
            if()
            totalVendaMes+=totalVendaMes;
            return true;
        }
        return false;
    }
}