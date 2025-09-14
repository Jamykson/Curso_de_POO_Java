package aula12;

public class Peixe extends Animal{

    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo minhocas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Peixe");
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
