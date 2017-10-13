package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {
	private static int Input () throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String s = inp.readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Input n:");
		int n = Input();
		float S=0;
		int d =1;
		for ( int i = 1; i <= 2*n -1; i++) {
			d*=i;
			if (i%2 !=0)
			S+=  ( (float)1/d);
			
		}
		System.out.println("Ket qua :" + S);
	}
}
