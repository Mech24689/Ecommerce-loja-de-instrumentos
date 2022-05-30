public class ListaDePedidos{
    int NumPedidos;
    Pedido pedido = new Pedido();
    Cliente cliente = new Cliente();
    Produtos produtos = new Produtos();

    public int getNumPedidos() {
        return this.NumPedidos;
    }

    public void setNumPedidos(int NumPedidos) {
        this.NumPedidos = NumPedidos;
    }

    public double SomarPedidos(Double valor){
        return valor;
    }
}