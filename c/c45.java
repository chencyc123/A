package c;

import java.util.Scanner;

/**
 * ��һ�����У�8��4��2��1��23��344��12
ѭ��������е�ֵ
��������������ֵ�ĺ�
������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
 */
public class c45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int nums[]=new int[] {8,4,2,1,23,344,12};
		int sum=0;//��¼������ֵ�ĺ�
		System.out.print("����������ֵ��");
		//��ʶ����¼�û��Ƿ�¶�������   true�¶���  falseû����
		boolean flag=false;
		for(int num:nums) {
			System.out.print(num+"\t");
			sum+=num;
		}
		System.out.println("\n������������ֵ�ĺͣ�"+sum);
//		 do{
			
			//����
			System.out.println("��²����Ǹ����֣�");
			int guess=input.nextInt();
			for(int num:nums) {
				if(num==guess) {
					flag=true;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println("��ϲ���¶��ˣ�");
			}else {
				System.out.println("�Բ���û���У�");
			}
//		}while();
		
	}

}
