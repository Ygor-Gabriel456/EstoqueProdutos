/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoqueprodutos;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(){
    
    }
    
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Produto adicionado com sucesso");
        } else {
            System.out.println("Erro ao adicionar produto");
        }
    }

    public void removerProdutos(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Produto removido com sucesso");
        } else{ 
            System.out.println("Produto removido");
        }
    }
    
     public void exibirInfo() {
        System.out.printf("\nProduto: %s%nPreco: R$ %.2f%n" +
                "Quantidade: %d%nTotal: R$ %.2f%n",
                nome, preco, quantidade,  valorTotalEmEstoque());
    }
}
