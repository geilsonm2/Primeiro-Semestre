package excecutavel;

import classes.Aluno;
import classes.GerenciadorCadastro;
import classes.Personal;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void cadastraAluno(GerenciadorCadastro g) {
        String nome = JOptionPane.showInputDialog("Informe o nome");
        String sexo = JOptionPane.showInputDialog("Informe o sexo com F ou M ");
        int rg = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o rg")
        );
        String cpf = JOptionPane.showInputDialog("Informe o cpf");
        String endereco = JOptionPane.showInputDialog("Informe o endereco");
        String bairro = JOptionPane.showInputDialog("Informe o bairro");
        int cep = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o cep")
        );
        int telefone = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o telefone")
        );

        float altura = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o altura")
        );
        float peso = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o peso")
        );
        int objetivoTreino = Integer.parseInt(
                JOptionPane.showInputDialog("Qual é o seu objetivo com o treino ?"
                        + "\n1-Cardiovascular"
                        + "\n2-Ganho Muscular Hipertrofia"
                        + "\n3-Terceeira idade"
                        + "\n4-Perda de peso")
        );
        String mensagem;
        switch (objetivoTreino) {
            case 1:
                mensagem = "Cardiovascular\n"
                        + "\n"
                        + "Treino A - Máquinas e corrida\n"
                        + "Elíptico - (5m+)\n"
                        + "Pausas entre exercícios (2m+)\n"
                        + "Esteira em ritmo médio (15m+)\n"
                        + "Pausas entre exercícios (2m+)\n"
                        + "Bicicleta - (20m+)\n"
                        + "Treino B - Peso livre e Bodyweight\n"
                        + "Polichinelo (20s) / descanso (10s) - avanço com salto (20) x 2\n"
                        + "Burpee (20s) / descanso (10s) - altar à corda (20s) x 2\n"
                        + "Kettlebell swing (Chaleira) (20s) + Saltear (20s) x 2\n"
                        + "Agachamento com salto (20s)";

                break;
            case 2:
                mensagem = "Ganho muscular - Hipertrofia\n"
                        + "\n"
                        + "Em pirâmide (acréscimo de peso e decréscimo de repetições)\n"
                        + "Treino A - Costas/Bíceps\n"
                        + "Puxada frente (18/15/12/8) \n"
                        + "Puxada Triângulo (18/15/12/8) \n"
                        + "Remada Baixa (18/15/12/8) \n"
                        + "Remada Curvada (18/15/12/8) \n"
                        + "Rosca Direta (15/12/8)\n"
                        + "Rosca Alternada (15/12/8)\n"
                        + "Rosca Scott (15/12/8)\n"
                        + "Rosca Inversa (15/12/8)\n"
                        + "Extensor Punho (15/12/8)\n"
                        + "Treino B - Tríceps/Peitoral\n"
                        + "Supino Reto (18/15/12/8) \n"
                        + "Supino Inclinado (18/15/12/8) \n"
                        + "Crucifixo Reto (18/15/12/8)  \n"
                        + "Crucifixo Voador (18/15/12/8) \n"
                        + "Tríceps Testa (15/12/8)\n"
                        + "Polia Alta (15/12/8)\n"
                        + "Tríceps Corda (15/12/8)\n"
                        + "Treino C - Pernas\n"
                        + "Cadeira Extensora (18/15/12/8) \n"
                        + "Cadeira Flexora (18/15/12/8) \n"
                        + "Reveze entre treinos: Leg Press e Agachamento com barra livre (18/15/12/8)  \n"
                        + "Cadeira Adutora (18/15/12/8) \n"
                        + "Cadeira Abdutora (18/15/12/8) \n"
                        + "Treino D - Ombros, trapézio, abdômen\n"
                        + "Desenvolvimento Frontal (18/15/12/8)\n"
                        + "Elevação Lateral (18/15/12/8)\n"
                        + "Crucifixo Inverso (18/15/12/8)\n"
                        + "Shrugs (18/15/12/8)\n"
                        + "Crunch com Máquina até exaustão, pausas (10s), aumento de carga\n"
                        + "Crunch com Máquina Lateral até exaustão, pausas (10s), aumento de carga\n"
                        + "";

                break;
            case 3:
                mensagem = "Terceira Idade\n"
                        + "\n"
                        + "Treino A - Parte superior\n"
                        + "Remada na máquina (3x10)\n"
                        + "Desenvolvimento na máquina (3x10)\n"
                        + "Rosca direta com haltéres (3x10)\n"
                        + "Treino B - Parte inferior\n"
                        + "Cadeira extensora (3x10)\n"
                        + "Cadeira flexora (3x10)\n"
                        + "Prancha isométrica\n"
                        + "Gêmeos com apoio (3x10)\n"
                        + "Leg press horizontal (3x10)\n"
                        + "Gêmeos com apoio (3x10)\n"
                        + "Treino C - Aeróbico\n"
                        + "Pausas entre exercícios (2m+)\n"
                        + "Esteira em ritmo médio (10m+)\n"
                        + "Elíptico - (4m+)\n"
                        + "Bicicleta - (10m+)";

                break;
            case 4:
                mensagem = " Perda de peso\n"
                        + "\n"
                        + "Semanal de A,B,A,B e A\n"
                        + "Treino A 3x por semana\n"
                        + "Aquecimento em esteira (10m)\n"
                        + "Leg Press (3x12)\n"
                        + "Puxador (3x10)\n"
                        + "Supino com Halter (3x12)\n"
                        + "Cadeira Flexora (3x12)\n"
                        + "Cadeira extensora (3x12)\n"
                        + "Cadeira Abdutora (3x12)\n"
                        + "Cadeira Adutora (3x12)\n"
                        + "Supino com Halter (3x12)\n"
                        + "Abdominal Reto (3x20)\n"
                        + "Treino B 2x por semana\n"
                        + "Elíptico - (5m+)\n"
                        + "Pausas entre exercícios (2m+)\n"
                        + "Esteira em ritmo médio (15m+)\n"
                        + "Pausas entre exercícios (2m+)\n"
                        + "Bicicleta - (20m+)";

                break;
                 default:
                mensagem = "Opção inválida";
                break;

        }
        
                JOptionPane.showMessageDialog(null,mensagem);

        // criacao do aluno
        Aluno a = new Aluno(nome, sexo, rg, cpf, endereco, bairro, cep, telefone, altura, peso, objetivoTreino);

        g.cadastraAluno(a);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso !! ");
    }

    public static void cadastraPersonal(GerenciadorCadastro g) {
        String nome = JOptionPane.showInputDialog("Informe o nome");
        String sexo = JOptionPane.showInputDialog("Informe o sexo com F ou M ");
        int rg = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o rg")
        );
        String cpf = JOptionPane.showInputDialog("Informe o cpf");
        String endereco = JOptionPane.showInputDialog("Informe o endereco");
        String bairro = JOptionPane.showInputDialog("Informe o bairro");
        int cep = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o cep")
        );
        int telefone = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o telefone")
        );

        float salario = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o seu salario")
        );

        Personal p = new Personal(nome, sexo, rg, cpf, endereco, bairro, cep, telefone, salario);

        g.cadastraPersonal(p);
        JOptionPane.showMessageDialog(null, "Personal cadastrado com sucesso !! ");
    }

    public static void alteraAluno(GerenciadorCadastro g) {
        int indiceAluno, indiceAlteracao;
        //aluno []listaAluno
        g.listaAluno();
        indiceAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um dos alunos da lista"));
        indiceAlteracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções de alteração\n 1-Nome\n 2-Sexo\n 3-RG\n 4-CPF\n \n"
                + "5-Endereço\n 6-Bairro\n 7-Cep\n 8-Telefone\n 9-Altura\n 10-Peso\n 11-Objetivo\n 12-Mensalidade"));

        ArrayList listaAlunos = g.getAlunos();
        Aluno a;
        switch (indiceAlteracao) {
            case 1:

                String novoNome = JOptionPane.showInputDialog("Digite o novo nome");

                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setNome(novoNome);

                break;
            case 2:
                String novoSexo = JOptionPane.showInputDialog("Digite o novo sexo");
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setSexo(novoSexo);
                break;
            case 3:
                int novorg = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo RG"));
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setRg(novorg);
                break;
            case 4:
                String novocpf = JOptionPane.showInputDialog("Digite o novo sexo");
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setCpf(novocpf);
                break;
            case 5:
                String novoendereco = JOptionPane.showInputDialog("Digite o novo endereço");
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setEndereco(novoendereco);
                break;
            case 6:
                String novobairro = JOptionPane.showInputDialog("Digite o novo bairro");
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setBairro(novobairro);
                break;
            case 7:
                int novocep = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo CEP"));
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setCep(novocep);
                break;
            case 8:
                int novotelefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo telefone"));
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setTelefone(novotelefone);
                break;
            case 9:
                float novoaltura = Float.parseFloat(JOptionPane.showInputDialog("Digite a nova altura"));
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setAltura(novoaltura);
                break;
            case 10:
                float novopeso = Float.parseFloat(JOptionPane.showInputDialog("Digite o novo peso"));
                a = (Aluno) listaAlunos.get(indiceAluno);
                a.setPeso(novopeso);
                break;
            case 11:
                // String objetivoCurso = JOptionPane.showInputDialog("Digite o novo objetivo do curso");
                //a = (Aluno) listaAlunos.get(indiceAluno);
                // a.setObjetivoCurso(objetivoCurso);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }

    public static void alteraPersonal(GerenciadorCadastro g) {
        int indicePersonal, indiceAlteracao;
        //aluno []listaAluno
        g.listaPersonal();
        indicePersonal = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um dos personais da lista"));
        indiceAlteracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções de alteração\n 1-Nome\n 2-Sexo\n 3-RG\n 4-CPF\n \n"
                + "5-Endereço\n 6-Bairro\n 7-Cep\n 8-Telefone\n 9-salario"));

        ArrayList listaPersonal = g.getTrainers();
        Personal p;
        switch (indiceAlteracao) {
            case 1:

                String novoNome = JOptionPane.showInputDialog("Digite o novo nome");

                p = (Personal) listaPersonal.get(indicePersonal);
                p.setNome(novoNome);

                break;
            case 2:
                String novoSexo = JOptionPane.showInputDialog("Digite o novo sexo");
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setSexo(novoSexo);
                break;
            case 3:
                int novorg = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo RG"));
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setRg(novorg);
                break;
            case 4:
                String novocpf = JOptionPane.showInputDialog("Digite o novo sexo");
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setCpf(novocpf);
                break;
            case 5:
                String novoendereco = JOptionPane.showInputDialog("Digite o novo endereço");
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setEndereco(novoendereco);
                break;
            case 6:
                String novobairro = JOptionPane.showInputDialog("Digite o novo bairro");
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setBairro(novobairro);
                break;
            case 7:
                int novocep = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo CEP"));
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setCep(novocep);
                break;
            case 8:
                int novotelefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo telefone"));
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setTelefone(novotelefone);
                break;

            case 10:
                float novoSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o novo Salario"));
                p = (Personal) listaPersonal.get(indicePersonal);
                p.setSalario(novoSalario);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }

    public static void main(String[] args) {

        boolean continuar = true;
        GerenciadorCadastro g = new GerenciadorCadastro();
        Aluno a = new Aluno("Everton", "M", 436269144, "37079597838",
                "Avenida Adolfo Pinheiro 1850", "Alto da Boa Vista", 3474003, 985669556,
                1.75f, 102f, 2);
        g.cadastraAluno(a);
        Aluno b = new Aluno("Isabela", "F", 535405458, "47786170880",
                "Doutor Nicolau de Souza Queirós 759", "Vila Mariana", 04100502, 974722252,
                1.58f, 130f, 1);
        g.cadastraAluno(b);

        while (continuar) {

            String mensagem = String.join("\n",
                    "Escolha a opção abaixo ",
                    "1- Cadastra Aluno",
                    "2- Lista Aluno",
                    "3- Altera Aluno",
                    "4- Deleta Aluno",
                    "5- Cadastra Personal",
                    "6- Lista Personal ",
                    "7- Altera Personal",
                    "8- Deleta Personal",
                    "9- Sair"
            );
            String opcao = JOptionPane.showInputDialog(mensagem);

            switch (opcao) {
                case "1":
                    cadastraAluno(g);
                    break;
                case "2":
                    g.listaAluno();
                    break;
                case "3":
                    alteraAluno(g);
                    break;
                case "4":
                    g.listaAluno();
                    int indiceAluno = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dos alunos para deletar"));
                    g.deletaAluno(indiceAluno);
                    break;
                case "5":
                    cadastraPersonal(g);
                    break;
                case "6":
                    g.listaPersonal();
                    break;
                case "7":
                    alteraPersonal(g);
                    break;
                case "8":
                    g.listaPersonal();
                    int indicePersonal = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dos personais para deletar"));
                    g.deletaPersonal(indicePersonal);
                    break;
                case "9":
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }

    }

}
