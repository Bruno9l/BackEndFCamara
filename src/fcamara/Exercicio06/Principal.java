/* Exercicio 06
 * Crie uma classe que modele um retângulo:
 * Atributos: ladoA, ladoB (Comprimento, largura ou Base e Altura)
 * Métodos: Mudar valor dos lados, Retornar valor dos dados, calcular área
 * e calcular perimetro;
 * Crie um programa que utilize esta classe. Ele deve pedir ao usuario que 
 * informe as medidas de um local. Depois deve criar um objeto com as medidas. 
 */
package fcamara.Exercicio06;

import java.util.Scanner;

/**
 * @author bruno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Retangulo r = new Retangulo();
        //Dados da área do local e do piso
        //Local
        r.calcularArea();
        r.calcularPerimetro();
        //Piso
        r.calcularAreaPiso();
        r.calculaQuatidadePiso();
        //Saida
        r.mostrarValores();   
        
    }
    
}
