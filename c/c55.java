package c;

import java.util.Scanner;

/**
 * 有5个班有5名学生某门课程的成绩，如何计算5个班各自的总成绩。
用输入键盘来输入
 * 
 *
 */
public class c55 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] arrays=new int[5][5];//第一个5是指5个班，第二个5是指每个班有5个人
		
		//循环录入每个班级的学员成绩
		//外层循环：班
		for(int i=0;i<arrays.length;i++) {
			System.out.println("————————————请输入第"+(i+1)+"个班级的成级————————————————");
			//内层循环：当前班的每个人
			for(int j=0;j<arrays[i].length;j++) {
				System.out.print("请输入第"+(j+1)+"个同学的成绩：");
				arrays[i][j]=input.nextInt();
			}
		}
		
		
		//计算各个班分别的总成绩
		System.out.println("\n*********成绩统计**********");
		int sum=0;//接收每个班的总成绩
		
		//外层循环：班
				for(int i=0;i<arrays.length;i++) {
					sum=0;//每个班进来统计总成绩前，需要将sum清零
					System.out.print("这是第"+(i+1)+"个班：");
					//内层循环：当前班的每个人
					for(int j=0;j<arrays[i].length;j++) {
						
						
						sum+=arrays[i][j];
					}
					System.out.println("这个班的总成绩是："+sum);
				}
		
	}
}
