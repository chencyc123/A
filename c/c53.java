package c;

import java.util.Arrays;

//测试Array类常用方法
public class c53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals(); 比较连个数组是否相等
		int arrays1[]= {10,30,20,40,50};
		int arrays2[]= {10,30,20,40,50};
		int arrays3[]= {10,20,30,40};
		
		System.out.println("Arrays类的Arrays.equals(数组1,数组2);方法比较两个数组：");
		System.out.println(Arrays.equals(arrays1, arrays2));
		System.out.println(Arrays.equals(arrays1, arrays3));
		System.out.println("..............................");
		
		//sort(); 对数组升序排列    重要
		Arrays.sort(arrays1);
		System.out.println("Arrays类的Arrays.sort(数组);方法进行升序排列：");
		for(int array:arrays1) {
			System.out.print(array+"\t");
		}
		
		//对数组进行降序
		System.out.println("\n...................................");
		System.out.println("\n数组降序结果：");
		for(int i=arrays1.length-1;i>=0;i--) {
			System.out.print(arrays1[i]+"\t");
		}
		
		//toString();方法对数组进行转换字符串形式
		System.out.println("\n...................................");
		System.out.println("Arrays.toString(数组);数组进行转换成字符串形式：");
		System.out.println(Arrays.toString(arrays1));
		
		//fill();将数组进行赋值
		System.out.println("..........................................");
		System.out.println("Arrays.fill(数组,值);赋值给数组：");
		int arr[]= {1,2,3};
		Arrays.fill(arr, 40);
		System.out.print(Arrays.toString(arr));
		
		//copyOf();把数组复制成一个新的长度的数组
		System.out.println("...........................................");
		System.out.println("Arrays.copyOf(数组,新的长度);把数组复制成一个新的长度的数组：");
		int arr1[]= {1,2,3,4,5};
		int[] arr2=Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr2));
		
		
		//binarySearch();查找某个元素在数组中的下标  前提数组先升序
		System.out.println(".......................................");
		System.out.println("Arrays.binarySearch(数组，参数值); 查找某个元素在数组中的下标 前提数组先按升序排列");
		int nums[]= {1,2,3,5,4};
		//升序排列
		Arrays.sort(nums);
		
		//查找某个元素在数组中的下标
		System.out.println(Arrays.binarySearch(nums,3));
	}

}
