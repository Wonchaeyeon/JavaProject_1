import java.util.*;
public class RCP_2 {   //�߱�
	static public String print(int su) {
		String choice;
		
		if (su == 1)
			choice = "����";
		else if (su == 2)
			choice = "����";
		else if (su == 3)
			 choice = "��";
		else
			choice = "�߸� �Է��ϼ̽��ϴ�.";
		return choice;
	}
	
	public static final int ���� = 1;
	public static final int ���� = 2;
	public static final int �� = 3;
	
	public static void main (String ars[]) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("================ ���������� ���� ================");
			int com = (int)(Math.random() * 3) + 1;
			
			System.out.print("���ڸ� �Է��� �ּ���. (���� - 1, ���� - 2, �� - 3) : ");
			int user = sc.nextInt();
			
//			if (com == 1) System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
//			else if (com == 2) System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
//			else System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
//			
//			if (user == 1) System.out.println("����� ������ ���̽��ϴ�.");
//			else if (user == 2) System.out.println("����� ������ ���̽��ϴ�.");
//			else if (user == 3) System.out.println("����� ���� ���̽��ϴ�!");
//			else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			System.out.println("��ǻ�ʹ� " + print(com));
			System.out.println("����ڴ� " + print(user));
			
//			if (com == user)
//				System.out.println("��ǻ�Ϳ��� �ο򿡼� �����ϴ�!");
//			else if (com == ���� && user == �� || com == ���� && user == ���� || com == �� && user == ����)
//				System.out.println("��ǻ�Ϳ��� �ο򿡼� ���̽��ϴ�. �Ф�");
//			else if (com == ���� && user == ���� || com == ���� && user == �� || com == �� && user == ����)
//				System.out.println("��ǻ�Ϳ��� �ο򿡼� �̱�̽��ϴ�. �����մϴ�!");
//			else
//				System.out.println("�߸� �Է��ϼ̽��ϴ�. ������ �ٽ� �����ؾ� �մϴ�.");
			
			
			
			
//			
//			//����� �ڽ�   (-�� ���� ������ +3�ؼ� ����� �ص� ��)
//			switch(user-com) {
//				case -2: case 1:
//					System.out.println("������� �¸�");
//					break;
//				case -1: case 2:
//					System.out.println("��ǻ���� �¸�");
//					break;
//				case 0:
//					System.out.println("�����ϴ�");
//					break;
//				default:
//					System.out.println("1~3������ ������ �Է��ϼ���.");
//					break;
			
			
			
			
			
			//�ֻ���� �ڽ�
		switch ((user-com+3)%3) {
			case 1:
				System.out.println("������� �¸�");
				break;
			case 2:
				System.out.println("��ǻ���� �¸�");
				break;
			case 0:
				System.out.println("�����ϴ�");
				break;
			default:
				System.out.println("1~3������ ������ �Է��ϼ���.");
				break;
		}
		System.out.println();
			System.out.print("���������� ������ �ٽ� �����Ͻðڽ��ϱ�? (Yes or No) : ");
			String answer = sc.next();
			
			if (answer.equalsIgnoreCase("no"))
				System.exit(0);
			System.out.println();
		}
		
			
			
			
			
			
		}
	}
