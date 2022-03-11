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
public class Aluno extends Cadastro {
     // criando classe aluno que e uma subclasse de cadastro
    private float altura;
    private float peso;
    private int objetivoTreino;
    // criando construtor da classse pessoa
    public Aluno(String nome, String sexo, int rg,String cpf,String endereco,
            String bairro,int cep,int telefone, float altura, float peso, int objetivoTreino) {
        super(nome, sexo, rg,cpf,endereco,bairro,cep,telefone);
        this.altura = altura;
        this.peso = peso;
        this.objetivoTreino= objetivoTreino;
    }
    // metodo para pegar altura
    public float getAltura() {
        return altura;
    }
    // metodo para setar altura
    public void setAltura(float altura) {
        this.altura = altura;
    }
    // metodo para pegar peso
    public float getPeso() {
        return peso;
    }
    // metodo para setar peso
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    // metodo para imprimir
    @Override
    public String toString() {
        return super.toString() + "\n" + "Altura: " +altura + "m" + "\n" +"Peso: " + peso + "Kg";
    }

    /**
     * @return the objetivoTreino
     */
    public int getObjetivoTreino() {
        return objetivoTreino;
    }

    /**
     * @param objetivoTreino the objetivoTreino to set
     */
    public void setObjetivoTreino(int objetivoTreino) {
        this.objetivoTreino = objetivoTreino;
    }
    
}
