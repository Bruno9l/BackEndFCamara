/*
 * Exercicio 04
 * Faça um programa para uma loja de tintas. O programa
 * deverá pedir o tamanho em metros quadrados da área a 
 * ser pintada. Considere que a cobertura da tinta é de 
 * 1 litro para cada 3m quadrados e que a tinta é vendida  
 * em latas de 18 litros, que custam R$ 80,00. Informe 
 * ao usuário a quantidade de latas de tinta a serem
 * compradas e o valor total.
 */
package fcamara;

import java.util.Scanner;
/**
 * @author bruno alves batista
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        double area, preco, rendimentoGalao, quantidade ;       
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe a área em metros quadrados: ");
        area = s.nextInt();
        
        rendimentoGalao = 3*18;       
        quantidade = Math.ceil(area/rendimentoGalao);
        
        preco = quantidade * 80;     
                
        System.out.println("A quantidade de galões necessária é: " + quantidade+ " e o Preço total é: R$" + preco);      
        
    }
    
}
