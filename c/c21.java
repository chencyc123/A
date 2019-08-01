package c;

import java.util.Scanner;

/**
 * 使用while、do-while以及for循环三种编程方式实现
 * 计算100以内（包括100）的偶数之和。
 * @author cyc
 *
 */
public class c21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字：");
		int num=input.nextInt();
		
		int i=0; 
		int sum=0; //偶数之和
		//while循环结构
//		while(i<=num){ 
//			i++; 
//			if(i%2==0){ 
//				sum=sum+i; 
//			} 
//		} 
//		System.out.println("100以内偶数和为："+sum); 
//		//do-while循环结构
//		do {
//			i++;
//			if(i%2==0) {
//				sum+=i;
//			}
//		}while(i<=num);
//		System.out.println("100以内偶数和为："+sum);
		//for循环结构
		for(;i<=num;i++){ 
			if(i%2==0){ 
				sum=sum+i; 
			} 
		}
		System.out.println("100以内偶数和为："+sum);
	}
}
