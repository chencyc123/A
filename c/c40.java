package c;

import java.util.Scanner;
//�ˡ������ӡ�����ȡ���
public class c40 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������֣�");
		int sum=input.nextInt();
		//�žų˷���
		for(int i=1;i<=sum;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		//1��100�ӷ���
		System.out.println("���������֣�");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"+"+j+"="+(i+j)+"\t");
			}
			System.out.println();
		}
		//������
		System.out.println("���������֣�");
		int core=input.nextInt();
		for(int i=1;i<=core;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"/"+j+"="+(i/j)+"\t");
			}
			System.out.println();
		}
		//ȡ���
		System.out.println("���������֣�");
		int score=input.nextInt();
		for(int i=1;i<=score;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"%"+j+"="+(i%j)+"\t");
			}
			System.out.println();
		}
		//������
		System.out.println("���������֣�");
		int c=input.nextInt();
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"-"+j+"="+(i-j)+"\t");
			}
			System.out.println();
		}
	}
}
