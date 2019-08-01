package c;

import java.util.Scanner;
//对学员的考试成绩评测。要求根据不同学员成绩，给予不同评测结果
//评测规则如下：成绩>=80：良好
//成绩>=60：中等
//成绩<60：差
public class c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学员成绩：");
		int a=input.nextInt();
		String cj1=(a>=80)?"良好":"";
		String cj2=(a>=60&&a<80)?"中等":"";
		String cj3=(a<60)?"差":"";
		System.out.println(cj1+cj2+cj3);
	}

}
