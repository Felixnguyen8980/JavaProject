package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {
	private static int Input() throws IOException {
		BufferedReader inp = new BufferedReader ( new InputStreamReader(System.in));
		String s = inp.readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Start time");
		int a = Input();
		System.out.println("End time");
		int b = Input();
		int hoadon = 0;
		if (b < a) {
			System.out.println("Wrong");
		} else {
			if (b > 18){
			  if (18>=a) {
				hoadon = (18-a) * 45000;
				hoadon += (b - 18) * 65000;
			  } else {
				hoadon = ( b - a)*65000;
			  }
			}
			else {
				hoadon = ( b - a)*45000;
			}
		}
		System.out.println("Hoa don :" + hoadon);
	}
}
