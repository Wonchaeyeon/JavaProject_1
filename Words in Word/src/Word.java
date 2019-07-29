/*2413 원채연 / 영어 단어 암기를 위해 원하는 영어 레벨을 선택하면 하나씩 뜻이 나오고  영어 단어를 입력하는 프로그램. 
마지막엔 내 점수를 볼 수 있음. 
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
	static ArrayList<Word_s> E_words = new ArrayList<>(); // 단어 ArrayList객체 만들기

	public static void main(String[] args) throws InterruptedException{
	
		Scanner sc = new Scanner(System.in);
		int target;
		int level = 0;

		String[] MeanArray=new String[10];
		String[] EnglishArray=new String[10];

		String[] filenames_e = { "src/E_word1.txt", "src/E_word2.txt", "src/E_word3.txt", "src/E_word4.txt" };
		String[] filenames_H = { "src/H_word1.txt", "src/H_word2.txt", "src/H_word3.txt", "src/H_word4.txt" };
		String[] filenames_T = { "src/T_word1.txt", "src/T_word2.txt", "src/T_word3.txt", "src/T_word4.txt" };

		// 파일 연결하자
		String inmean;
		FileReader fr = null;
		BufferedReader br;
		try {
			while (true) {
				System.out.print("공부하고싶은 수준을 선택하세요(0:초등단어, 1:중-고등단어, 2:고등단어):");
				target = Integer.parseInt(sc.nextLine());	//int형으로 형변환 해서 숫자만 입력 되게 함
				if (target == 0) {		//0을 입력하면 초등단어 들어옴
					System.out.print("초등단어의 공부하고 싶은 레벨을 선택하세요(0:1단계, 1:2단계, 2:3단계 , 3:4단계): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_e[level]);	//초등단어안에 선택한 레벨 배열 파일을 읽어옴 
				} else if (target == 1) {
					System.out.print("중-고등 단어의 공부하고 싶은 레벨을 선택하세요(0:1단계, 1:2단계, 2:3단계 , 3:4단계): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_H[level]);
				} else if (target == 2) {
					System.out.print("토익단어의 공부하고 싶은 레벨을 선택하세요(0:1단계, 1:2단계, 2:3단계 , 3:4단계): ");
					level = Integer.parseInt(sc.nextLine());
					fr = new FileReader(filenames_T[level]);
				} else {
					System.out.println("잘못입력하셨습니다.");
				}

				// 버퍼 연결하기
				br = new BufferedReader(fr);
				// 반복, 한줄 읽기
				String line;
				while ((line = br.readLine()) != null) { // 한줄 읽어옴
					StringTokenizer st = new StringTokenizer(line, "\t"); // 탭 단위로 글자 자르기
					// 새 객체 만들어서 넣자
					Word_s newWord_s = new Word_s(); // Word_s클래스타입 newWord_s객체 만들기
					// System.out.println(line);
					newWord_s.setEnglish(st.nextToken()); // newWord_s에 setKorea에 Token으로 잘라서 영어 넣기
					newWord_s.setKorea(st.nextToken()); // newWord_s에 setKorea에 Token으로 잘라서 뜻 넣기
					// 리스트에 만들어진 새 객체 넣기
					E_words.add(newWord_s);		//E_words리스트에 newWord_s객체를 추가함 
					// 리스트 출력하자

				}

				int a[] = new int[10]; 		//10개를 뽑을 수 있는 배열을 만듬.
				Random ra = new Random();		//랜덤 뽑기
				int count = 0;			//한개 맞출 때 마다 10점 카운트 새는 변수
				
				for (int i = 0; i < 10; i++) {		
					a[i] = ra.nextInt(E_words.size());	//배열 안에 E_words리스트의 길이중에 10개만 랜덤으로 뽑음
					for (int j = 0; j < i; j++) {
						if (a[i] == a[j]) {	//a배열 안에 내용들이 중복이 있나 없나 확인
							i--;		//있으면 마이너스 해서 다른 값 나오게 하기
						}
					}
				}
				
				for (int i = 0; i < 10; i++) {	//10가지 추출
					Word_s word = E_words.get(a[i]);		//위에서 중복없이 뽑아온a[i]를 word에다가 넣기
					System.out.println("암기할 단어를 3초동안 보여줍니다. 암기하세요");
					System.out.println(E_words.get(a[i]));	  //암기할 단어와 영어를 보여줌. 
					Thread.sleep(5000);				//5초동안 보여주기
					System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//화면에 보이지 않게 할려고 
					System.out.print(word.mean + ": ");		//뜻 보여주고 입력하기
					inmean = sc.nextLine();
					
					
					if (inmean.equals(word.english)) {		//내가 입력한 값이랑 뽑아온 영어랑 같은지 비교
						System.out.println("정답입니다.");
						count += 10;		//맞추면 +10점 
					} else if(inmean != word.english) {
						System.out.println("오답입니다. 정답은: " + word.english);	//틀리면 정답 알려주기
					}
				}
				
				br.close();
				fr.close();
				System.out.println("100점만점에 "+count+"점 입니다.");
				System.out.print("끝내시려면 y를 입력하세요(다른 키를 누르면 다시 시작됩니다.):");
				String end = sc.nextLine();

				if (end.equals("Y") || end.equals("y")) {
					System.out.println("종료합니다.");
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
