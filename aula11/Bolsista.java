package aula11;

public final class Bolsista extends Aluno{

    private float bolsa;

    public void renovarBolsa(){
        
        System.out.println("A bolsa de " + getNome() + " foi renovada.");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade do bolsista " + getNome() + " foi paga com sucesso.");
    }

    public float getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(float bolsa){

        this.bolsa = bolsa;
    }

}