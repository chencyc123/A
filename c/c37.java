package c;

import java.util.Scanner;

//循环录入java课的学生成绩，统计分数大于等于80分的学生比例。（使用continue语句）
public class c37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级总人数：");
		double total=input.nextDouble();
		int count=0;
		for(int i=1;i<=total;i++) {
			System.out.println("请输入第"+i+"位学生的成绩：");
			double score=input.nextDouble();
			if(score<=80) {
				continue;
			}
			count++;
		}
		System.out.println("班级中80分以上的学生人数是："+count);
		double rate=count/total*100;
		System.out.println("班级中大于80分的学员比例为："+rate);
		
	}

}
