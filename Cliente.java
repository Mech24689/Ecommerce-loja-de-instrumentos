public class Cliente{
    String Nome;
    int IdCliente;
    int DataNasc;
    int CEP;
    String Endereco;
    int Telefone;
    String Email;
    String Senha;

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdCliente() {
        return this.IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getDataNasc() {
        return this.DataNasc;
    }

    public void setDataNasc(int DataNasc) {
        this.DataNasc = DataNasc;
    }

    public int getCEP() {
        return this.CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return this.Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void RealizarLogin(){}
    public void RealizarCadastro(){}
    public void EditarDados(){}
    public void DeletarConta(){}
    public void consultarCliente(){}
    public void Comprar(){}
    public void HistoricoDePedidos(){}

}