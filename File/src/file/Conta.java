package file;

import java.io.Serializable;

public final class Conta implements Serializable {
    private String nome;
    private String sobrenome;
    private double saldo;
    private int anoNascimento;

    public Conta(String nome, String sobrenome, double saldo, int anoNascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setSaldo(saldo);
        setAnoNascimento(anoNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}