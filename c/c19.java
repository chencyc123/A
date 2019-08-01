package c;

import java.util.Scanner;
//while循环结构
//老师每天检查张浩的学习任务是否合格，如果不合格，则继续进行。老师个张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
public class c19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("今天张浩是否合格（y/n）:");
		String  answer=input.next ();//equals方法只能String接收

		while(answer.equals("n")) {
			System.out.println("上午学习理论");
			System.out.println("下午上机编程");
			System.out.println("今天张浩是否合格（y/n）:");
			answer=input.next();
					
		}
		System.out.println("张浩学习已达标！");
	}

}
