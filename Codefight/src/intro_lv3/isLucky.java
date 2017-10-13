package intro_lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class isLucky {
	private static int Input() throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String s = inp.readLine();
		return Integer.parseInt(s);
	}
	static boolean Lucky(int n) {
	    String s = Integer.toString(n);
	    int len = s.length();
	    int firsthalf = 0;
	    int secondhalf = 0;
	    for(int i = 0; i < len/2; i++){
	        firsthalf += (s.charAt(i) -'0');
	    }
	    for(int j = len/2; j < len; j++){
	        secondhalf += (s.charAt(j) -'0');
	    }
	    if (firsthalf == secondhalf) {
	        return true;
	    } else {
	        return false;
	    }
	}
	public static void main(String[] args) throws IOException {
		int n;
		n = Input();
		boolean Kt = Lucky(1203);
		System.out.println(Kt);
	}
}
