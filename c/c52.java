package c;

import java.util.Arrays;
import java.util.Scanner;

//ʹ��Arrays�԰༶ѧԱ�ɼ���������
public class c52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[]=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("������༶5��ѧԱ�ĳɼ���");
		for(int i=0;i<scores.length;i++) {
			System.out.print("�������"+(i+1)+"��ѧԱ�ɼ���");
			scores[i]=input.nextInt();
		}
		//Arrays.sort(��������) ��������
		Arrays.sort(scores);
		
		System.out.println("�༶ѧԱ�ɼ������������");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
		
		
	}

}
