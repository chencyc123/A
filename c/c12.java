package c;

import java.util.Scanner;
//ifѡ��ṹ
public class c12 {
	//�ź�java�ɼ�����90���������ֳɼ�����80ʱ������java�ɼ�����100�����ֳɼ�����70��ʱ����ʦ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������java�ɼ���");
		int a=input.nextInt();
		System.out.println("���������ֳɼ���");
		int b=input.nextInt();
		if(a>90&&b>80||a==100&&b>70) {
			System.out.println("��ʦ����");
		}
	}

}
