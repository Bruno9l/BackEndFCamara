/*Exercicio 03
 * Receba o número de horas trabalhadas por uma pessoa e o valor do
 * salário mínimo e mostre o salário a receber baseado nas seguintes regras:
 * A hora trabalhada equivale a 10% so salário mínimo informado;
 * O salário bruto é dado pelo número de horas trabalhadas multiplicadas pelo
 * valor de cada hora;
 * O imposto pago é de 3%;
 * O salário a receber é equivalente ao salário bruto subtraído do imposto.
 */
package fcamara;

import java.util.Scanner;

/**
 * @author bruno alves batista
 */
public class Exercicio_03 {
    public static void main(String[] args) {
     double horasTrabalhadas, salarioMinimo, salarioAReceber, salarioHora, salarioBruto, imposto; 
     
     imposto = 0.03;
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = s.nextDouble();
     
     System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = s.nextDouble();
    
     salarioHora = salarioMinimo * 0.1;
     salarioBruto = salarioHora * horasTrabalhadas;
     
     salarioAReceber = salarioBruto - (salarioBruto * imposto);
     
        System.out.println("O salário é: " +salarioAReceber);
     
    }
            
}
