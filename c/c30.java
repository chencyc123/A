package c;

import java.util.Scanner;

//����ѭ���ṹ
//�������5*5
public class c30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�������ǣ�");
		int num=input.nextInt();
		//i����	Ƕ��ѭ���������ҹ���һ���������ڲ��ϵ�������ѭ������һ�Σ��ڲ�ѭ������ִ��һ�飨ѭ�����Ϳ�����ݣ���
		for(int i=1;i<=num;i++) {
			//ÿһ�������ǷǸ���������
			for(int j=1;j<num;j++) {
				System.out.print("*");
			}
			//ÿһ�����������Ϻ�Ҫ����
			System.out.println();
		}
	}

}
