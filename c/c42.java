package c;

import java.util.Scanner;
//�����������
public class c42 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������֣�");
		int num=input.nextInt();//����������������5
		int sum=input.nextInt();//���Ƶ���������������4
		//����
		for(int i=1;i<=num;i++) {
			//�ո�
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			//����
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(num-i);
			}
			System.out.println();
		}
		//������������  ����
		for(int i=1;i<=sum;i++ ) {
			//�ո�
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//����
			for(int j=1;j<=2*(num-i)-1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}