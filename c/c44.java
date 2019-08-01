package c;
//java考试结束后，老师给张浩分配了一项任务，让他计算全班（30人）的平均分。
import java.util.Scanner;
//数组长度：数组名字  .length
public class c44 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double scores[]=new double[30];//全部人数
		double sum=0;//记录平均分
		for(int i=0;i<scores.length;i++) {
			System.out.println("请第"+(i+1)+"个同学的成绩：");
			scores[i]=input.nextDouble();//记录全班每个同学的成绩
			sum+=scores[i];
			
		}
		//计算平均分
		double avg=sum/scores.length;
		System.out.println("班级学员的平均分是："+avg);
	}
}
