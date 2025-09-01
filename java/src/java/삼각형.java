package java;

import java.util.Scanner;

public class 삼각형 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner1.nextLine();
			inputData = scanner2.nextLine();
			inputData = scanner3.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
			break;
			}
		}
		System.out.println("종료");
	}

	}

