package c;

import java.util.Scanner;

/*
 * �����ͼ۸�
 */
public class c58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pricse=new int[4];
		System.out.println("������4�ҵ�ļ۸�");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<pricse.length;i++) {
			System.out.print("��"+(i+1)+"��ļ۸�");
			pricse[i]=input.nextInt();
		}
		
		
		//������ͼ۸�
		int min=pricse[0];//��¼��ͼ۸�
		for(int i=0;i<pricse.length;i++) {
			if(pricse[i]<min) {
				min=pricse[i];
			}
		}
		System.out.println("��ͼ۸��ǣ�"+min);
		
	}

}
