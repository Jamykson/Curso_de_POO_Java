package aula04;
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){ //Este é o método construtor
        this.saldo = 0;
        this.status = false;
    }

    public setnumConta(int conta){
        this.numConta = conta;
    }
    public getnumConta(){
        return this.conta;
    }
    public setTipo(String tipo){
        this.tipo = tipo ;
    }
    public getTipo(){
        return this.tipo;
    }
    public setDono(String dono){
        this.dono = dono;
    }
    public getDono(){
        return this.dono;
    }
    public setSaldo(float saldo){
        this.saldo = saldo ;
    }
    public getSaldo(){
        return this.sado;
    }
    public setStatus(boolean status){
        this.status = status ;
    }
    public getStatus(){
        return this.status;
    }
    
}