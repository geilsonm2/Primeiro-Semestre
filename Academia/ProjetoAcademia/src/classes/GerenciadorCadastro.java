package classes;
import java.util.ArrayList;
import javax.swing.JOptionPane;




/**
 *
 * @author gabri
 */
public class GerenciadorCadastro {
     // criando gerenciador de cadastros
    private ArrayList alunos = new ArrayList();
    private ArrayList trainers = new ArrayList();
    // construtor vazio
    public GerenciadorCadastro() {}
    // metodo para cadastrar aluno
    public void cadastraAluno(Aluno a) {
        // coloca o aluno criado na lista de alunos
        getAlunos().add(a);
    }
    // metodo para listar aluno
    public void listaAluno() {
        // for de 0 ate o tamanho da lista de alunos
        for (int i = 0; i < getAlunos().size(); i++) {
            // imprime o aluno no index i
            JOptionPane.showMessageDialog (null, "Indice: "+ i+ "\n\n" + getAlunos().get(i).toString());
        }
    }
    // metodo para alterar aluno
    public void alteraAluno(Aluno a) {
        // for de 0 ate o tamanho da lista de alunos
        for (int i = 0; i < getAlunos().size(); i++) {
           
        }
    }
    // metodo para deletar aluno
    public void deletaAluno(int index) {
        // for de 0 ate o tamanho da lista de alunos
        for (int i = 0; i < getAlunos().size(); i++) {
            // verifica se o rg passado e igual ao rg do index i 
            if(i == index) {
                // se for igual ele deleta o aluno do index i
                getAlunos().remove(i);
            }
        }
    }
    // metodo para cadastrar personal
    public void cadastraPersonal(Personal p ) {
      
        getTrainers().add(p);
    }
    // metodo para listar personal
    public void listaPersonal() {
        // for de 0 ate o tamanho da lista de trainers
        for (int i = 0; i < getTrainers().size(); i++) {
            // imprime o personal do index i
            JOptionPane.showMessageDialog (null, "Indice: "+ i+ "\n\n" + getTrainers().get(i).toString());
        }
    }
    // metodo para alterar personal
    public void alteraPersonal(Personal p ) {
     
        }
     public void deletaPersonal(int index) {
        // for de 0 ate o tamanho da lista de alunos
        for (int i = 0; i < getTrainers().size(); i++) {
            // verifica se o rg passado e igual ao rg do index i 
            if(i == index) {
                // se for igual ele deleta o aluno do index i
                getTrainers().remove(i);
            }
        }
    }

    /**
     * @return the alunos
     */
    public ArrayList getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the trainers
     */
    public ArrayList getTrainers() {
        return trainers;
    }

    /**
     * @param trainers the trainers to set
     */
    public void setTrainers(ArrayList trainers) {
        this.trainers = trainers;
    }
    }
   