package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("bom dia");

		int[][] matriz = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j]);
			}
		}
	in.close();}

}
