import java.util.Scanner;

public class RCP_1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
		
			int me;
			
		while(true) {
			int com=(int)(Math.random()*3)+1;
				System.out.print("���ϴ� ���� �Է��ϼ���(1:����,2:����,3:��):");
			me=sc.nextInt();
				System.out.println(com);
				
				switch(com) {
					case 1: 
						if(me==1) {
							System.out.println("��ǻ�ʹ� ����, ����ڴ� ����! �����ϴ�!!");break;
						}else if(me==2) {
							System.out.println("��ǻ�ʹ� ����, ����ڴ� ����! �̰���ϴ�!!");break;
						}else if(me==3) {
							System.out.println("��ǻ�ʹ� ����, ����ڴ� �� ! �����ϴ٤Ф�");break;
						}else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
						}
					case 2:
						if(me==1) {
							System.out.println("��ǻ�� ����, ����ڴ� ����! �����ϴ٤̤�");break;
						}else if(me==2) {
							System.out.println("��ǻ�ʹ� ����, ����ڴ� ����! �����ϴ�");break;
						}else if(me==3) {
							System.out.println("��ǻ�ʹ� ����, ����ڴ� �� ! �̰���ϴ�!!");break;
						}else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
						}
					case 3:
						if(me==1) {
							System.out.println("��ǻ�ʹ� ��, ����ڴ� ���� �̰���ϴ�!!");break;
						}else if(me==2) {
							System.out.println("��ǻ�ʹ� ��, ����ڴ� ����! �����ϴ�!!");break;
						}else if(me==3) {
							System.out.println("��ǻ�ʹ� ��, ����ڴ� �� ! �����ϴ�!!");break;
						}else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
						}
						
					}//switch
						System.out.println("���������� ���α׷��� �����Ͻðڽ��ϱ�? (Y/N)");
						String choice=sc.next();
						
					if(choice.equals("y")||choice.equals("Y")) {   //me.equqalsIgnoreCase("N") ��ҹ��� ���о��� �����ϰ� �������ڴ�. 
						System.out.println("������ �����մϴ�");
						System.exit(0);
				}//if
						
			
		}//while		
			
	}//main

}
