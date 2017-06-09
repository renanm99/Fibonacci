/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //declaração do inicio da sequencia
        int x = 1;
        int y = 1;
        int aux = 0;//variavel auxiliar
        
        System.out.println("Quantos termos deseja aprensentar? ");
        int termos = entrada.nextInt();
        
        System.out.print(y + " ");
        for(int i = 1;i<termos;i++){
            aux = y; //salvo o valor de y em auxiliar
            y += x; //faço a soma um dos temos (y) com o termo anterior na sequencia (x)
            x=aux; //uso a variável auxiliar para fazer o termo anterior avançar
            System.out.print(aux + " ");
            
            //O algoritmo funciona como troca de posições
        }
    }
    
}
