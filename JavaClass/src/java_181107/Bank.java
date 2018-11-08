package java_181107;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalMoney = 0;
		int inOut;
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("---------------------------");
			System.out.print("메뉴를 선택해주세요 > ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("예금 메뉴에 들어오셨습니다.");
				System.out.println("얼마를 예금하시겠습니까?");
				inOut = sc.nextInt();
				totalMoney += inOut;
				System.out.println(inOut + "원이 입금되었습니다. 현재 잔고는" + totalMoney + "원 입니다.");
			}
			if (select == 2) {
				System.out.println("출금 메뉴에 들어오셨습니다.");
				System.out.println("얼마를 출금하시겠습니까?");
				inOut = sc.nextInt();
				if (totalMoney < inOut) {
					System.out.println("잔고가 부족합니다. 현재 잔고는 " + totalMoney + "원 입니다.");
				} else {
					totalMoney -= inOut;
					System.out.println(inOut + "원이 출금되었습니다. 현재 잔고는" + totalMoney + "원 입니다.");
				}
			}

			if (select == 3) {
				System.out.println("현재 잔고는 " + totalMoney + "원 입니다.");
			}
			if (select == 4) {
				System.out.println("감사합니다, 다음에 또 이용해 주십시오.");
				break;
			}
		}

	}
}
