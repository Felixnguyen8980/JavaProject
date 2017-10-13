package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
	int a;
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Ex2 vd1 = new Ex2();
		String s = input.readLine();
		vd1.a = Integer.parseInt(s);
		System.out.println("So vua nhap vao la :" + vd1.a);		
	}
}