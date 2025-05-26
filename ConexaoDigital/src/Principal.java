import DigitalConexao.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(136);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

//        DigitalConexao.modelos.Pessoa pessoa = new DigitalConexao.modelos.Pessoa();
//        pessoa.saudacao();
//
//        DigitalConexao.modelos.Calculadora calculadora = new DigitalConexao.modelos.Calculadora();
//        int resultado = calculadora.dobrarNumero(5);
//        System.out.println(resultado);
//
//        DigitalConexao.modelos.Musica musica = new DigitalConexao.modelos.Musica();
//        musica.titulo = "Yeshua";
//        musica.artista = "Jose Jr";
//        musica.anoDeLancamento = 2019;
//
//        musica.exibeFichaTecnica();
//        musica.avalia(10);
//        musica.avalia(8);
//        musica.avalia(9);
//        System.out.println("Quantidade de avalaiações: "+musica.numAvaliacoes);
//        System.out.println("Média de avaliações: "+musica.pegaMedia());
//
//        DigitalConexao.modelos.Carro carro = new DigitalConexao.modelos.Carro();
//        carro.modelo = "Onix";
//        carro.ano = 2014;
//        carro.cor = "Vermelho";
//        carro.exibeFichaTecnica();
//        System.out.println("O carro tem: "+carro.calculaAno()+" anos de idade");
//
//        DigitalConexao.modelos.Aluno aluno = new DigitalConexao.modelos.Aluno();
//        aluno.nome = "Felipe";
//        aluno.idade = 24;
//        aluno.exibeInformacoesAluno();

    }
}
