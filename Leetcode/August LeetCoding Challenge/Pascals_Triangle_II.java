import java.util.*;
public class Pascals_Triangle_II {
public static List<Integer> getRow(int rowIndex) {
	List<List<Integer>> arr = new ArrayList<>(); 
    
    
    arr.add(new ArrayList<>());
    arr.get(0).add(1);
    for(int i = 1 ; i < rowIndex+1 ;i++) {
    	List<Integer> curr = new ArrayList<>(); 
    	curr.add(1);
    	for(int j = 1 ; j < i ;j++) {
    		curr.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
    	}
    	curr.add(1);
    	arr.add(curr);
    }
    
    return arr.get(arr.size()-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(5));
	}

}
