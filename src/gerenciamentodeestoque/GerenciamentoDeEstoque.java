/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamentodeestoque;

/**
 *
 * @author Cezarino Hora
 */
import java.util.ArrayList;

public class GerenciamentoDeEstoque {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<String>();

        // Adicionando produtos ao estoque
        produtos.add("Camiseta");
        produtos.add("Calça");
        produtos.add("Tênis");
        produtos.add("Boné");

        // Exibindo produtos no estoque
        System.out.println("Produtos no estoque:");
        for (int i = 0; i < produtos.size(); i++) { // Corrigido: Usar < em vez de <=
            System.out.println(produtos.get(i));
        }

        // Removendo um produto específico
        String produtoARemover = "Camiseta";
        if (produtos.contains(produtoARemover)) {
            produtos.remove(produtoARemover);
        }

        // Tentando remover um produto que não existe
        String produtoNaoExistente = "Sapato";
        if (produtos.contains(produtoNaoExistente)) {
            produtos.remove(produtoNaoExistente);
        }

        // Exibindo produtos atualizados
        System.out.println("\nProdutos atualizados no estoque:");
        for (int i = 0; i < produtos.size(); i++) { // Correto
            System.out.println(produtos.get(i));
        }

        // Tentando acessar um produto fora do índice válido
        System.out.println("\nTentando acessar um produto fora do índice válido:");
        try {
            System.out.println(produtos.get(10)); // Correção: Adiciona tratamento de exceção
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Tentando acessar um índice que não existe no estoque.");
        }
    }
}
