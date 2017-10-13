package CH1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {
	private static int Input() throws IOException {
		BufferedReader inp = new BufferedReader ( new InputStreamReader(System.in));
		String s = inp.readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException {
		int month,year,leap,day=0;
		System.out.println("Month :");
		month = Input();
		System.out.println("Year :");
		year = Input();
		leap = 0;
		if (( 1 <= month) && ( month <= 12)) {
			if (((year % 4 ==0)&&(year % 100 != 0)||(year % 400 ==0))) {
				leap =1;
			}
			switch (month) {
				case 1: day=31;
				break;
				case 2: day=28;
						if (leap ==1 ) day=29;
				break;
				case 3: day=31;
				break;
				case 4: day=30;
				break;
				case 5: day=31;
				break;
				case 6: day=30;
				break;
				case 7: day=31;
				break;
				case 8: day=31;
				break;
				case 9: day=30;
				break;
				case 10: day=31;
				break;
				case 11: day=30;
				break;
				case 12: day=31;
				break;
				
			}
			System.out.println(" Day :" + day);
		} else {
			System.out.println("Error Input");
		}
	}
}