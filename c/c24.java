package c;

import java.util.Scanner;

//for循环结构
//输出加法表
public class c24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个值：");
		int num=input.nextInt();
		System.out.println("根据这个数值输出以下加法表：");
		for(int i=0,j=num;i<=num;i++,j--) {
				System.out.println(i+"+"+j);
		}
	}
}
