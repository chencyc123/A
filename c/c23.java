package c;

import java.util.Scanner;

//forѭ���ṹ
//ѭ������ĳͬѧS1��ҵ���Ե�5�ſγɼ���������ƽ���֡�
public class c23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name=input.next();
		
		double avg=0;//ƽ����
		double sum=0;//�ſγɼ�֮��
		for(int i=1;i<=5;i++) {
			System.out.print("������5�Ź����е�"+i+"�ſεĳɼ���");
			double score=input.nextDouble();
			sum=sum+score;
		}
		avg=sum/5;
		System.out.println();
		
	}

}
