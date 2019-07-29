import java.util.*;
public class RCP_2 {   //중급
	static public String print(int su) {
		String choice;
		
		if (su == 1)
			choice = "가위";
		else if (su == 2)
			choice = "바위";
		else if (su == 3)
			 choice = "보";
		else
			choice = "잘못 입력하셨습니다.";
		return choice;
	}
	
	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
	public static void main (String ars[]) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("================ 가위바위보 게임 ================");
			int com = (int)(Math.random() * 3) + 1;
			
			System.out.print("숫자를 입력해 주세요. (가위 - 1, 바위 - 2, 보 - 3) : ");
			int user = sc.nextInt();
			
//			if (com == 1) System.out.println("컴퓨터는 가위를 냈습니다.");
//			else if (com == 2) System.out.println("컴퓨터는 바위를 냈습니다.");
//			else System.out.println("컴퓨터는 보를 냈습니다.");
//			
//			if (user == 1) System.out.println("당신은 가위를 내셨습니다.");
//			else if (user == 2) System.out.println("당신은 바위를 내셨습니다.");
//			else if (user == 3) System.out.println("당신은 보를 내셨습니다!");
//			else System.out.println("잘못 입력하셨습니다.");
			
			System.out.println("컴퓨터는 " + print(com));
			System.out.println("사용자는 " + print(user));
			
//			if (com == user)
//				System.out.println("컴퓨터와의 싸움에서 비겼습니다!");
//			else if (com == 가위 && user == 보 || com == 바위 && user == 가위 || com == 보 && user == 바위)
//				System.out.println("컴퓨터와의 싸움에서 지셨습니다. ㅠㅠ");
//			else if (com == 가위 && user == 바위 || com == 바위 && user == 보 || com == 보 && user == 가위)
//				System.out.println("컴퓨터와의 싸움에서 이기셨습니다. 축하합니다!");
//			else
//				System.out.println("잘못 입력하셨습니다. 게임을 다시 시작해야 합니다.");
			
			
			
			
//			
//			//상급자 코스   (-를 보기 싫으면 +3해서 양수로 해도 됨)
//			switch(user-com) {
//				case -2: case 1:
//					System.out.println("사용자의 승리");
//					break;
//				case -1: case 2:
//					System.out.println("컴퓨터의 승리");
//					break;
//				case 0:
//					System.out.println("비겼습니다");
//					break;
//				default:
//					System.out.println("1~3사이의 정수를 입력하세요.");
//					break;
			
			
			
			
			
			//최상급자 코스
		switch ((user-com+3)%3) {
			case 1:
				System.out.println("사용자의 승리");
				break;
			case 2:
				System.out.println("컴퓨터의 승리");
				break;
			case 0:
				System.out.println("비겼습니다");
				break;
			default:
				System.out.println("1~3사이의 정수를 입력하세요.");
				break;
		}
		System.out.println();
			System.out.print("가위바위보 게임을 다시 시작하시겠습니까? (Yes or No) : ");
			String answer = sc.next();
			
			if (answer.equalsIgnoreCase("no"))
				System.exit(0);
			System.out.println();
		}
		
			
			
			
			
			
		}
	}
