package c;

import java.util.Scanner;

/**
 * 韩嫣才加计算机编程大赛
 * 如果第一名，参加麻省理工大学组织的1个月夏令营
 * 如果第二名，奖励惠普笔记本电脑一部
 * 如果第二名，奖励移动硬盘一个
 * 或则，不给任何奖励
 * 
 *
 */
public class c16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入计算机编程大赛第几名：");
		int mingCi=input.nextInt();
		switch(mingCi) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("或则，不给任何奖励");
			break;
		}
	}

}
