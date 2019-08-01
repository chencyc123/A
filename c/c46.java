package c;

import java.util.Scanner;

//数组储存5笔购物金额，在控制台输出并计算总金额
public class c46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double shu[]=new double[5];
		System.out.println("请输入会员本月的消费记录");
		
		
		double sum=0;//记录总金额
		for(int i=0;i<shu.length;i++) {
			
			System.out.println("请输入第"+(i+1)+"笔购物金额：");
			shu[i]=input.nextDouble();
			sum+=shu[i];
		}
		System.out.print("序号"+"\t"+"金额(元)");
		for(int i=0;i<shu.length;i++) {
			System.out.print("\n"+(i+1)+"\t"+shu[i]);
		}
	}

}
