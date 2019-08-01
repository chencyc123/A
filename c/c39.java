package c;

import java.util.Scanner;

//使用continue；求1~10之间的所有偶数的和
public class c39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字：");
		int core=input.nextInt();
		int sum=0;//记录偶数和
		for(int i=1;i<=core;i++) {
			if(i%2==1) {
				continue;
			}else if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~10之间的所有偶数的和："+sum);
		
	}

}
