package c;

import java.util.Scanner;

/**
 * ��5������5��ѧ��ĳ�ſγ̵ĳɼ�����μ���5������Ե��ܳɼ���
���������������
 * 
 *
 */
public class c55 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] arrays=new int[5][5];//��һ��5��ָ5���࣬�ڶ���5��ָÿ������5����
		
		//ѭ��¼��ÿ���༶��ѧԱ�ɼ�
		//���ѭ������
		for(int i=0;i<arrays.length;i++) {
			System.out.println("�������������������������������"+(i+1)+"���༶�ĳɼ���������������������������������");
			//�ڲ�ѭ������ǰ���ÿ����
			for(int j=0;j<arrays[i].length;j++) {
				System.out.print("�������"+(j+1)+"��ͬѧ�ĳɼ���");
				arrays[i][j]=input.nextInt();
			}
		}
		
		
		//���������ֱ���ܳɼ�
		System.out.println("\n*********�ɼ�ͳ��**********");
		int sum=0;//����ÿ������ܳɼ�
		
		//���ѭ������
				for(int i=0;i<arrays.length;i++) {
					sum=0;//ÿ�������ͳ���ܳɼ�ǰ����Ҫ��sum����
					System.out.print("���ǵ�"+(i+1)+"���ࣺ");
					//�ڲ�ѭ������ǰ���ÿ����
					for(int j=0;j<arrays[i].length;j++) {
						
						
						sum+=arrays[i][j];
					}
					System.out.println("�������ܳɼ��ǣ�"+sum);
				}
		
	}
}
