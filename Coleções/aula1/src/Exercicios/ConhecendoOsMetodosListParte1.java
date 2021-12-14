package Exercicios;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;




public class ConhecendoOsMetodosListParte1 {
	public static void main(String[] args) {
		System.out.println("Crie uma lista e adicione as sites notas: ");
		//List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		List<Double> notas = new ArrayList<Double>();
		notas.add(10d);
		notas.add(25d);
		notas.add(5d);
		System.out.println(notas);
		System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));
		System.out.println("Adicione na lista a nota 8.0 na posição 1 ");
		notas.add(1,8d);
		System.out.println(notas);
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6d);
		System.out.println(notas);
		System.out.println("A lista contem a nota 5.0: "+ notas.contains(5d));
		System.out.println("Imprima a lista na ordem inserida: ");
		for(Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada "+ notas.get(2));
		System.out.println("Exiba a soma dos valores: ");
		float soma = 0;
		//for(Double nota : notas) soma += nota;
		//System.out.println("A soma dos elementos sao: "+ soma);
		Iterator<Double> iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("A soma dos elementos sao: "+ soma);
		System.out.println("Imprima a media dos elementos "+ (soma/notas.size()));
		notas.remove(8d);
		System.out.println(notas);
		System.out.println("Remova as noras menores que 7 e exiba a lista: ");
		iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			if(next < 7) iterator.remove();
		}
		System.out.println(notas);
		notas.clear();
		System.out.println(notas);
		System.out.println("A lista esta vazia? "+notas.isEmpty());
		
	}
	

}
