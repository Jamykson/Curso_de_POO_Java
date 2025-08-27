package Professor;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int qtdDisponiveis;

    public Livro(int codigo, String titulo, String autor, int qtdDisponiveis){

    this.codigo = codigo;
    this.titulo = titulo;
    this.autor = autor;
    this.qtdDisponiveis = qtdDisponiveis;

    }

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getQtdDisponiveis(){
        return this.qtdDisponiveis;
    }
    public void setQtdDisponiveis(int qtdDisponiveis){
        this.qtdDisponiveis = qtdDisponiveis;
    }

    public void exibirInfo(){
        System.out.println("Código: "+ this.codigo);
        System.out.println("Título: "+ this.titulo);
        System.out.println("Autor: "+ this.autor);
        System.out.println("Disponiveis: "+ this.qtdDisponiveis);
    }

}


