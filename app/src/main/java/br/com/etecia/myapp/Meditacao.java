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
    //criando os métodos get e set - alt+insert selecione getters and setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public int getImgMeditacao() {
        return imgMeditacao;
    }

    public void setImgMeditacao(int imgMeditacao) {
        this.imgMeditacao = imgMeditacao;
    }
}
