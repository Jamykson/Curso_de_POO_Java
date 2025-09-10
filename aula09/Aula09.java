package aula09;

public class Aula09{

    public static void main(String[] args) {

        Pessoa[] alguem = new Pessoa[2];
        Livro[] algum = new Livro[3];
        
        alguem[0] = new Pessoa("Cadu", "Masculino", 26);
        alguem[1] = new Pessoa("Stephany", "Feminino", 30);

        algum[0] = new Livro("Astrofísica", "Tyson", 124, alguem[0]);
        algum[1] = new Livro("FMC2", "Thanos", 15245, alguem[0]);
        algum[2] = new Livro("Maquiagem na Biologia", "Virginia", 12, alguem[1]);

        algum[2].abrir();
        algum[2].folhar(7);
        algum[2].detalhes();
        
    }
}
