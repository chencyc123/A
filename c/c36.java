package c;

import java.util.Scanner;

//循环录入java课的学生成绩，统计分数大于等于80分的学生比例。
public class c36 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入班级人数：");
		double number=input.nextInt();//记录班级人的总数
		int count=0;//记录班级大于80分的人数
		for(int i=1;i<=number;i++) {
			System.out.println("请输入第"+i+"位学生的成绩：");
			double score=input.nextDouble();
			if(score>80) {
				count++;
			}
		}
		System.out.println("班级中80分以上的学生人数是："+count);
//		int  ratio=(int)((double)num/5*100);//记录班级大于80分的比例  这个是设置int类型班级总人数
		double ratio=count/number*100;//记录班级大于80分的比例	  这个是设置double类型班级总人数
		System.out.println("班级中大于80分的学员比例为："+ratio+"%");
	}
}
