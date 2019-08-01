package c;

import java.util.Scanner;
//if选择结构
public class c12 {
	//张浩java成绩大于90，并且音乐成绩大于80时，或者java成绩等于100，音乐成绩大于70分时，老师奖励他。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入java成绩：");
		int a=input.nextInt();
		System.out.println("请输入音乐成绩：");
		int b=input.nextInt();
		if(a>90&&b>80||a==100&&b>70) {
			System.out.println("老师奖励");
		}
	}

}
