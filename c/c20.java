package c;

import java.util.Scanner;

//do-whileѡ��ṹ
public class c20 {
//���������ѧϰ����ʦ���ź�һ�������⣬�������ϻ���д������ɣ�Ȼ����ʦ����Ƿ�ϸ�������ϸ��������д��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�źƱ�д�����Ƿ�ϸ�y/n����");
		String answer=input.next();
		do {
			System.out.println("�ϻ���д����");
			System.out.println("�źƱ�д�����Ƿ�ϸ�y/n����");
			answer=input.next();
		}while(answer.equals("n"));
		System.out.println("��д����ϸ�");
	}

}
