package c;

import java.util.Scanner;

//���鴢��5�ʹ�����ڿ���̨����������ܽ��
public class c46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double shu[]=new double[5];
		System.out.println("�������Ա���µ����Ѽ�¼");
		
		
		double sum=0;//��¼�ܽ��
		for(int i=0;i<shu.length;i++) {
			
			System.out.println("�������"+(i+1)+"�ʹ����");
			shu[i]=input.nextDouble();
			sum+=shu[i];
		}
		System.out.print("���"+"\t"+"���(Ԫ)");
		for(int i=0;i<shu.length;i++) {
			System.out.print("\n"+(i+1)+"\t"+shu[i]);
		}
	}

}
