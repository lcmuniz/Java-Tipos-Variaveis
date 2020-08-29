
public class TestaStrings {
	
	public static void main(String[] args) {
		
		String nome = "Luiz Carlos";
		
		int tamanhoNome = nome.length();
		
		System.out.println(tamanhoNome);
		
		String sobrenome = "Muniz";
		
		System.out.println(sobrenome.length());
		
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println(nomeCompleto);
		
		String maiusculas = nomeCompleto.toUpperCase();
		
		System.out.println(maiusculas);
		
		System.out.println(maiusculas.toLowerCase());

		String texto = "Uma frase qualquer!";
		
		String outroTexto = texto.replaceAll("frase", "string");
		
		System.out.println(texto);
		System.out.println(outroTexto);

		String cidade = "São Luís";
		
		String cidade2 = cidade.toUpperCase();
		
		System.out.println(cidade);
		System.out.println(cidade2);
		
	
		double a = 10.30;
		double b = 10.3;
		
		boolean saoIguais = a == b;
		
		System.out.println(saoIguais);

		String s1 = "Computador";
		String s2 = "Computador";

		boolean stringsIguais = (s1 == s2); // NAO COMPARAR STRINGS ASSIM!
		
		System.out.println("Usando == " + stringsIguais);
		
		boolean iguais = s2.equals(s1);  // USAR ESSA OPCAO
		
		System.out.println("Comparação de strings: " + iguais);
		
		boolean iguaisIgnorandoCaixa = s2.equalsIgnoreCase(s1);  // USAR ESSA OPCAO
		
		System.out.println("Ignorando maiusculas e minusculas: " + iguaisIgnorandoCaixa);

		
	}

}
