package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	float a,b,c;
	private float Input() throws IOException {
		BufferedReader Inp = new BufferedReader(new InputStreamReader(System.in));
		String s = Inp.readLine();
		return	Float.parseFloat(s);
	}
	private float Delta(float a, float b, float c) {
		return b*b-4*a*c;
	}
	public static void main(String[] args) throws IOException {
		task2 vd1 = new task2();
		System.out.println("This application solves quadratic equation ax^2 + bx + c = 0");
		System.out.print("a =");
		vd1.a = vd1.Input();
		System.out.print("b =");
		vd1.b = vd1.Input();
		System.out.print("c =");
		vd1.c = vd1.Input();
		float dlta = vd1.Delta(vd1.a, vd1.b, vd1.c);
		if (dlta < 0) {
			System.out.println("Quadratic equation have two complex solutions");
			System.out.println(-vd1.b/(2*vd1.a) + " + " + Math.sqrt(-dlta)/(2*vd1.a) +"i");
			System.out.println(-vd1.b/(2*vd1.a) + " - " + Math.sqrt(-dlta)/(2*vd1.a) +"i");
		} else {
			if (dlta == 0 ) {
				System.out.println("Quadratic equation have one solutions");
				System.out.println(-vd1.b/(2*vd1.a));
			} else {
				System.out.println("Quadratic equation have two solutions");
				System.out.println((-vd1.b)/(2*vd1.a) + Math.sqrt(dlta)/(2*vd1.a));
				System.out.println((-vd1.b)/(2*vd1.a) - Math.sqrt(dlta)/(2*vd1.a));
			}
		}
	}
}
