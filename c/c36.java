package c;

import java.util.Scanner;

//ѭ��¼��java�ε�ѧ���ɼ���ͳ�Ʒ������ڵ���80�ֵ�ѧ��������
public class c36 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����༶������");
		double number=input.nextInt();//��¼�༶�˵�����
		int count=0;//��¼�༶����80�ֵ�����
		for(int i=1;i<=number;i++) {
			System.out.println("�������"+i+"λѧ���ĳɼ���");
			double score=input.nextDouble();
			if(score>80) {
				count++;
			}
		}
		System.out.println("�༶��80�����ϵ�ѧ�������ǣ�"+count);
//		int  ratio=(int)((double)num/5*100);//��¼�༶����80�ֵı���  ���������int���Ͱ༶������
		double ratio=count/number*100;//��¼�༶����80�ֵı���	  ���������double���Ͱ༶������
		System.out.println("�༶�д���80�ֵ�ѧԱ����Ϊ��"+ratio+"%");
	}
}
