
public class Ex4 {
	public static void main(String[] agrs) {
		
		Float media1, media2, mediaFinal,somaMedias;
		
		media1 =  (5+9+3)/3f;
		media2 = (6+7+8)/3f;
		somaMedias = media1 + media2;
		mediaFinal = (media1+media2)/2;
		
		System.out.println("M�dia dos Valores Inicias 5 ; 9 ; 3 = "+media1);
		System.out.println("2� M�dia dos Valores Inicias 6 ; 7 ; 8 = "+media2);
		System.out.println("A soma das Medias Inicias �"+media1+ "+"+media2+ "= " +somaMedias);
		System.out.println("M�dia das 2 M�dias Anteriores " +media1+ "; "+media2+ "= " +mediaFinal);
	}
}
