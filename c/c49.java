package c;

import java.util.Scanner;

//����ļҵ������ֻ��۸�
//�ӿ���̨����ļҵ�۸�
public class c49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�������ļҵ�ļ۸�");
		int num[]=new int [4];
		for(int i=0;i<5;i++) {
			
			System.out.print("��"+(i+1)+"��ļ۸�");
			num[i]=input.nextInt();
		}
		
		
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<max) {
				max=num[i];
			}
		}
		System.out.println("�ļҵ������ֻ��۸�"+max);
	}

}
