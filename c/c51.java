package c;

import java.util.Scanner;

//5��ѧԱҪ�ٿ���̨���
//ʹ��ð������������5��ѧԱ�ɼ����н�������
public class c51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������5��ѧԱ�ĳɼ���");
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
		
		System.out.println("ѧԱ�ɼ����������");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
	}

}
