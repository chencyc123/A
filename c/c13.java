package c;

import java.util.Scanner;

public class c13 {
//if-else选择结构
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//张浩java成绩大于90分，老师奖励他IPhone6s，或则老师就罚他蹲马步。
		Scanner input=new Scanner(System.in);
		System.out.println("请输入张浩java成绩：");
		int a=input.nextInt();
		if(a>90) {
			System.out.println("老师奖励他IPhone6s");
		}else {
			System.out.println("老师罚他蹲马步");
		}
	}

}
