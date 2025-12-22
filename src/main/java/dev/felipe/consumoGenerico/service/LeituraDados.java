package dev.felipe.consumoGenerico.service;

import java.util.Scanner;

public class LeituraDados {
    Scanner scanner = new Scanner(System.in);

    public String pegaOpcaoEscolhidaMenu() {
        String endpoint;
        String menu = """
                     [1] Usuarios
                     [2] Posts
                     [3] Comentarios
                     """;

        System.out.println("==== Menu para consumo de api ====");
        System.out.println(menu);
        System.out.print("Opcao escolhida: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            endpoint = "users/";
        } else if (escolha == 2) {
            endpoint = "posts/";
        } else if (escolha == 3) {
            endpoint = "comments/";
        } else {
            throw new IllegalArgumentException("Opcao invalida!");
        }

        return endpoint;
    }

    public int pegaIdParaConsulta() {
        System.out.print("Digite o id que deseja consultar: ");
        return scanner.nextInt();
    }
}
