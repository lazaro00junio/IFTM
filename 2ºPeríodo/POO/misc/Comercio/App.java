public class App {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 2, 3500.00);
        Produto mouse = new Produto("Mouse Sem Fio", 10, 90.00);
        Produto teclado = new Produto("Teclado Mecânico", 5, 170.00);

        System.out.println("\t--- INICIALIZANDO SISTEMA DE ESTOQUE ---");
        System.out.println("Faturamento inicial do mês: " + EstoqueUtil.formatarMoeda(Venda.getTotalVendasMes()));
        System.out.println("----------------------------------------");
        System.out.println("Total de produtos cadastrados: " + Produto.getTotalProdutosCadastrados());
        System.out.println("----------------------------------------");
        System.out.println("Tentando vender 2 Notebooks sem promoção...");

        Venda vn = new Venda(2);

        if (vn.processarVenda(notebook)) {
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Item: " + notebook.getNome());
            System.out.println("Qtd: " + vn.getQuantidadeVendida());
            System.out.println("Preço Unitário: " + EstoqueUtil.formatarMoeda(notebook.getPrecoUnitario()));
            System.out.print("Promoção: ");
            if (notebook.isPromocao())
                System.out.println("SIM");
            else
                System.out.println("NÃO");
            System.out.println("Total da Venda: " + EstoqueUtil.formatarMoeda(vn.getValorTotalVenda()));
        } else {
            System.out.println("Erro: Estoque insuficiente para o produto " + notebook.getNome());
        }
        System.out.println("----------------------------------------");

        System.out.println("Tentando vender 6 Teclados (Estoque atual é " + teclado.getQuantidadeEstoque() + ")...");
        Venda vt = new Venda(6);
        if (vt.processarVenda(teclado))
            System.out.println("deu certo aqui ó");
        else
            System.out.println("Erro: Estoque insuficiente para o produto " + teclado.getNome());

        System.out.println("----------------------------------------");

        Venda vm = new Venda(5);

        System.out.println("Tentando vender 5 Mouses sem promoção...");
        if (vm.processarVenda(mouse)) {
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Item: " + mouse.getNome());
            System.out.println("Qtd: " + vm.getQuantidadeVendida());
            System.out.println("Preço Unitário: " + EstoqueUtil.formatarMoeda(mouse.getPrecoUnitario()));
            System.out.print("Promoção: ");
            if (notebook.isPromocao())
                System.out.println("SIM");
            else
                System.out.println("NÃO");
            System.out.println("Total da Venda: " + EstoqueUtil.formatarMoeda(vm.getValorTotalVenda()));
        } else {
            System.out.println("Erro: Estoque insuficiente para o produto " + mouse.getNome());
        }

        System.out.println("----------------------------------------");

        Venda vm2 = new Venda(5);

        System.out.println("Tentando vender 5 Mouses com promoção...");
        mouse.setPromocao(true);
        if (vm2.processarVenda(mouse)) {
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Item: " + mouse.getNome());
            System.out.println("Qtd: " + vm2.getQuantidadeVendida());
            System.out.println("Preço Unitário: " + EstoqueUtil.formatarMoeda(mouse.getPrecoUnitario()));
            System.out.print("Promoção: ");
            if (notebook.isPromocao())
                System.out.println("SIM");
            else
                System.out.println("NÃO");
            System.out.println("Total da Venda: " + EstoqueUtil.formatarMoeda(vm2.getValorTotalVenda()));
        } else {
            System.out.println("Erro: Estoque insuficiente para o produto " + mouse.getNome());
        }

        System.out.println("----------------------------------------");
        System.out.println("\t--- FECHAMENDO DO MÊS ---");
        System.out.println("Faturamento Total Acumulado: "+EstoqueUtil.formatarMoeda(Venda.getTotalVendasMes()));

    }
}