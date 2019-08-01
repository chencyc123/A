package c;

import java.util.Scanner;

//5名学员要再控制台输出
//使用冒泡排序对输入的5名学员成绩进行降序排序
public class c51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入5名学员的成绩：");
		int scores[]=new int [5];
		
		for(int i=0;i<scores.length;i++) {
			scores[i]=input.nextInt();	
		}
		
		for(int i=0;i<scores.length-1;i++) {
			for(int j=0;j<scores.length-1-i;j++) {
				if(scores[j]<scores[j+1]) {
					int temp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
				}
			}
		}
		
		System.out.println("学员成绩降序后排序：");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
	}

}
