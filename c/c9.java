package c;
import java.util.*;
//判断一个是否为偶数（能被2整除的数）
public class c9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个非0的数字：");
		int num=input.nextInt();
		String result=(num%2==0)?"偶数":"奇数";
		System.out.println(result);
	}
}
