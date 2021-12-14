package br.com.excecoes;
import java.io.*;

import javax.swing.JOptionPane;

public class CheckedException {
        public static void main(String[] args) {
        	String nomeDoArquivo = "romances-blake-crouch.txt";
        	
        	imprimirArquivoNoConsole(nomeDoArquivo);
        	
        	
        	System.out.println("Apesar da exception ou não, o programa continua");
        }
        public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        	File file = new File(nomeDoArquivo);
        	BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        	
        	String line = br.readLine();
        	
        	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	
        	do {
        		bw.write(line);
        		bw.newLine();
        		line=br.readLine();
        		
        	}while(line != null);
        	bw.flush();
        	bw.close();
        }
}
