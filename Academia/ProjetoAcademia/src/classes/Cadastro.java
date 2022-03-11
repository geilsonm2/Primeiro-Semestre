package classes;

/**
 *
 * @author gabri
 */
public abstract class Cadastro {
     // criando classe cadastro
    private String nome;
    private String sexo;
    private int rg;
    private String cpf; 
    private String endereco;
    private String bairro;
    private int cep; 
    private int telefone; 
    // construtor da classe cadastro
    public Cadastro(String nome, String sexo, int rg,String cpf,
           String endereco, String bairro,int cep, int telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;           
    }
    // metodo para pegar o nome
    public String getNome() {
        return nome;
    }
    // metodo para setar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    // metodo para pegar o sexo
    public String getSexo() {
        return sexo;
    }
    // metodo para setar o sexo
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // metodo para pegar rg
    public int getRg() {
        return rg;
    }
    // metodo para setar rg
    public void setRg(int rg) {
        this.rg = rg;
    }
    
   

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Sexo: " + sexo + "\n" + "RG: " + rg +"\n"+ "Cpf: " + cpf + "\n" +
        "Endereço: "+ endereco+ "\n" + "Bairro: " + bairro + "\n" +"Cep: "+ cep + "\n";
    }
}

enum Sexo {
    M,
    F
}
    
