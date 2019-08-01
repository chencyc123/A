package c;

import java.util.Scanner;

/**
 * 有一个数列：8、4、2、1、23、344、12
循环输出数列的值
求数列中所有数值的和
猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 */
public class c45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int nums[]=new int[] {8,4,2,1,23,344,12};
		int sum=0;//记录所有数值的和
		System.out.print("数列中所有值：");
		//标识：记录用户是否猜对了数字   true猜对了  false没猜中
		boolean flag=false;
		for(int num:nums) {
			System.out.print(num+"\t");
			sum+=num;
		}
		System.out.println("\n数列中所有数值的和："+sum);
//		 do{
			
			//猜数
			System.out.println("你猜猜有那个数字？");
			int guess=input.nextInt();
			for(int num:nums) {
				if(num==guess) {
					flag=true;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println("恭喜，猜对了！");
			}else {
				System.out.println("对不起，没猜中！");
			}
//		}while();
		
	}

}
