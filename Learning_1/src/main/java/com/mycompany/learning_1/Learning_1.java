package com.mycompany.learning_1;

/**
 *
 * @author Davi
 */
import java.util.Scanner;

public class Learning_1 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       int [][] matriz = new int[10][50];
       System.out.print("Enter a Value to be search:");
       int a=sc.nextInt();
       int marca=0, indxLinha=0, indxColuna=0;
       for (int linha=0;linha<10;linha++){
           for(int coluna=0;coluna<50;coluna++){
               matriz[linha][coluna] = (int)(Math.random()*500);
               //System.out.print(matriz[linha][coluna]+"\t"); //Ative essa linha para exibir a matriz inteira
              if(matriz[linha][coluna]==a){
               marca=1;
               indxLinha=linha;
               indxColuna=coluna;
              }
           }
           //System.out.println("\n"); ative essa linha para exibir a tabulação correta da matriz inteira
       }
   
           if(marca==1){
               System.out.println("O valor "+a+" Foi encontrado em ("+indxLinha+","+indxColuna+")");
           }
           else{
               System.out.println("Busca sem sucesso");
           }
    }
}
