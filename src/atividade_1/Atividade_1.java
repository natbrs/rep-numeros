/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1;

/**
 *
 * @author Aluno
 */
public class Atividade_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      long i = 0;
      long res;
      long soma = 0; 
      long mult = 1;
      
      
      for( i = 1; i <= 30; i++ ){
        
        res = i % 2;
        if ( res != 0 ){
            
            soma = soma + i;
        }
        else {
            mult = mult * i;
        }
         
      }
      System.out.println ("Resultado de soma:" +soma);
      System.out.println ("Resultado da multiplicação:" +mult);
     
    }
    
}
