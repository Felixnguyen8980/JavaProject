package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
	static float a,b,c;
	private static float Input() throws IOException {
		BufferedReader Inp = new BufferedReader(new InputStreamReader(System.in));
		String s =	Inp.readLine();
		return Float.parseFloat(s);
	}
	public static void main(String[] args) throws IOException {

		a = Input();
		b = Input();
		c = Input();
		float stt = a ;
		if (((a>=b) && (b>=c)) || ((c>=b)&&(b>=a))) {
			stt = b;
		}
		if (((a>=c) && (c>=b)) || ((b>=c)&&(c>=a))) {
			stt = c;
		}
		System.out.println("So trung gian :" +stt);
	}
}
