/*2413 ��ä�� / ���� �ܾ� �ϱ⸦ ���� ���ϴ� ���� ������ �����ϸ� �ϳ��� ���� ������  ���� �ܾ �Է��ϴ� ���α׷�. 
�������� �� ������ �� �� ����. 
*/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Word {
	static ArrayList<Word_s> E_words = new ArrayList<>(); // �ܾ� ArrayList��ü �����

	public static void main(String[] args) throws InterruptedException{
	
		Scanner sc = new Scanner(System.in);
		int target;
		int level = 0;

		String[] MeanArray=new String[10];
		String[] EnglishArray=new String[10];

		String[] filenames_e = { "src/E_word1.txt", "src/E_word2.txt", "src/E_word3.txt", "src/E_word4.txt" };
		String[] filenames_H = { "src/H_word1.txt", "src/H_word2.txt", "src/H_word3.txt", "src/H_word4.txt" };
		String[] filenames_T = { "src/T_word1.txt", "src/T_word2.txt", "src/T_word3.txt", "src/T_word4.txt" };

		// ���� ��������
		String inmean;
		FileReader fr = null;
		BufferedReader br;
		try {
			while (true) {
				System.out.print("�����ϰ���� ������ �����ϼ���(0:�ʵ�ܾ�, 1:��-���ܾ�, 2:���ܾ�):");
				target = Integer.parseInt(sc.nextLine());	//int������ ����ȯ �ؼ� ���ڸ� �Է� �ǰ� ��
				if (target == 0) {		//0�� �Է��ϸ� �ʵ�ܾ� ����
					System.out.print("�ʵ�ܾ��� �����ϰ� ���� ������ �����ϼ���(0:1�ܰ�, 1:2�ܰ�, 2:3�ܰ� , 3:4�ܰ�): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_e[level]);	//�ʵ�ܾ�ȿ� ������ ���� �迭 ������ �о�� 
				} else if (target == 1) {
					System.out.print("��-��� �ܾ��� �����ϰ� ���� ������ �����ϼ���(0:1�ܰ�, 1:2�ܰ�, 2:3�ܰ� , 3:4�ܰ�): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_H[level]);
				} else if (target == 2) {
					System.out.print("���ʹܾ��� �����ϰ� ���� ������ �����ϼ���(0:1�ܰ�, 1:2�ܰ�, 2:3�ܰ� , 3:4�ܰ�): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_T[level]);
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}

				// ���� �����ϱ�
				br = new BufferedReader(fr);
				// �ݺ�, ���� �б�
				String line;
				while ((line = br.readLine()) != null) { // ���� �о��
					StringTokenizer st = new StringTokenizer(line, "\t"); // �� ������ ���� �ڸ���
					// �� ��ü ���� ����
					Word_s newWord_s = new Word_s(); // Word_sŬ����Ÿ�� newWord_s��ü �����
					// System.out.println(line);
					newWord_s.setEnglish(st.nextToken()); // newWord_s�� setKorea�� Token���� �߶� ���� �ֱ�
					newWord_s.setKorea(st.nextToken()); // newWord_s�� setKorea�� Token���� �߶� �� �ֱ�
					// ����Ʈ�� ������� �� ��ü �ֱ�
					E_words.add(newWord_s);		//E_words����Ʈ�� newWord_s��ü�� �߰��� 
					// ����Ʈ �������

				}

				int a[] = new int[10]; 		//10���� ���� �� �ִ� �迭�� ����.
				Random ra = new Random();		//���� �̱�
				int count = 0;			//�Ѱ� ���� �� ���� 10�� ī��Ʈ ���� ����
				
				for (int i = 0; i < 10; i++) {		
					a[i] = ra.nextInt(E_words.size());	//�迭 �ȿ� E_words����Ʈ�� �����߿� 10���� �������� ����
					for (int j = 0; j < i; j++) {
						if (a[i] == a[j]) {	//a�迭 �ȿ� ������� �ߺ��� �ֳ� ���� Ȯ��
							i--;		//������ ���̳ʽ� �ؼ� �ٸ� �� ������ �ϱ�
						}
					}
				}
				
				for (int i = 0; i < 10; i++) {	//10���� ����
					Word_s word = E_words.get(a[i]);		//������ �ߺ����� �̾ƿ�a[i]�� word���ٰ� �ֱ�
					System.out.println("�ϱ��� �ܾ 3�ʵ��� �����ݴϴ�. �ϱ��ϼ���");
					System.out.println(E_words.get(a[i]));	  //�ϱ��� �ܾ�� ��� ������. 
					Thread.sleep(5000);				//5�ʵ��� �����ֱ�
					System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//ȭ�鿡 ������ �ʰ� �ҷ��� 
					System.out.print(word.mean + ": ");		//�� �����ְ� �Է��ϱ�
					inmean = sc.nextLine();
					
					
					if (inmean.equals(word.english)) {		//���� �Է��� ���̶� �̾ƿ� ����� ������ ��
						System.out.println("�����Դϴ�.");
						count += 10;		//���߸� +10�� 
					} else if(inmean != word.english) {
						System.out.println("�����Դϴ�. ������: " + word.english);	//Ʋ���� ���� �˷��ֱ�
					}
				}
				
				br.close();
				fr.close();
				System.out.println("100�������� "+count+"�� �Դϴ�.");
				System.out.print("�����÷��� y�� �Է��ϼ���(�ٸ� Ű�� ������ �ٽ� ���۵˴ϴ�.):");
				String end = sc.nextLine();

				if (end.equals("Y") || end.equals("y")) {
					System.out.println("�����մϴ�.");
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main
} // class
