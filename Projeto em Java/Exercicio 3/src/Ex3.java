import java.util.Scanner;

public class Ex3 {
	public static void main(String[] agrs) {
		
		
		double fahrenheit, celcius;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a Temperatura em Celcius: ");
		celcius = leia.nextDouble();
		
		fahrenheit = celcius * 1.8;
		
		System.out.println("---------Convertendo Celcius em Fahrenheit-----------");
		System.out.println();
		System.out.println("Temperatura em Celcius: "+celcius+" °C");
		System.out.println("Temperatura em Farenheith: "+fahrenheit+" F");
	}
}
