import java.util.Scanner;

public class RCP_1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
		
			int me;
			
		while(true) {
			int com=(int)(Math.random()*3)+1;
				System.out.print("원하는 것을 입력하세요(1:가위,2:바위,3:보):");
			me=sc.nextInt();
				System.out.println(com);
				
				switch(com) {
					case 1: 
						if(me==1) {
							System.out.println("컴퓨터는 가위, 사용자는 가위! 비겼습니다!!");break;
						}else if(me==2) {
							System.out.println("컴퓨터는 가위, 사용자는 바위! 이겼습니다!!");break;
						}else if(me==3) {
							System.out.println("컴퓨터는 가위, 사용자는 보 ! 졌습니다ㅠㅠ");break;
						}else {
							System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
						}
					case 2:
						if(me==1) {
							System.out.println("컴퓨터 바위, 사용자는 가위! 졌습니다ㅜㅠ");break;
						}else if(me==2) {
							System.out.println("컴퓨터는 바위, 사용자는 바위! 비겼습니당");break;
						}else if(me==3) {
							System.out.println("컴퓨터는 바위, 사용자는 보 ! 이겼습니다!!");break;
						}else {
							System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
						}
					case 3:
						if(me==1) {
							System.out.println("컴퓨터는 보, 사용자는 가위 이겼습니다!!");break;
						}else if(me==2) {
							System.out.println("컴퓨터는 보, 사용자는 바위! 졌습니다!!");break;
						}else if(me==3) {
							System.out.println("컴퓨터는 보, 사용자는 보 ! 비겼습니다!!");break;
						}else {
							System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
						}
						
					}//switch
						System.out.println("가위바위보 프로그램을 종료하시겠습니까? (Y/N)");
						String choice=sc.next();
						
					if(choice.equals("y")||choice.equals("Y")) {   //me.equqalsIgnoreCase("N") 대소문자 구분없이 무시하고 가져오겠다. 
						System.out.println("게임을 종료합니다");
						System.exit(0);
				}//if
						
			
		}//while		
			
	}//main

}
