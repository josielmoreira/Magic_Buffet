/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author Josiel
 */
public abstract class AbstractPessoa {

    private String cpf;
    private String Pnome;
    private int rg;
    private String rua;
    private int numero;
    private String bairro;
    private String tipoPessoa;
    private String cep;
    private String telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPnome() {
        return Pnome;
    }

    public void setPnome(String Pnome) {
        this.Pnome = Pnome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AbstractPessoa(String cpf, String Pnome, int rg, String rua, int numero,
            String bairro, String tipoPessoa, String cep, String telefone) {

        this.cpf = cpf;
        this.Pnome = Pnome;
        this.rg = rg;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.tipoPessoa = tipoPessoa;
        this.cep = cep;
        this.telefone = telefone;
    }
}
