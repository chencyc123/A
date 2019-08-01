package c;

import java.util.Scanner;

//do-while选择结构
public class c20 {
//经过几天的学习，老师给张浩一道测试题，让他先上机编写程序完成，然后老师检查是否合格。如果不合格，则继续编写。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("张浩编写程序是否合格（y/n）：");
		String answer=input.next();
		do {
			System.out.println("上机编写程序");
			System.out.println("张浩编写程序是否合格（y/n）：");
			answer=input.next();
		}while(answer.equals("n"));
		System.out.println("编写程序合格！");
	}

}
