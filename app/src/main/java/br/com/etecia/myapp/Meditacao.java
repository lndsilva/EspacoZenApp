package br.com.etecia.myapp;

public class Meditacao {
    private String titulo;
    private String subtitulo;
    private String orientacao;
    private int imgMeditacao;

    //criando o construtor - alt+insert escolha construtor e selecione todas as variaveis

    public Meditacao(String titulo, String subtitulo, String orientacao, int imgMeditacao) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.orientacao = orientacao;
        this.imgMeditacao = imgMeditacao;
    }


    //criando os métodos get e set - alt+insert selecione getters and setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
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
