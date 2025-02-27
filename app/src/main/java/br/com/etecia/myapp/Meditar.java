package br.com.etecia.myapp;

public class Meditar {
    private String tituloMeditar;
    private String textoMeditar;
    private int imgMeditar;

    public Meditar(String tituloMeditar, String textoMeditar, int imgMeditar) {
        this.tituloMeditar = tituloMeditar;
        this.textoMeditar = textoMeditar;
        this.imgMeditar = imgMeditar;
    }

    public String getTituloMeditar() {
        return tituloMeditar;
    }

    public void setTituloMeditar(String tituloMeditar) {
        this.tituloMeditar = tituloMeditar;
    }

    public String getTextoMeditar() {
        return textoMeditar;
    }

    public void setTextoMeditar(String textoMeditar) {
        this.textoMeditar = textoMeditar;
    }

    public int getImgMeditar() {
        return imgMeditar;
    }

    public void setImgMeditar(int imgMeditar) {
        this.imgMeditar = imgMeditar;
    }
}
