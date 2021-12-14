package br.com.excecoes;
import javax.swing.*;

public class UncheckedException {
      public static void main(String[] args) {
    	  String a = JOptionPane.showInputDialog("Numerador: ");
    	  String b = JOptionPane.showInputDialog("Denominador: ");
    	  
    	  try {
    		  int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
    		  System.out.println("Resultado = "+resultado);
    	  }
    	  catch(NumberFormatException e){
    		  JOptionPane.showMessageDialog(null,"Entrada invalida, informe um número inteiro!: " + e.getMessage());
    		 // e.printStackTrace();
    		  
    	  }catch(ArithmeticException e){
    		  JOptionPane.showMessageDialog(null,"Impossivel dividir por zero " + e.getMessage());
    	  }
    	  finally {
    		  System.out.println("Chegou no finally ");
    	  }
    	  
    	  System.out.println("Continuou");
    	 
      }
      public static int dividir(int a, int b) { return a/b;}
}
