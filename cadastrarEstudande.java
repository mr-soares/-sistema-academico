package sistemaPaulo;

import java.util.Random;

import javax.swing.JOptionPane;

public class cadastrarEstudande {
    

    private String nome;
    private int matricula;


    cadastrarEstudande(String nome){
        this.nome = nome;
    }

    public void gerarMatricula(){
        Random random = new Random();
        int numero = random.nextInt(20);
        this.matricula = numero;
        JOptionPane.showMessageDialog(null, "Sua matricula é: " + matricula  , "Matricula", JOptionPane.INFORMATION_MESSAGE);
    }
    public String toString(){
        String out = "Nome do aluno: "+ getNome() + ", matricula : "+ getMatricula()+ "\n";
        return out;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
