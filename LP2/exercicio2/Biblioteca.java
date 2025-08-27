package Professor;

public class Biblioteca{

    private Livros[] livros;
    private Usuario[] usuarios;
    private int numLivros;
    private int numUsuarios;

    public Biblioteca(){

        this.livros = new Livro[100];
        this.usuarios = new Usuario[50];
        this.numLivros = 0;
        this.numUsuarios = 0;

    }//Construtor

    // Método para adicionar um novo livro
    public void adicionarLivro(Livro livro){
        // Verifica se ainda há espaço no array
        if(this.numLivros < this.livros.length){
            this.livros[this.numLivros] = livro;
            this.numLivros++;
        }else{

            System.out.println("ERRO - Coleção de Livros Cheia");
        }
    }

    // Método para adicionar um novo usuário
    public void adicionarUsuario(Usuario usuario) {

        if(this.numUsuarios < this.usuarios.length) {
            this.usuarios[this.numUsuarios] = usuario;
            this.numUsuarios++;
        }else{
            System.out.println("ERRO = A lista de usuarios esta cheia !");
        }
    }

    // Método para listar todos os livros cadastrados
    public void listarLivros(){
        System.out.println("Livros Cadastrados: ");

        for(int i = 0; i<this.numLivros; i++){
            this.livros[i].exibirInfo();
        }

    }

    // Método para listar todos os usuários cadastrados
    public void listarUsuarios(){
        System.out.println("Usuarios Cadastrados: ");
        for(int i = 0; i<this.numUsuarios; i++){
            
        }
    }


}