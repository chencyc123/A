package c;

import java.util.Scanner;

/**
 * ��ѧԱ�Ŀ��Գɼ�����	
 * �ɼ�>80������	
 * �ɼ� >60���е�	
 * �ɼ�<60����
* @author cyc 
*/
public class c14 {
//����if-elseѡ��ṹ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧԱ�Ŀ��Գɼ���");
		int a=input.nextInt();
		if (a>=80) {
			System.out.println("����");
		} else if(a>=60){
			System.out.println("�е�");
		}else {
			System.out.println("��");
		}
		
	}

}
