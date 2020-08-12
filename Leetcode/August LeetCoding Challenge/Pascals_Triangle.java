import java.util.*;
public class Pascals_Triangle {
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> arr = new ArrayList<>(); 
	        
	        if(numRows == 0)
	        	return arr;
	        arr.add(new ArrayList<>());
	        arr.get(0).add(1);
	        for(int i = 1 ; i < numRows ;i++) {
	        	List<Integer> curr = new ArrayList<>(); 
	        	curr.add(1);
	        	for(int j = 1 ; j < i ;j++) {
	        		curr.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
	        	}
	        	curr.add(1);
	        	arr.add(curr);
	        }
	        
	        return arr;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(generate(5));
	}

}
