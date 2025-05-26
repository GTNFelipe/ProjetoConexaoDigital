package DigitalConexao.modelos;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }
    void avalia (double nota){
        avaliacao += nota;
        numAvaliacoes++;

    }
    double pegaMedia(){
        return avaliacao / 3;
    }
}
