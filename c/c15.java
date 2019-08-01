package c;

import java.util.Scanner;

public class c15 {
//学校举行运动会，百米赛跑泡入10秒内的学生有资格进决赛，根据性别分别进入男子组和女子组。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//跑进10秒进决赛，进入决赛根据性别进行分组
		Scanner input=new Scanner(System.in);
		System.out.println("请输入跑步成绩：");
		int time=input.nextInt();
		System.out.println("请输入您的性别（男/女）：");
		String sex=input.next();
		if(time>10) {
			if(sex.equals("男")) {
				System.out.println("您进入男子组决赛");
			}else if(sex.equals("女")) {
				System.out.println("您进入女子组决赛");
			}else {
				System.out.println("对不起，您的性别不符合参赛要求！");
			}
		}else {
			System.out.println("对不起，成绩不合格，不能进决赛！");
		}
	}
}
