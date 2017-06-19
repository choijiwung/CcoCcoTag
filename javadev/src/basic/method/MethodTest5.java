package basic.method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int you, com;
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		you = s.nextInt();
		com = (int) (Math.random() * 3) + 1;
		String[] result = { "무승부", "당신의 승리", "컴퓨터의 승리" };
		System.out.println("you : " + caption(you));

		System.out.print("com : " + caption(com));

		switch (com) {
		case 1:
			switch (you) {
			case 1:
				System.out.print(result[0]);
				break;
			case 2:
				System.out.print(result[1]);
				break;
			case 3:
				System.out.print(result[2]);
				break;
			}
			break;
		case 2:
			switch (you) {
			case 1:
				System.out.print(result[2]);
				break;
			case 2:
				System.out.print(result[0]);
				break;
			case 3:
				System.out.print(result[1]);
				break;
			}
			break;
		case 3:
			switch (you) {
			case 1:
				System.out.print(result[1]);
				break;
			case 2:
				System.out.print(result[2]);
				break;
			case 3:
				System.out.print(result[0]);
				break;
			}
			break;
		}
		System.out.println("입니다.");
	}

	private static String caption(int val) {
		switch (val) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		default:
			return "에러";
		}
	}
}
