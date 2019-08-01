package c;

import java.util.Scanner;
//输出空心菱形
public class c41 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字：");
		int num=input.nextInt();//控制正等腰三角形5
		int sum=input.nextInt();//控制倒等腰三角形行数4
		//行数
		for(int i=1;i<=num;i++) {
			//空格
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			//列数
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		//倒等腰三角形  行数
		for(int i=1;i<=sum;i++ ) {
			//空格
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//列数
			for(int j=1;j<=2*(num-i)-1;j++) {
				if(j==1||j==2*(num-i)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
