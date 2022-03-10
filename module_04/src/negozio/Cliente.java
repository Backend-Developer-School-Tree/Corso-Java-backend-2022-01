package negozio;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private int eta;

    public Cliente(String codiceCliente, String nome, int eta) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.eta = eta;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
