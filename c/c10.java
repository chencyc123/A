package c;

import java.util.Scanner;
//��ѧԱ�Ŀ��Գɼ����⡣Ҫ����ݲ�ͬѧԱ�ɼ������費ͬ������
//����������£��ɼ�>=80������
//�ɼ�>=60���е�
//�ɼ�<60����
public class c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧԱ�ɼ���");
		int a=input.nextInt();
		String cj1=(a>=80)?"����":"";
		String cj2=(a>=60&&a<80)?"�е�":"";
		String cj3=(a<60)?"��":"";
		System.out.println(cj1+cj2+cj3);
	}

}
