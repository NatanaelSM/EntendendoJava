public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", "centro"),
    RIO_JANEIRO("RJ", "Rio de Janeiro", "sul");

    private String sigla;
    private String nome;
    private String localizacao;

    private EstadoBrasileiro(String sigla, String nome, String localizacao){
        this.sigla = sigla;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
