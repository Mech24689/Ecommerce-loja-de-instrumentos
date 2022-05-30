public class Pedido {
    int IdPedidos;
    int DataDeVenda;
    Cliente cliente = new Cliente();
    Produtos produtos = new Produtos();

    public int getIdPedidos() {
        return this.IdPedidos;
    }

    public void setIdPedidos(int IdPedidos) {
        this.IdPedidos = IdPedidos;
    }

    public int getDataDeVenda() {
        return this.DataDeVenda;
    }

    public void setDataDeVenda(int DataDeVenda) {
        this.DataDeVenda = DataDeVenda;
    }

    public void RealizarPedido(){}
    public double SomarProdutos(double valor){
        return valor;
    }
    public void GerarDataDeEntrega(){}
    public void GerarCpvtDePag(){}
    
}
