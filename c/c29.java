package c;

import java.util.Scanner;

//�ӿ���̨����һ����n��ʹ��forѭ��ʵ����n!
//��ʾ��n!=n*(n-1)*(n-2)*...*1
//��1!+2!+3!+..+n!��ֵ
public class c29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=input.nextInt();
		int sum=0;//��¼�׳��ܺ�
		int result=1;//�׳˵����ս��
		for(int i=1;i<=n;i++) {
			result*=i;
			sum+=result;
		}
		System.out.println(n+"�Ľ׳���"+result);
		System.out.println("1!+2!+3!+..+"+n+"��ֵ:"+sum);
	}

}
