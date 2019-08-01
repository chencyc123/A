package c;

import java.util.Arrays;
import java.util.Scanner;

//使用Arrays对班级学员成绩进行排序
public class c52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[]=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级5名学员的成绩：");
		for(int i=0;i<scores.length;i++) {
			System.out.print("请输入第"+(i+1)+"个学员成绩：");
			scores[i]=input.nextInt();
		}
		//Arrays.sort(数组类型) 数组升序
		Arrays.sort(scores);
		
		System.out.println("班级学员成绩按升序排序后：");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
		
		
	}

}
