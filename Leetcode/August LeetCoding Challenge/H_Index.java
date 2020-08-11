import java.util.Arrays;
import java.util.*;
public class H_Index {
	
	 public static int hIndex(int[] citations) {
		 Arrays.sort(citations);
//		 for(int i = 0 ; i < citations.length ;i++) {
//			 System.out.print(citations[i]+" ");
//		 }
		 int n = citations.length;
		 int index =0;
		 while(n> index && n-index > citations[index]) {
			 index++;
		 }
		 
	        return (n-index);
	    }
	
      public static void main(String[] args) {
    	  int citations[] = {3,0,6,1,5};
    	  System.out.println(hIndex(citations));
      }
}
