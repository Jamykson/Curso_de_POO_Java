package aula14;
public class Aula14{
    public static  void main(String[] args){
        
        Video[] v = new Video[3];   
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Cortando a Placa de 100 mil do youtube");
        v[2] = new Video("Curso POO Java - Projeto Final em Java (Parte 1)");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Cadu", 25, "Masculino", "20240002745");
        g[1] = new Gafanhoto("James", 23, "Masculino", "20240002179");

        Visualizacao vis[] = new Visualizacao[3];

        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87f);
        System.out.println(vis[1].toString());
    }   
}