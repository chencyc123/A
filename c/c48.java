package c;

import java.util.Scanner;

/**
 * ������ֵ
��һ��ѧԱ�ĳɼ�{99,85,82,63,60}�������ǰ��������С�Ҫ����һ��ѧԱ�ĳɼ�����������ɼ����У������ֽ���
 * @author cyc
 *
 */
public class c48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[6];
		nums[0]=99;
		nums[1]=85;
		nums[2]=82;
		nums[3]=63;
		nums[4]=60;
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("������Ҫ�������ֵ��");
		int num=input.nextInt();
		
		//��num���뵽nums��indexλ��
		int index=nums.length-1;
		
		//���û���������ݺ������е�5�������αȽϣ�ֱ��������һ������С����ֵΪֹ
		//��һ������С����ֵ���ڵ�λ�ã����������ֵҪ�����λ��index
		for(int i=0;i<nums.length;i++) {
			if(num>nums[i]) {
				index=i;
				break;
			}
		}
		

		//��ԭ����λ�õ���ֵ���������ƣ������յأ�������ֵ
		for(int j=nums.length-1;j>index;j--) {
			
			
			nums[j]=nums[j-1];
			
		}
		
		
		nums[index]=num;
		System.out.println("����ɼ����±��ǣ�"+index);
		System.out.println("������������Ԫ�����£�");
		
		for(int num1:nums ) {
			System.out.print(num1+"\t");
		}
	}

}
