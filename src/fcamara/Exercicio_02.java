/* Exercício 02
 * Elabore um algoritimo para mostrar os números primos existentes em um
 * intervalo. 
 * O usuário deverá fornecer os valores inicial (inicial>0) e final (inicial<final)
 * e os números primos existentes no intervalo([inicial,funal]) devem
 * ser separados por um espaço em branco.
 */
package fcamara;

import java.util.Scanner;

/**
 * @author bruno alves batista
 */
public class Exercicio_02 {

    public static void main(String[] args) {

        int inicial, ffinal, i, j, primo;

        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        inicial = s.nextInt();
        System.out.println("Digite o segundo número: ");
        ffinal = s.nextInt();

        if ((inicial > 0) && (inicial<ffinal) ) {          
            for (i = inicial; i < ffinal; i++) {
                if (i == 0 || i == 1) {
                    primo = 0;
                } else {
                    primo = 1;
                    for (j = 2; j < i; j++) {
                        if (i % j == 0) {
                            primo = 0;
                        }
                    }
                }
                if (primo == 1) {

                    System.out.print(i+" ");
                }
            }

        } else {
            System.out.println("O valor inicial digitado deve ser maior que 0 e menor que o segundo valor");
        }

    }
}
