package com.sgp.modelos;  // Declaração do pacote

public class Novela {
    
    // Atributos
    private String titulo; 
    private String autor;
    private int numeroCapitulos; 

    // Construtor com parâmetros
    public Novela(String titulo, String autor, int numeroCapitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroCapitulos = numeroCapitulos;
    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão
    public Novela() {
        this.titulo = "Avenida Brasil";
        this.autor = "João Emanuel Carneiro"0;
        this.numeroCapitulos = 100;
    }

    // Método que exibe um resumo
    public void exibirResumo() {
        System.out.println("A novela " + titulo + "escrita por " + autor +
                        " possui " + numeroCapitulos + " capítulos emocionantes!");
    }

    // Métodos Getters e Setters 

    // Retorna o nome do titulo
    public String getTitulo() {
        return titulo;
    }

    // Retorna o autor da novela
    public String getAutor() {
        return autor;
    }

    // Retorna a numero de capitulos da novela
    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    // Define um novo nome para a novela
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Define um novo autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Define um novo numero de capitulos para a novela
    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Novela [titulo=" + titulo + ", autor=" + autor + ", numeroCapitulos=" + numeroCapitulos + "]";
    }
}