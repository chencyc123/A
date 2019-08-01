package c;

import java.util.Scanner;
//if选择结构
//张浩java成绩大于90分，老师奖励他IPhones。
public class  c11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//张浩的java考试成绩
		System.out.println("请输入成绩：");
		int a=input.nextInt();
		if(a>90){
			System.out.println("考的不错，奖励一部IPhone6s");
		}
	}
}
