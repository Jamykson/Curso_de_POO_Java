package aula14;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String genero, String login){
        super(nome, idade, genero);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){

        setTotAssistido(getTotAssistido() + 1);
    }

    public String toString(){

        return "Gafanhoto {" + super.toString() + "Login = " + getLogin() + ", Total Assistido =" + getTotAssistido() + "}";
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}