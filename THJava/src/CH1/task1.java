package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	float a,b;
	private float Input() throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String s = inp.readLine();
		return Float.parseFloat(s);
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("This application solves equation ax + b = 0");
		task1 vd1 = new task1();
		System.out.print("Input a = ");
		vd1.a = vd1.Input();
		System.out.print("Input b = ");
		vd1.b = vd1.Input();
		if (vd1.a == 0) {
			if (vd1.b == 0) {
				System.out.println("Equation has the solution with every valua of x ");
			} else {
				System.out.println("Cant solve this Equation");
			}
		} else {
			System.out.println("Equation has the only one solution : " + (-vd1.b/vd1.a) );
		}
	}
}
