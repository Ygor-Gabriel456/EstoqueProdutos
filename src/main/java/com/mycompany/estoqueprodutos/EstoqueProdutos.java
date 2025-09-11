/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estoqueprodutos;

import java.util.Scanner;

public class EstoqueProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto = new Produtos();

        System.out.println("SEJA BEM VINDO AO ESTOQUE YGOR");
        System.out.println("-------------------------------");

        //ADICIONANDO PRODUTOS
        System.out.println("CADASTRO DE PRODUTO");

        System.out.println("Nome do produto");
        produto.nome = sc.next();

        System.out.println("Preco do produto");
        produto.preco = sc.nextDouble();

        System.out.println("Quantidade do produto");
        produto.quantidade = sc.nextInt();

        int opc;

        do {
            System.out.println("/n=====MENU======");
            System.out.println("1-Cadastrar Produto");
            System.out.println("2-Remover Produto");
            System.out.println("3-Exibir Produtoc");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opcao");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Quantidade para adicionar produto");
                    int add = sc.nextInt();
                    produto.adicionarProdutos(add);
                    break;
                case 2:
                    System.out.println("Remover produto");
                    int rem = sc.nextInt();
                    produto.removerProdutos(rem);
                    break;
                case 3:
                    System.out.println("EXIBINDO");
                    produto.exibirInfo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamen");
            }
        } while (opc != 4);
        
        sc.close();
    }
}
