import java.util.Scanner;

public class Quiz_5 {
	
	static int n;
	static int s[];
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int i;    //회사 수 배열 
			
			System.out.print("회사수 입력:");
			n=sc.nextInt();
			s=new int[n];
			
			for(i=0;i<s.length;i++) {
				s[i]=sc.nextInt();
				
			}//for
			for(i=0;i<s.length;i++) {
				System.out.println(s[i] + "==>"+rank(s[i])+"등");
			}
				
	}//main

	static public int rank(int su) {
		int rank=1;
		for(int i=0;i<n;i++) {
			if(su < s[i])
				rank++;
		}
		return rank;
	}
}//class
