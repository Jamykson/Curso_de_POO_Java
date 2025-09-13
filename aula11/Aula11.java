package aula11;
public class Aula11{
    public static  void main(String[] args){
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setGenero("Masculino");
        System.out.println(v1.toString());*/

        /*Aluno a1 = new Aluno();
        a1.setNome("Cadu");
        a1.setMatricula(8184);
        a1.setCurso("T.I.");
        a1.setGenero("Másculino");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        */

        Bolsista b1 = new Bolsista();
        b1.setNome("Rick");
        b1.setMatricula(7854);
        b1.setBolsa(700f);
        b1.setGenero("Masculino");
        b1.setCurso("Biologia");
        b1.setIdade(21);
        System.out.println(b1.toString());
        b1.renovarBolsa();
        b1.pagarMensalidade();
    }
}