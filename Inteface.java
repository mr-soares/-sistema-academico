package sistemaPaulo;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import javax.swing.*;
import javax.swing.text.html.Option;
public class Inteface {
public static void main(String[] args) {
    ArrayList<Object> turma1= new ArrayList<>();
    ArrayList<Object> turma2= new ArrayList<>();
    ArrayList<Object> diciplina = new ArrayList<>();
    boolean sair = true;
    while (sair) {
        String option = JOptionPane.showInputDialog(null,"(01) Cadastrar Aluno" +"\n"+ "(02) Cadastrar Diciplina"+ "\n"+ "(03) Ver Turma"+ "\n"+ "(04) Ver diciplinas"+ "\n"+ "(05) Sair", "Menu",JOptionPane.QUESTION_MESSAGE );
        switch (option) {
            case "1":
            String nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno?");
               cadastrarEstudande aluno1= new cadastrarEstudande(nome);
                aluno1.gerarMatricula();
                String tdesejada = JOptionPane.showInputDialog(null, "Qual a turma do estudante? "+"\n"+ "turma 1" + "\n"+ "turma 2");
                if (tdesejada.equals("1")) {
                    turma1.add(aluno1);
                    JOptionPane.showMessageDialog(null,"aluno cadastrado na turma 1","aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(tdesejada.equals("2")) {
                    turma2.add(aluno1);
                    JOptionPane.showMessageDialog(null,"aluno cadastrado na turma 2","aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"digite uma opção valida","aviso", JOptionPane.WARNING_MESSAGE);
                }
                break;
                case "2":
                String nomeDiciplina = JOptionPane.showInputDialog(null, "Qual o nome da diciplina?");
                caddiciplina disciplina = new caddiciplina(nomeDiciplina);
                diciplina.add(disciplina);
                JOptionPane.showMessageDialog(null,"disciplina adicionada com sucesso","sucesso", JOptionPane.INFORMATION_MESSAGE);
                break;
                case "3":
                String escolha = JOptionPane.showInputDialog(null,"qual turma você quer ver?");
                if (escolha.equals("1")){
                     String a = "";
                for (Object lista : turma1) {
                    a += lista.toString();
                    
                }
                JOptionPane.showMessageDialog(null,"lista de alunos turma 1" + "\n" + a ,"lista", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (escolha.equals("2")){
                    String a = "";
                    for (Object lista : turma2) {
                        a += lista.toString();
                        
                    }
                    JOptionPane.showMessageDialog(null,"lista de alunos turma 2" + "\n" + a ,"lista", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"digite uma opção valida","aviso", JOptionPane.WARNING_MESSAGE);
                }
                break;
                case "4":
                    String a = "";
               for (Object lista : diciplina) {
                   a += lista.toString();
               }
               JOptionPane.showMessageDialog(null,"lista de disciplinas" + "\n" + a ,"lista", JOptionPane.INFORMATION_MESSAGE);
                break; 
                
                case "5":
                if (option.equals("5")){
                    sair = false;
                }
                break;
            }
        }
    }
}

    

