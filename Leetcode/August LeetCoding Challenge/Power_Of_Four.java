
public class Power_Of_Four {
public static boolean isPowerOfFour(int num) {
	if(num == 0) {
		return true;
	}
	while(num != 1) {
		if(num % 4 != 0)
			return false;
		num = num/4;
	}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(isPowerOfFour(64));
	}

}
