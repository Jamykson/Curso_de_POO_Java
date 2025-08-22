package aula05;
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){ //Este é o método construtor
        this.saldo = 0;
        this.status = false;
    }

    public void setnumConta(int conta){
        this.numConta = conta;
    }
    public int getnumConta(){
        return this.numConta;
    }
    public void setTipo(String tipo){
        this.tipo = tipo ;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo ;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean status){
        this.status = status ;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    public void abrirConta(String tipo){

        setTipo(tipo);
        setStatus(true);
        
        if(tipo.equals("Corrente")){

            setSaldo(50);
        }else if(tipo.equals("Poupanca")){

            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }

    public void depositar(float valor){

        if(getStatus()){

            setSaldo(getSaldo() + valor);
            System.out.println("Deposito de " + valor + " realizado.");
        }else{

            System.out.println("Impossível Depositar");
        }
    }

    public void sacar(float valor){

        if(getStatus()){

            if(getSaldo() > valor){

                setSaldo(getSaldo() - valor);
                System.out.println("Saque de " + valor + " realizado.");
            }else{

                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossível Sacar");
        }
    }

    public void pagarMensal(){
        float valor = 0;

        if(getTipo().equals("Corrente")){

            valor = 12;
        }else if( getTipo().equals("Poupanca")){

            valor = 20;
        }

        if(getStatus()){

            if(getSaldo() > valor){

                setSaldo(getSaldo() - valor);
                System.out.println("Pagamento de mensalidade realizado.");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{

            System.out.println("Impossível pagar");
        }
    }
}