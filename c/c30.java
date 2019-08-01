package c;

import java.util.Scanner;

//多重循环结构
//输出矩形5*5
public class c30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入星：");
		int num=input.nextInt();
		//i行数	嵌套循环（二重找规律一般找外层和内层关系）：外层循环进来一次，内层循环整个执行一遍（循环语句和框架内容）；
		for(int i=1;i<=num;i++) {
			//每一行中星星非个数，列数
			for(int j=1;j<num;j++) {
				System.out.print("*");
			}
			//每一行星星输出完毕后要换行
			System.out.println();
		}
	}

}
