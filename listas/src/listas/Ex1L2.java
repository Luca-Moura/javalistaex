package listas;
import java.util.Scanner;

public class Ex1L2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Insira a senha ");
		x = sc.nextInt();
		if (x == 2002) System.out.println("Senha correta!");
		else System.out.println("Senha errada!");
		
	}
}
