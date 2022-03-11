/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author gabri
 */
public class Personal extends Cadastro {
     // criando classe personal que e uma subclasse de cadastro
    private float salario;
    // criando construtor da classe personal
    public Personal(String nome, String sexo, int rg,String cpf,
            String endereco,String bairro,int cep, int telefone, float salario) {
        super(nome, sexo, rg, cpf,endereco,bairro,cep,telefone);
        this.salario = salario;
    }
    // metodo para pegar salario
    public float getSalario() {
        return salario;
    }
    // metodo para setar salario
    public void setSalario(float salario) {
        this.salario = salario;
    }
    // metodo para imprimir
    @Override
    public String toString() {
        return super.toString() + "\n"+"Salario: "  + salario;
    }
    
}
