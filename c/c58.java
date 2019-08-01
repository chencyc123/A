package c;

import java.util.Scanner;

/*
 * 输出最低价格
 */
public class c58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pricse=new int[4];
		System.out.println("请输入4家店的价格：");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<pricse.length;i++) {
			System.out.print("第"+(i+1)+"店的价格：");
			pricse[i]=input.nextInt();
		}
		
		
		//计算最低价格
		int min=pricse[0];//记录最低价格
		for(int i=0;i<pricse.length;i++) {
			if(pricse[i]<min) {
				min=pricse[i];
			}
		}
		System.out.println("最低价格是："+min);
		
	}

}
