package c;

import java.util.Scanner;

//˫��ѭ������žų˷���
public class c33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("���������֣�");
		int num=input.nextInt();
		//������
		for(int i=1;i<=num;i++) {
			//��������
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			//ÿһ��������֮����
			System.out.println();
			
		}
	}

}
