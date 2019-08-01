package c;

import java.util.Scanner;

//从键盘输入本次java考试五位学生的成绩，求考试成绩最高分
public class c47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double scores[]=new double[5];
		for(int i=0;i<scores.length;i++) {
			System.out.print("请输入第"+(i+1)+"个同学的成绩：");
			scores[i]=input.nextDouble();
			
		}
		//求五位同学的考试成绩最高成绩 leiTai或max
		double max=scores[0];
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>max) {
				max=scores[i];
			}
		}
		System.out.println("五位同学考试成绩最高分是："+max);
	}

}
