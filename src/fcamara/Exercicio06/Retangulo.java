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
public class Retangulo {
    
    Scanner s = new Scanner(System.in);
    
    Double base, basep, altura, alturap, area, areap, perimetro, piso, quantidadep;
    
    public void limparScanner(){
        s.reset(); 
    }
    double calcularArea(){
        System.out.println("Didite a largura do retângulo em metros: ");
        base = s.nextDouble();        
        System.out.println("Digite a altura do retangulo em metros: ");
        altura = s.nextDouble();
        limparScanner();
        
        area = base * altura;
        return area;
    }
    
    double calcularPerimetro(){
        perimetro = (2*altura)+(2*base);
        return perimetro;
    }
    
    double calcularAreaPiso(){
        System.out.println("Digite a Largura do piso em metros: ");
        basep = s.nextDouble();        
        System.out.println("Digite a largura do piso em metros: ");
        alturap = s.nextDouble();   
        limparScanner();
        
        areap = basep * alturap;
        return areap;
    }
    
    double calculaQuatidadePiso(){
        if(area>areap){
        quantidadep = Math.ceil(area/areap); 
        } else {
            System.out.println("Erro! verifique as medidas informadas \n1 - Verifique se a medida dos pisos foi "
                    + "digitada em metros. \n2 - Verifique se as medidas do retangulo foi digitada em metros.");
        }
         
        return quantidadep;                
    }
    
    void mostrarValores(){
        System.out.println("\nO retangulo apresenta as seguintes medidas: "
                + "\nLargura: " + base + " m\nAltura: " + altura + " m\nÁrea: " + area + " m²\nPerimetro: " + perimetro + 
                " m\n\nO piso apresenta as sequintes medidas: \nA área do piso é: "+areap+" m² \nA quatidade de pisos é: "
                + quantidadep +" unidades \n\nA quantidade de rodapé é: "+perimetro+" m");        
    }   
           
}
