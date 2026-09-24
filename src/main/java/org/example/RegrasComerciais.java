package org.example;

public class RegrasComerciais {

    private RegrasComerciais() {};
    private static RegrasComerciais instance = new RegrasComerciais();
    public static RegrasComerciais getInstance() {
        return instance;
    }

    private double descontoMaximo;
    private String segmentoAtivo;

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public String getSegmentoAtivo() {
        return segmentoAtivo;
    }

    public void setSegmentoAtivo(String segmentoAtivo) {
        this.segmentoAtivo = segmentoAtivo;
    }
}