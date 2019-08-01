package c;

import java.util.Scanner;
//乘、除、加、减、取余表；
public class c40 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字：");
		int sum=input.nextInt();
		//九九乘法表
		for(int i=1;i<=sum;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		//1到100加法表
		System.out.println("请输入数字：");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"+"+j+"="+(i+j)+"\t");
			}
			System.out.println();
		}
		//除法表
		System.out.println("请输入数字：");
		int core=input.nextInt();
		for(int i=1;i<=core;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"/"+j+"="+(i/j)+"\t");
			}
			System.out.println();
		}
		//取余表
		System.out.println("请输入数字：");
		int score=input.nextInt();
		for(int i=1;i<=score;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"%"+j+"="+(i%j)+"\t");
			}
			System.out.println();
		}
		//减法表
		System.out.println("请输入数字：");
		int c=input.nextInt();
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"-"+j+"="+(i-j)+"\t");
			}
			System.out.println();
		}
	}
}
