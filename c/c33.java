package c;

import java.util.Scanner;

//双重循环输出九九乘法表
public class c33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字：");
		int num=input.nextInt();
		//控制行
		for(int i=1;i<=num;i++) {
			//控制列数
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			//每一行输出完毕之后换行
			System.out.println();
			
		}
	}

}
