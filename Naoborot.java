package POLEZNOE;

import java.util.Scanner;

public class Naoborot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String slovo = sc.nextLine();
		StringBuilder sb = new StringBuilder(slovo);

		System.out.println(sb.reverse());
		sc.close();
	}

}
