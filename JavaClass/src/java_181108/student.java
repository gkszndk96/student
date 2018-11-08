package java_181108;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// 학생수를 입력하는대로 배열이 늘어나야하니 배열설정 x
		// 1. 학생수 입력 2. 점수입력 3. 학생들의 입력한 점수리스트 출력 4. 합계 점수 및 평균점수 출력
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int x = 0;
		int student[] = null; // 내가 실수한 부분, student[] = student[x]가 아닌 null을 넣어야한다.

		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴를 선택해주세요 > ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("학생수를 입력하세요.");
				x = sc.nextInt();
				student = new int[x]; // 그리고 여기서 배열의 수가 결정되는 것
				System.out.println("학생 " + x + "명 입력이 완료되었습니다.");
			}
			if (choice == 2) {
				for (int y = 0; y < student.length; y++) {
					System.out.println((y + 1) + "번째 학생 점수를 입력하세요.");
					student[y] = sc.nextInt();
					sum += student[y];
				}
			}
			if (choice == 3) {
				for (int z = 0; z < student.length; z++) {
					System.out.println((z + 1) + "번째 학생 점수 : " + student[z]);
				}

			}
			if (choice == 4) {
				int max = 0;
				for (x = 0; x < student.length; x++) {
					if (student[x] > max) {
						max = student[x];
					}
				}
						System.out.println("학생들의 합계 점수 : " + sum);
						System.out.println("학생들의 평균 점수 : " + sum / x);
						System.out.println("학생들의 최고 점수 : " + max);
				

				if (choice == 5) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

			}
		}
	}
}
