package c;

import java.util.Scanner;

/**
 * 对学员的考试成绩评测	
 * 成绩>80：良好	
 * 成绩 >60：中等	
 * 成绩<60：差
* @author cyc 
*/
public class c14 {
//多重if-else选择结构
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学员的考试成绩：");
		int a=input.nextInt();
		if (a>=80) {
			System.out.println("良好");
		} else if(a>=60){
			System.out.println("中等");
		}else {
			System.out.println("差");
		}
		
	}

}
