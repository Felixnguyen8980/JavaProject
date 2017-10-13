package intro_lv3;

public class SortByHeight {
	static int[] sortByHeight(int[] a) {
	    int[] b;
	    int len = a.length;
	    for (int i =0 ; i < len-1; i++){
	         if ( a[i] > -1)
	             for (int j = i; j < len; j++)
	                if ( a[j] > -1){
	                    if ( a[i] > a[j]){
	                        int tmp;
	                            tmp=a[i];
	                            a[i]=a[j];
	                            a[j]=tmp;
	                    }
	                
	                }
	    }
	    return a;
	}
	public static void main(String[] args) {
		int[] a = new int[] {-1, 150, 190, 170, -1, -1, 160, 180};
		a = sortByHeight(a);
		int len=a.length;
		for (int i =0 ; i < len; i++){
			System.out.print(" - " + a[i]);
		}
	}
		
}

