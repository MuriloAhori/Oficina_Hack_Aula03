import java.util.Scanner;

public class Ex1 {   
	
	public static void main(String[] agrs) {
	String ola;
	String nome, sobrenome, logradouro, bairro, cidade, estado;
	int numero, cep;
		
	Scanner leia = new Scanner(System.in);
	
				System.out.print("Digite o seu Nome: ");
				nome = leia.nextLine();
				
				System.out.print("Digite o seu Sobrenome: ");
				sobrenome = leia.nextLine();
				
				System.out.print("Digite o seu Estado: ");
				estado = leia.nextLine();
				
				System.out.print("Digite o seu Cidade: ");
				cidade = leia.nextLine();
				
				System.out.print("Digite o seu Bairro: ");
				bairro = leia.nextLine();
				
				System.out.print("Digite o seu Logradouro: ");
				logradouro = leia.nextLine();
				
				System.out.print("Digite o Numero da Sua Casa: ");
				numero = leia.nextInt();
				
				System.out.print("Digite o seu CEP: ");
				cep = leia.nextInt();
				
				System.out.println("---------------Coletando Endereço---------------");
				System.out.println("Olá, "+nome+" "+sobrenome);
				System.out.println("A sua Cidade: "+cidade);
				System.out.println("O seu Estado: "+estado);
				System.out.println("O seu CEP: "+cep);
				System.out.println("O seu Bairro: "+bairro);
				System.out.println("O seu Logradouro: "+logradouro);
				System.out.println("O Número da Casa: "+numero);	
	}
}
