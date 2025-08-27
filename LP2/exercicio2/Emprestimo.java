package Professor;

public class Emprestimo{
    
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario){
        this.livro = livro;
        this.usuario = usuario;
    }//construtor

    public void realizarEmprestimo(){

        int qtdAtual = this.livro.getQtdDisponiveis();

        if(qtdAtual > 0){

            this.livro.setQtdDisponiveis(qtdAtual - 1);
            System.out.println("Empréstimo do livro '" + this.livro.getTitulo() + "' para " + this.usuario.getNome() + " realizado com sucesso!");
        } else {
        // Se não tiver, exibe uma mensagem de erro
        System.out.println("Não foi possível emprestar o livro '" + this.livro.getTitulo() + "'. Todas as unidades estão emprestadas.");
        }
    }

    public void devolverLivro() {
        // Pega a quantidade atual e aumenta em 1
        int qtdAtual = this.livro.getQtdDisponiveis();
        this.livro.setQtdDisponiveis(qtdAtual + 1);
        System.out.println("Devolução do livro '" + this.livro.getTitulo() + "' realizada com sucesso!");   
    }
        

}