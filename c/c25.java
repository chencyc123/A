package c;

import java.util.Scanner;

//用户键盘录入一个整数，如果该数字为1，则直接输出。否则，对该数字自减，并输出自减后的结果。
public class c25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num=input.nextInt();
		if(num==1){
			System.out.println("你输入的数字是1");
		}else {
			num--;
			System.out.println("自减的后果："+num);
			
		}
		
	}

}
