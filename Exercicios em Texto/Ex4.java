
public class Ex4 {
	public static void main(String[] agrs) {
		
		Float media1, media2, mediaFinal,somaMedias;
		
		media1 =  (5+9+3)/3f;
		media2 = (6+7+8)/3f;
		somaMedias = media1 + media2;
		mediaFinal = (media1+media2)/2;
		
		System.out.println("Média dos Valores Inicias 5 ; 9 ; 3 = "+media1);
		System.out.println("2ª Média dos Valores Inicias 6 ; 7 ; 8 = "+media2);
		System.out.println("A soma das Medias Inicias é"+media1+ "+"+media2+ "= " +somaMedias);
		System.out.println("Média das 2 Médias Anteriores " +media1+ "; "+media2+ "= " +mediaFinal);
	}
}
