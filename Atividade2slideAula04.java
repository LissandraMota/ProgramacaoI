import java.util.Scanner;

public class Atividade2slideAula04 {

	public static void main(String[] args) {
		
		Scanner atleta = new Scanner(System.in);
		
		System.out.println("Digite o nome do atleta:");
		String nome = atleta.nextLine(); 
		
		if (nome.equals("")){ /*nome.equals("")*/
			System.out.println("Erro, nome n�o foi inserido");
		} else {
		
		System.out.println("Digite a dist�ncia do primeiro salto:");
		Float salto1 = atleta.nextFloat();
		
		System.out.println("Digite a dist�ncia do segundo salto:");
		Float salto2 = atleta.nextFloat();
		
		System.out.println("Digite a dist�ncia do terceiro salto:");
		Float salto3 = atleta.nextFloat();
		
		System.out.println("Digite a dist�ncia do quarto salto:");
		Float salto4 = atleta.nextFloat();
		
		System.out.println("Digite a dist�ncia do quarto salto:");
		Float salto5 = atleta.nextFloat();
		
		Float media = (salto1 + salto2 + salto3 + salto4 + salto5) / 5;
		
		System.out.println("Resultado Final :" );
		System.out.println("Atleta :" + nome);
		System.out.println("Saltos: " + salto1 + "-" + salto2 + "-" + salto3 + "-" + salto4 + "-" + salto5);
		System.out.println("A m�dia dos saltos: " + media + "m");
		
		}
		

	}

}
