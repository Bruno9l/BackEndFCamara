/* Exercício 01
 * Um funcionário de uma empresa recebe, anualmente, um aumento salárial.
 * sabe-se que:
 * Esse funcionário contratado em 2005 com salário de R$1000,00;
 * Em 2006 ele recebeu um aumento de 1,5% sobre seu salário inicial; e
 * a partir de 2007, os aumentos salariais correspondem ao dobro 
 * do porcentual do ano anterior
 * Faça um algoritimo que determine o salário atual deste funcionário.
 */
package fcamara;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        
        int anoInicial, anoAtual, tempoTrabalho, i=0; 
        double salario, salarioAtual, porcentagem;
        
        Scanner s = new Scanner(System.in);
        
        anoInicial = 2005;
        salario = 1000;   
        porcentagem = 0.015;
        
        salarioAtual = (salario + (salario * porcentagem));
               
        System.out.println("Digite o ano atual: ");
        anoAtual = s.nextInt();
        
        tempoTrabalho = anoAtual - anoInicial;
        System.out.println("tempo de trabalho: "+tempoTrabalho);
        
        if(tempoTrabalho > 1){
            
            for(i=tempoTrabalho; i>1; i--){
                
                porcentagem = (porcentagem * 2);
                salarioAtual = (salarioAtual+(salarioAtual * porcentagem));
                                               
                //salario += (porcentagem/100); 
                //System.out.println("Salário atual: "+salario);
            }   
            System.out.println("Salario: "+salarioAtual);
        } else {
            salario += (salario * porcentagem);
            System.out.println("Salario atual: " +salario);
        }
        
        
    }
    
}
