class Cliente{
    private int codigoCliente;
    private String nomeCliente;
    private String dataNascimento;
    private String cpf;

    public Cliente(int codigo, String nome, String dataNascimento, String cpf) {
        this.codigoCliente = codigo;
        this.nomeCliente = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}
