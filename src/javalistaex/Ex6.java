package javalistaex;
import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x;
		System.out.println("Qual o número? ");
		x = sc.nextInt();
		if (x<0) System.out.println("O número é negativo");
		else System.out.println("O número é positivo");
	}
}
