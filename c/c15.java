package c;

import java.util.Scanner;

public class c15 {
//ѧУ�����˶��ᣬ������������10���ڵ�ѧ�����ʸ�������������Ա�ֱ�����������Ů���顣
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ܽ�10���������������������Ա���з���
		Scanner input=new Scanner(System.in);
		System.out.println("�������ܲ��ɼ���");
		int time=input.nextInt();
		System.out.println("�����������Ա���/Ů����");
		String sex=input.next();
		if(time>10) {
			if(sex.equals("��")) {
				System.out.println("���������������");
			}else if(sex.equals("Ů")) {
				System.out.println("������Ů�������");
			}else {
				System.out.println("�Բ��������Ա𲻷��ϲ���Ҫ��");
			}
		}else {
			System.out.println("�Բ��𣬳ɼ����ϸ񣬲��ܽ�������");
		}
	}
}
