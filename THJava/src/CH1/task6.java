package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task6 {
	private static int Input() throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String s = inp.readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException{
		System.out.println("Input n :");
		int n=0;
		float s = 0;
		n = Input();
		for (int i = 1; i <= n; i++) {
			s+=(float)1/i;
		}
		System.out.println("Ket qua :" +s);
	}
}
