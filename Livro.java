public class Livro {
    private String nome;
    private int quantidadeDePaginas;
    private int paginaAtual;

    // Construtor
    public Livro(String nome, int quantidadeDePaginas, int paginaAtual) {
        this.nome = nome;
        setQuantidadeDePaginas(quantidadeDePaginas);
        setPaginaAtual(paginaAtual);
    }

    // Getter e Setter para o atributo "nome"
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo "quantidadeDePaginas"
    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        if (quantidadeDePaginas > 0) {
            this.quantidadeDePaginas = quantidadeDePaginas;
        } else {
            System.out.println("A quantidade de páginas deve ser maior que zero.");
        }
    }

    // Getter e Setter para o atributo "paginaAtual"
    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual >= 1 && paginaAtual <= quantidadeDePaginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("A página atual deve estar entre 1 e a quantidade de páginas do livro.");
        }
    }

    // Método para avançar uma página
    public void avancarPagina() {
        if (paginaAtual < quantidadeDePaginas) {
            paginaAtual++;
        } else {
            System.out.println("Você já está na última página.");
        }
    }

    // Método para retroceder uma página
    public void retrocederPagina() {
        if (paginaAtual > 1) {
            paginaAtual--;
        } else {
            System.out.println("Você já está na primeira página.");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Livro livro = new Livro("Livro Exemplo", 130, 1);

        System.out.println("Nome do Livro: " + livro.getNome());
        System.out.println("Quantidade de Páginas: " + livro.getQuantidadeDePaginas());
        System.out.println("Página Atual: " + livro.getPaginaAtual());

        livro.avancarPagina();
        System.out.println("Página Atual após avançar: " + livro.getPaginaAtual());

        livro.retrocederPagina();
        System.out.println("Página Atual após retroceder: " + livro.getPaginaAtual());

        // Tentar definir quantidade de páginas como zero (deve imprimir uma mensagem de erro)
        livro.setQuantidadeDePaginas(0);

        // Tentar definir página atual fora dos limites (deve imprimir uma mensagem de erro)
        livro.setPaginaAtual(150);
    }
}
