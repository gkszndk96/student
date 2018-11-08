package java_181107;

import java.util.Scanner;

public class NeRimCha {
	// 임시공간을 만들자!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int temp;
		System.out.println("내림차순으로 정렬할 정수 5개를 입력하세요."); // 만약에 5를 입력했다고 치자
		for (int x = 0; x < num.length; x++) { // x가 5보다 작을때까지 반복(배열 0~4를 채울때까지 반복)
			num[x] = sc.nextInt(); // 내가 값을 입력하는 부분 num[0]에는 5가 저장
		}
		for (int y = 0; y < num.length; y++) { 
			for(int z = y+1; z < num.length; z++) { 
				if(num[y] < num[z]) { 
					temp = num[y];
					num[y] = num[z];
					num[z] = temp;
				}
			}
		} 
		System.out.print("내림차순으로 출력 : ");
		for (int x = 0; x < 5; x++) {
			System.out.print(num[x] + " ");
		}
		System.out.println();
	}
}
