/* Exercício 05
 * Crie uma classe para implementar uma conta corrente. A classe deve
 * possuir os seguintes atributos: número da conta, nome do correntista e
 * saldo. Os métodos são os  seguintes: alterarNome, depósito e saque; No
 *construtor, saldo é opcional, com valor default zero e os demais atributos
 * são obrigatórios.
 */
package fcamara.Exercicio05;

/**
 * @author bruno alves batista
 */
public class Conta {
    
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

        
    public Conta(int numero, String nome){
        this.numeroConta = numero;
        this.nomeTitular = nome;        
    }
    
    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
        System.out.println("Realizado novo deposito no valor de: R$"+this.saldo);
    }
    
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            System.out.println("Foi realizado um saque de: R$"+valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }        
    }
    
    public void alteraNome(String nome){
        this.setNomeTitular(nome);
    }
    
       
}
