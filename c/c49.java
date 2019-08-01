package c;

import java.util.Scanner;

//求出四家店的最低手机价格
//从控制台输出四家店价格
public class c49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入四家店的价格：");
		int num[]=new int [4];
		for(int i=0;i<5;i++) {
			
			System.out.print("第"+(i+1)+"店的价格：");
			num[i]=input.nextInt();
		}
		
		
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<max) {
				max=num[i];
			}
		}
		System.out.println("四家店的最低手机价格："+max);
	}

}
