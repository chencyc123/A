package c;

import java.util.Scanner;

//����ѭ���ṹ
//���ƽ���ı���5*5
public class c31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�������ǣ�");
		int num=input.nextInt();
		//i����	Ƕ��ѭ��������Ҫ�ҹ���һ���������ڲ��ϵ�������ѭ������һ�Σ��ڲ�ѭ������ִ��һ�飨ѭ�����Ϳ�����ݣ���
		for(int i=1;i<=num;i++) {
			//����հ�
			for(int h=1;h<=num-i;h++) {
				System.out.print(" ");
			}
			//ÿһ�������ǷǸ���������
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			//ÿһ�����������Ϻ�Ҫ����
			System.out.println();
		}
	}

}
