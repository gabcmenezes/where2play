package com.example.test_band;

public class Opportunity {
    private String nomeEvento;
    private String cidade;
    private String estiloMusical;
    private String data;
    private String hora;
    private int bandasCandidatas;

    public Opportunity(String nomeEvento, String cidade, String estiloMusical, String data, String hora, int bandasCandidatas) {
        this.nomeEvento = nomeEvento;
        this.cidade = cidade;
        this.estiloMusical = estiloMusical;
        this.data = data;
        this.hora = hora;
        this.bandasCandidatas = bandasCandidatas;
    }

    // Métodos getters para acessar os campos privados
    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public int getBandasCandidatas() {
        return bandasCandidatas;
    }
}
