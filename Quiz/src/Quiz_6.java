
public class Quiz_6 {     //sot-so=tt  
public static void main(String[] args) {
	
	int S,O,T;
	
	for(S=1;S<=9;S++) {
		for(O=0;O<=9;O++) {
			for(T=0;T<=9;T++) {
				if((S*100 + O*10 + T)-(S*10+O) == (T*10+T)){
					System.out.printf("%d%d%d - %d%d = %d%d",S,O,T,S,O,T,T);
				}
			}
		}//for O
	}//for S
	
	
	
	
}//main
}
