package aula10;

public class Aula10{

    public static void main(String[] args) {

        Pessoa pe = new Pessoa();
        Aluno al = new Aluno();
        Professor pr = new Professor();
        Funcionario fu = new Funcionario();
        
        pe.setNome("Cadu");
        al.setNome("Maria");
        pr.setNome("Lucelio");
        fu.setNome("Dona Joelma");

        pe.setSexo("Masculino");
        pr.setSexo("Feminino");
        al.setIdade(18);

        al.setCurso("Geografia");
        pr.setSalario(2500.75f);
        fu.setSetor("Limpeza");
        pr.receberAum(550.20f);
        fu.mudarTrabalho("CEO");
        al.cancelarMatr();
        
        System.out.println(pe.toString());
        System.out.println(al.toString());
        System.out.println(pr.toString());
        System.out.println(fu.toString());
    }
}
