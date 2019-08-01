package c;

import java.util.Scanner;

//循环录入某学生5门课的成绩并计算平均分，如果某分数录入为负，停止录入并提示录入错误。
public class c34{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name=input.next();

		System.out.println("请输入几门课：");
		int shu=input.nextInt();
		double sum=0; //记录成绩的总和
		double avg=0;//记录5门课成绩的平均分
		//flag标识：记录用户是否输入有误:true输入无误、false输入有误
		boolean flag=true;
		for(int i=1;i<=shu;i++) {
			System.out.println("请输入学生"+i+"门课的成绩：");
			//每门课成绩
			double score=input.nextDouble();
			
			//如果录入为负，停止录入并提示
			if(score<=0) {
				System.out.println("抱歉，分数录入错误，请重新进行录入！");
				flag=false;
				break;
			}
			sum+=score;
			
		}
		if(flag) {
			avg=sum/5;
			System.out.println(name+"的5门课成绩的平均分："+avg);
		}
		
		
	}

}
