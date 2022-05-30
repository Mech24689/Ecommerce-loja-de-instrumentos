public class Produtos {
    String Tipo;
    int IdProduto;
    String NomeProd;
    String Marca;
    String caracteristicaProd;
    double Preco;

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getIdProduto() {
        return this.IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public String getNomeProd() {
        return this.NomeProd;
    }

    public void setNomeProd(String NomeProd) {
        this.NomeProd = NomeProd;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCaracteristicaProd() {
        return this.caracteristicaProd;
    }

    public void setCaracteristicaProd(String caracteristicaProd) {
        this.caracteristicaProd = caracteristicaProd;
    }

    public double getPreco() {
        return this.Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public void CadastrarProduto(){}
    public void AlterarProduto(){}
    public void ExcluirProduto(){}
    public void ConsultarProduto(){}
}
