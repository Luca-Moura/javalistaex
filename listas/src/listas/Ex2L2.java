package listas;

import java.util.Scanner;

public class Ex2L2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coordenada X");
		float x = sc.nextFloat();
		System.out.print("Digite a coordenada Y");
		float y = sc.nextFloat();

		if (x > 0 && y > 0) {
			System.out.println("Primeiro quadrante.");
		} else if (x < 0 && y > 0) {
			System.out.println("Segundo quadrante.");
		} else if (x < 0 && y < 0) {
			System.out.println("Terceiro quadrante.");
		} else if (x > 0 && y < 0) {
			System.out.println("Quarto quadrante.");
		} else if (x == 0 && y == 0) {
			System.out.println("Ponto zero.");
	}}}


