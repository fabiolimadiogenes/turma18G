package atividadeSequencial;
import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeAnos;
		int idadeMes;
		int idadeDias;
		
		System.out.println("Digite sua idade em anos: ");
		idadeAnos = ler.nextInt();
		System.out.println("Calcule do m�s do seu ultimo anivers�rio at� o m�s atual e digite: ");
		idadeMes = ler.nextInt();
		System.out.println("Calcule do dia do seu ultimo anivers�rio at� o dia atual e digite: ");
		idadeDias = ler.nextInt();
		
		idadeDias += + idadeMes *30 + idadeAnos*365;
		
		System.out.println("Sua idade em dias �: " + idadeDias);

	}
}	
