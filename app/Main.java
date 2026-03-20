package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.sgp.modelos.Novela;
import main.java.com.sgc.validacoes.Validacoes;

public class Main {

    private static ArrayList<Novela> novelas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();

            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Digite um número válido!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarNovela();
                    break;
                case 2:
                    listarNovelas();
                    break;
                case 3:
                    buscarNovela();
                    break;
                case 0:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE NOVELAS ===");
        System.out.println("1 - Cadastrar Novela");
        System.out.println("2 - Listar Novelas");
        System.out.println("3 - Buscar Novela por título");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarNovela() {
        System.out.println("\n=== CADASTRAR NOVELA ===");

        String titulo;
        do {
            System.out.print("Título: ");
            titulo = scanner.nextLine();
            if (!Validacoes.isTituloValido(titulo)) {
                System.out.println("Título inválido!");
            }
        } while (!Validacoes.isTituloValido(titulo));

        String autor;
        do {
            System.out.print("Autor: ");
            autor = scanner.nextLine();
            if (!Validacoes.isAutorValido(autor)) {
                System.out.println("Autor inválido!");
            }
        } while (!Validacoes.isAutorValido(autor));

        int numeroCapitulos;
        do {
            System.out.print("Número de capítulos: ");
            numeroCapitulos = scanner.nextInt();
            if (!Validacoes.isNumeroCapitulosValido(numeroCapitulos)) {
                System.out.println("Número de capítulos inválido!");
            }
        } while (!Validacoes.isNumeroCapitulosValido(numeroCapitulos));

        scanner.nextLine();

        Novela novela = new Novela(titulo, autor, numeroCapitulos);
        novelas.add(novela);

        System.out.println("Novela cadastrada com sucesso!");
    }

    private static void listarNovelas() {
        System.out.println("\n=== LISTA DE NOVELAS ===");

        if (novelas.isEmpty()) {
            System.out.println("Nenhuma novela cadastrada.");
            return;
        }

        for (Novela novela : novelas) {
            System.out.println(novela);
        }
    }

    private static void buscarNovela() {
        System.out.println("\n=== BUSCAR NOVELA ===");

        if (novelas.isEmpty()) {
            System.out.println("Nenhuma novela cadastrada.");
            return;
        }

        System.out.print("Digite o título da novela: ");
        String tituloBusca = scanner.nextLine();

        boolean encontrada = false;

        for (Novela novela : novelas) {
            if (novela.getTitulo().equalsIgnoreCase(tituloBusca)) {
                System.out.println("Novela encontrada:");
                System.out.println(novela);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Novela não encontrada.");
        }
    }
}