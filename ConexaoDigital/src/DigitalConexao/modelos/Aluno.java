package DigitalConexao.modelos;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacoesAluno(){
        System.out.println("O nome do aluno é: "+nome);
        System.out.println("A idade de "+nome+": "+idade);
    }
}
