package aula08;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2){

        if(lutador1.getCategoria().equals(lutador2) && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        
        if(this.aprovada == true){

            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor) {
                case 0: //empate
                    
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado vence

                    System.out.println(this.desafiado.getNome() + " Venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence

                    System.out.println(this.desafiante.getNome() + " Venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        }else{
            System.out.println("A luta não pode ocorrer!");
        }
    }




















    // Getters
public Lutador getDesafiado() {
    return this.desafiado;
}

public Lutador getDesafiante() {
    return this.desafiante;
}

public int getRounds() {
    return this.rounds;
}

public boolean isAprovada() {
    return this.aprovada;
}

// Setters
public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
}

public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
}

public void setRounds(int rounds) {
    this.rounds = rounds;
}

public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
}






}