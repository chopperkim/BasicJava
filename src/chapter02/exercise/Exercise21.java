package chapter02.exercise;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로의 길이: ");
		double width = scanner.nextDouble();
		System.out.print("세로의 길이: ");
		double height = scanner.nextDouble();
		// 처리
		double area = width * height;
		double perimeter = (width + height) * 2; 
		// 출력
		System.out.println(area);
		System.out.println(perimeter);
	}
}
