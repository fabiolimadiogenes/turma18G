import java.util.Scanner;
public class atividade5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float media;
		
		System.out.println("Escreva o valor da primeira nota: ");		
		n1 = ler.nextFloat();
		System.out.println("Escreva o valor da segunda nota: ");		
		n2 = ler.nextFloat();
		System.out.println("Escreva o valor da terceira nota: ");		
		n3 = ler.nextFloat();
		
		media = (n1/2) + (n2/3) + (n3/5);
		
		System.out.println("A média final é: " + Math.round(media));
		
	}
}
