import java.util.Scanner;
public class atividade3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int segundosResposta = 0;
		
		System.out.println("Seja bem vinde, nos informe seu nome: ");
		nome = ler.next();
		System.out.println("Obrigado," + nome + " agora vamos para o calculo.");
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = ler.nextInt();
		horas = (segundos / 3600);
		minutos = (segundos % 3600) / 60;
		segundosResposta = ((segundos % 3600) % 60);
		System.out.println(nome + ", a duracão do evento foi de: " + horas + " horas, " + minutos + " minutos e " + segundosResposta + " segundos.");
	}
	
}
