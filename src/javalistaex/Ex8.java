package javalistaex;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		System.out.println("Qual o valor da variável 'a'? ");
		a = sc.nextInt();
		System.out.println("Qual o valor da variável 'b'? ");
		b = sc.nextInt();
		if (a%b == 0 | b%a == 0) System.out.println("'a' e 'b' são múltiplos entre si. ");
		else System.out.println("'a' e 'b' não são múltiplos entre si. ");
		
}
}