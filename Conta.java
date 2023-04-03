
public class Conta {
    private String nome;
    private String conta;
    private String agencia;
    private Double saldo;
    
    //definição do metodo construtor
    public Conta(){
    }
    public Conta(double saldo){
        if(saldo >= 10){
            this.saldo = saldo;
        }else{
            System.out.println("Deposite 10,00 para criar a conta");
        }
    }
    public Conta(String nome, String agencia, String conta, double saldo){
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        if(saldo >= 10){
            this.saldo = saldo;
        }else{
            System.out.println("Deposite 10,00 para criar a conta");
        }
    }
   
    public void setNome(String nome){
       this.nome = nome;
    }
    public String getNome(){
        return nome; 
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    public String getConta(){
        return conta;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return agencia;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
