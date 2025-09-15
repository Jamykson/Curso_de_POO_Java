package aula14;

public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        
        this.titulo = titulo;
        this.views = 0;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void infos(){

        if(getReproduzindo() == true){
            System.out.println("O vídeo está sendo reproduzindo, e conta com " + getCurtidas() + " likes.");
        }else{
            System.out.println("O vídeo está pausado, e conta com " + getCurtidas() + " likes.");
        }

        System.out.println("Título: " + getTitulo() + ".");
        System.out.println(getViews() + " views.");

    }

    @Override
    public void play(){
        if(getReproduzindo() == false){
            this.setReproduzindo(true);
        }
    }
    @Override
    public void pause(){
        if(getReproduzindo() == true){
            this.setReproduzindo(false);
        }
    }
    @Override
    public void like(){
        setCurtidas(getCurtidas()+1);
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        
        int nova = (getAvaliacao() + avaliacao)/getViews();

        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}