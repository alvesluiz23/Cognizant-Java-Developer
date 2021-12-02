package one.digitalinnovation.basecamp;

public class Main {
     public static void main(String[] args) {
    	 int i;
    	 //int i;
    	 int I;
    	 //int 1a; Variaveis não podem começar com um número
    	 int _1a; //Permitido poém não recomendado
    	 int $a;
    	 
    	 i=5;
    	 I=10;
    	 _1a = 20;
    	 $a = 7;
    	 
    	 final int j = 10;
    	 //j = 10; Errado, poís não podemos mudar o conteudo de uma variavel final
    	 int asrn2467md;
    	 //int asrn2 467md; Não pode conter espaço em uma variavel
    	 
    	 int quantidadeProduto = 50;
    	 int QuantidadeProduto; // não segure boas práticas
    	 final int NUMERO_TENTATIVAS = 5;
    	 final int numeroTentativas = 5;
    	 int QUANTIDADE_OPCAOES; //definida como final, porém não é
    	 //int qtdProd; não exclama o que ela armazena
    	 
    	 System.out.println(i);
    	 System.out.println(I);
    	 System.out.println(_1a);
    	 System.out.println($a);
    	 System.out.println(j);
}
}
