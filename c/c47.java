package c;

import java.util.Scanner;

//�Ӽ������뱾��java������λѧ���ĳɼ������Գɼ���߷�
public class c47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double scores[]=new double[5];
		for(int i=0;i<scores.length;i++) {
			System.out.print("�������"+(i+1)+"��ͬѧ�ĳɼ���");
			scores[i]=input.nextDouble();
			
		}
		//����λͬѧ�Ŀ��Գɼ���߳ɼ� leiTai��max
		double max=scores[0];
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>max) {
				max=scores[i];
			}
		}
		System.out.println("��λͬѧ���Գɼ���߷��ǣ�"+max);
	}

}
