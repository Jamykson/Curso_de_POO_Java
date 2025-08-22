package aula05;

public class Aula05{

    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();

        conta1.setnumConta(1111);
        conta1.setDono("Carlos");
        conta1.abrirConta("Corrente");
        conta1.estadoAtual();
        
    }
        
}
