package br.com.etecia.myapp;

public class Meditacao {
    private String nome;
    private String tempo;
    private String orientacao;
    private int imgMeditacao;

    //criando o construtor - alt+insert escolha construtor e selecione todas as variaveis


    public Meditacao(String nome, String tempo, String orientacao, int imgMeditacao) {
        this.nome = nome;
        this.tempo = tempo;
        this.orientacao = orientacao;
        this.imgMeditacao = imgMeditacao;
    }
}
