package collectionQueue_Stack;

import java.util.Scanner;
import java.util.Stack;

public class exStack1 {

	public static void main(String[] args) {
		int option;
		String newBook;
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		
		
		do {
		
		System.out.println("\n---Menu de livros---");
		System.out.println("\n1 - Adicionar livros na pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
		
		System.out.println("\nDigite uma opção");
		option = leia.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("\nAdicionar novo livro: ");
			System.out.println("\nDigite o nome do livro: ");
			newBook = leia.next();
			pilha.add(newBook);
			System.out.println("\nLivro "+newBook+" adicionado a pilha");
			break;
			
		case 2:
			System.out.println("\nListar todos os livros");
			System.out.println("\nLivros adicionados "+pilha);
			break;
			
		case 3:
			System.out.println("\nRetirar livro da pilha");
			System.out.println("\nO livro "+pilha.pop()+ " foi retirado ");
			break;
		default:
			System.out.println("\nOpção inválida, tente novamente!!!");
			
			
			
			}
		
		}while(option != 0);
		System.out.println("\nEncerrando aplicação, muito obrigado.");
		

	}

}
