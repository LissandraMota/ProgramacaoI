import java.util.Scanner;

public class Atividade3slideAula04 {

	public static void main(String[] args) {
		
		Integer codigo = 9;
		Integer candidato1 = 0;
		Integer candidato2 = 0;
		Integer candidato3 = 0;
		Integer candidato4 = 0;
		Integer totalNulo = 0;
		Integer totalBranco = 0;
		Integer percentNulo = 0;
		Integer percentBranco = 0;
		
		while (codigo != 0) {
			
			Scanner codigoVoto = new Scanner(System.in);
			
			System.out.println("Digite o código do seu voto:");
			System.out.println("1 - João; 2- José; 3- Maria; 4- Aurora; 5 - voto nulo; 6- voto branco; 0 - para sair");
			codigo = codigoVoto.nextInt();
			
			switch (codigo) {
			case 1:
				candidato1 = candidato1 + 1;
				break;
			case 2:
				candidato2 = candidato2 + 1;
				break;
			case 3:
				candidato3 = candidato3 + 1;
				break;
			case 4:
				candidato4 = candidato4 + 1;
				break;
			case 5:
				totalNulo = totalNulo + 1;
				break;
			case 6:
				totalBranco = totalBranco + 1;
				break;
			default:
				if (codigo != 0) {
					System.out.println("Código inválido para a votação, digite novamente.");
				}
				break;
			}
			
		}
				
		Integer totalV = totalVotos(candidato1, candidato2, candidato3, candidato4, totalNulo, totalBranco);
		
		percentNulo = (totalNulo * 100) / totalV;
		
		percentBranco = (totalBranco * 100) / totalV;
		
		System.out.println("Total de votos de cada candidato: ");
		System.out.println("Total de votos do João: " + candidato1);
		System.out.println("Total de votos do José: " + candidato2);
		System.out.println("Total de votos da Maria: " + candidato3);
		System.out.println("Total de votos da Aurora: " + candidato4);
		System.out.println("----------------------------------------");
		System.out.println("Total de votos nulos: " + totalNulo);
		System.out.println("Total de votos brancos: " + totalBranco);
		System.out.println("----------------------------------------");
		System.out.println("Percentual de votos nulos: " + percentNulo + "%");
		System.out.println("Percentual de votos brancos: " + percentBranco + "%");
		
	}
	
	public static Integer totalVotos (Integer n1, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6) {
		return n1 + n2 + n4 + n5 + n6;
	}
	

}
