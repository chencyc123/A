package c;

import java.util.Scanner;

//for循环结构
//循环输入某同学S1结业考试的5门课成绩，并计算平均分。
public class c23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name=input.next();
		
		double avg=0;//平均分
		double sum=0;//门课成绩之和
		for(int i=1;i<=5;i++) {
			System.out.print("请输入5门功课中第"+i+"门课的成绩：");
			double score=input.nextDouble();
			sum=sum+score;
		}
		avg=sum/5;
		System.out.println();
		
	}

}
