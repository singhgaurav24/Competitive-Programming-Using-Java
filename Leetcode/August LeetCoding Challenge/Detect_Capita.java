import java.util.Scanner;
public class Detect_Capita {
public static boolean solution(String str){
	char[] ch = str.toCharArray();
	for(int  i = 0 ; i  < ch.length ; i++) {
		if(Character.isUpperCase(ch[i])) {
			return true;
		}
	}
	
	for(int  i = 0 ; i  < ch.length ; i++) {
		if(Character.isLowerCase(ch[0])) {
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Word");
          String str = sc.next();
          
          System.out.println(solution(str));
	}

}
