package main.java.com.sgc.validacoes;

public class Validacoes {
    
    // Construtor privado para evitar instanciação
    private Validacoes() {}
    
    // Validação para título
    public static boolean isTituloValido(String titulo) {
        return titulo != null && !titulo.trim().isEmpty();
    }
    
    // Validação para autor
    public static boolean isAutorValido(String autor) {
        return autor != null && !autor.trim().isEmpty();
    }
    
    // Validação para numero de capitulos
    public static boolean isNumeroCapitulosValido(int numeroCapitulos) {
        int numeroCapitulos = java.time.Year.now().getValue();
        return numeroCapitulos >= 100 && numeroCapitulos <= numeroCapitulos;
    }
}
