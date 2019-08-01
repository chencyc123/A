package c;

import java.util.Scanner;

/**
 * 插入数值
有一组学员的成绩{99,85,82,63,60}，将它们按降序排列。要增加一个学员的成绩，将它插入成绩序列，并保持降序
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
		
		
		System.out.println("请输入要插入的数值：");
		int num=input.nextInt();
		
		//将num插入到nums的index位置
		int index=nums.length-1;
		
		//将用户插入的数据和数组中的5个数依次比较，直到遇到第一个比它小的数值为止
		//第一个比它小的数值所在的位置，就是这个数值要插入的位置index
		for(int i=0;i<nums.length;i++) {
			if(num>nums[i]) {
				index=i;
				break;
			}
		}
		

		//将原来的位置的数值依次往后移，留出空地，插入新值
		for(int j=nums.length-1;j>index;j--) {
			
			
			nums[j]=nums[j-1];
			
		}
		
		
		nums[index]=num;
		System.out.println("插入成绩的下标是："+index);
		System.out.println("插入后的新数组元素如下：");
		
		for(int num1:nums ) {
			System.out.print(num1+"\t");
		}
	}

}
