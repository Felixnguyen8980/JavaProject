package intro_lv3;

public class firstDuplicate {
	   int printRepeating(int a[]) {
	   int tmp=0;
	   for (int i=0;i<a.length;i++) {
		   tmp = Math.abs(a[i])-1;
		   if(a[tmp]<0){
	            return Math.abs(a[i]);
	        }
		   else {
	            a[tmp] = -a[tmp];
	        }
	   }
	 return -1;
	    } 
	 
	    /* Driver program to test the above function */
	    public static void main(String[] args) 
	    {
	    	firstDuplicate duplicate = new firstDuplicate();
	        int arr[] = {2, 4, 3, 5, 1};
	        int arr_size = arr.length;
	        int kq= duplicate.printRepeating(arr);
	        System.out.println(kq);
	    }
}
