import java.util.*;
public class Find_All_Duplicates_In_An_Array {
  public static List<Integer> findDuplicates(int[] nums) {
	 ArrayList<Integer> dup = new ArrayList<Integer>();

	 for(int i = 0; i < nums.length; i++) {
	        int val = Math.abs(nums[i]) - 1;
	        
	        if (nums[val] > 0) {
	            nums[val] = -nums[val];
	        } else {
	            dup.add(val+1);
	        }
	    }
	  
	   return dup;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.print(findDuplicates(nums));
	}

}
