package c;

import java.util.Scanner;

//键盘输入四位数字的会员卡号
//使用“/”和“%”运算符分解获得会员卡各个位上的数字，将各个位上数字求和
public class c8 {
	//输入一个四位会员卡号，控制台计算会员卡号的各位数，并计算各数之和。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个四位会员卡：");
		int a=input.nextInt();//8369
		System.out.println("会员卡号是："+a);
		int gewei=a%10;//个位9  8369%10=836 余数9
		int shiwei=a/10%10;//十位6  8369/10%10=836%10=83 余数6
		int baiwei=a/100%10;//百位3  8369/100%10=83%10=8 余数3
		int qianwei=a/1000;//千位8  8369/1000=8
		int sum=gewei+shiwei+baiwei+qianwei;
		System.out.println("会员卡号个位数："+gewei);
		System.out.println("会员卡号十位数："+shiwei);
		System.out.println("会员卡号百位数："+baiwei);
		System.out.println("会员卡号千位数："+qianwei);
		System.out.println("会员卡号"+a+"各位数之和为："+sum);
		System.out.println("各位数之和为："+((a%10)+(a/10%10)+(a/100%10)+(a/1000)));
		String b=(sum>20)?"你中奖了！奖品是MP3！":"没有中奖！";
		System.out.println("会员卡号"+a+"的会员，"+b);
	}
}
