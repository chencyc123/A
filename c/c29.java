package c;

import java.util.Scanner;

//从控制台输入一个数n，使用for循环实现求n!
//提示：n!=n*(n-1)*(n-2)*...*1
//求1!+2!+3!+..+n!的值
public class c29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n=input.nextInt();
		int sum=0;//记录阶乘总和
		int result=1;//阶乘的最终结果
		for(int i=1;i<=n;i++) {
			result*=i;
			sum+=result;
		}
		System.out.println(n+"的阶乘是"+result);
		System.out.println("1!+2!+3!+..+"+n+"的值:"+sum);
	}

}
