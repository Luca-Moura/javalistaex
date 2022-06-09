package javalistaex;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int c1;
			int c2;
			float n1;
			float n2;
			float v1;
			float v2;
			System.out.println("Qual o código da peça 1? ");
			c1 = sc.nextInt();
			System.out.println("Qual a quantidade da peça 1? ");
			n1 = sc.nextFloat();
			System.out.println("Qual o valor unitário da peça 1? ");
			v1 = sc.nextFloat();
			System.out.println("Qual o código da peça 2? ");
			c2 = sc.nextInt();
			System.out.println("Qual a quantidade da peça 2? ");
			n2 = sc.nextFloat();
			System.out.println("Qual o valor unitário da peça 2? ");
			v2 = sc.nextFloat();
			System.out.println("O custo total é " + (n1*v1+n2*v2));

	}

}