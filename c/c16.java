package c;

import java.util.Scanner;

/**
 * ���̲żӼ������̴���
 * �����һ�����μ���ʡ����ѧ��֯��1��������Ӫ
 * ����ڶ������������ձʼǱ�����һ��
 * ����ڶ����������ƶ�Ӳ��һ��
 * ���򣬲����κν���
 * 
 *
 */
public class c16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������������̴����ڼ�����");
		int mingCi=input.nextInt();
		switch(mingCi) {
		case 1:
			System.out.println("�μ���ʡ����ѧ��֯��1��������Ӫ");
			break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��");
			break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println("���򣬲����κν���");
			break;
		}
	}

}
