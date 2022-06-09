package javalistaex;
import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x;
		System.out.println("Escreva um número inteiro ");
		x = sc.nextInt();
		if (x %2 == 0) System.out.println("O número " + x + " é par.");
		else System.out.println("O número" + x + " é ímpar.");
		}
	}
