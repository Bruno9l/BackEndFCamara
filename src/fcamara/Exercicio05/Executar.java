/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcamara.Exercicio05;

/**
 * @author bruno
 */
public class Executar {
    public static void main(String[] args) {
        
        Conta c = new Conta(1, "Bruno");
        
        //Alterar nome
        c.getNomeTitular();
        System.out.println("Nome: " + c.getNomeTitular());
        c.alteraNome("Fábio");       
        System.out.println("Nome: " +c.getNomeTitular());
        
        //Saldo 
        c.getSaldo();
        System.out.println("Saldo Atual: R$" + c.getSaldo());
        //deposito
        c.depositar(100);
        c.depositar(200);        
        System.out.println("Saldo Atual: R$" + c.getSaldo());
        
        //Saque
        c.sacar(100);        
        System.out.println("Saldo atual: R$:" +c.getSaldo());
        c.sacar(300);
        System.out.println("Saldo atual: R$:" +c.getSaldo());
        
    }
    
}
