package Modelo;

public class Produto {

    private String nome;
    private String codigo;
    private double preco;
    private double frete;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    //condicional pra checagem se cliente recebe frete grátis  Laise + Isabelly
}