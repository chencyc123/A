package c;

import java.util.Scanner;

//ѭ��¼��java�ε�ѧ���ɼ���ͳ�Ʒ������ڵ���80�ֵ�ѧ����������ʹ��continue��䣩
public class c37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������༶��������");
		double total=input.nextDouble();
		int count=0;
		for(int i=1;i<=total;i++) {
			System.out.println("�������"+i+"λѧ���ĳɼ���");
			double score=input.nextDouble();
			if(score<=80) {
				continue;
			}
			count++;
		}
		System.out.println("�༶��80�����ϵ�ѧ�������ǣ�"+count);
		double rate=count/total*100;
		System.out.println("�༶�д���80�ֵ�ѧԱ����Ϊ��"+rate);
		
	}

}
