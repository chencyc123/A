package c;

import java.util.Scanner;
//whileѭ���ṹ
//��ʦÿ�����źƵ�ѧϰ�����Ƿ�ϸ�������ϸ���������С���ʦ���źư��ŵ�ÿ���ѧϰ����Ϊ�������Ķ��̲ģ�ѧϰ���۲��֣������ϻ���̣����մ��벿�֡�
public class c19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�����ź��Ƿ�ϸ�y/n��:");
		String  answer=input.next ();//equals����ֻ��String����

		while(answer.equals("n")) {
			System.out.println("����ѧϰ����");
			System.out.println("�����ϻ����");
			System.out.println("�����ź��Ƿ�ϸ�y/n��:");
			answer=input.next();
					
		}
		System.out.println("�ź�ѧϰ�Ѵ�꣡");
	}

}
