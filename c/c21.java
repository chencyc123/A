package c;

import java.util.Scanner;

/**
 * ʹ��while��do-while�Լ�forѭ�����ֱ�̷�ʽʵ��
 * ����100���ڣ�����100����ż��֮�͡�
 * @author cyc
 *
 */
public class c21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������֣�");
		int num=input.nextInt();
		
		int i=0; 
		int sum=0; //ż��֮��
		//whileѭ���ṹ
//		while(i<=num){ 
//			i++; 
//			if(i%2==0){ 
//				sum=sum+i; 
//			} 
//		} 
//		System.out.println("100����ż����Ϊ��"+sum); 
//		//do-whileѭ���ṹ
//		do {
//			i++;
//			if(i%2==0) {
//				sum+=i;
//			}
//		}while(i<=num);
//		System.out.println("100����ż����Ϊ��"+sum);
		//forѭ���ṹ
		for(;i<=num;i++){ 
			if(i%2==0){ 
				sum=sum+i; 
			} 
		}
		System.out.println("100����ż����Ϊ��"+sum);
	}
}
