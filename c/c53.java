package c;

import java.util.Arrays;

//����Array�ೣ�÷���
public class c53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals(); �Ƚ����������Ƿ����
		int arrays1[]= {10,30,20,40,50};
		int arrays2[]= {10,30,20,40,50};
		int arrays3[]= {10,20,30,40};
		
		System.out.println("Arrays���Arrays.equals(����1,����2);�����Ƚ��������飺");
		System.out.println(Arrays.equals(arrays1, arrays2));
		System.out.println(Arrays.equals(arrays1, arrays3));
		System.out.println("..............................");
		
		//sort(); ��������������    ��Ҫ
		Arrays.sort(arrays1);
		System.out.println("Arrays���Arrays.sort(����);���������������У�");
		for(int array:arrays1) {
			System.out.print(array+"\t");
		}
		
		//��������н���
		System.out.println("\n...................................");
		System.out.println("\n���齵������");
		for(int i=arrays1.length-1;i>=0;i--) {
			System.out.print(arrays1[i]+"\t");
		}
		
		//toString();�������������ת���ַ�����ʽ
		System.out.println("\n...................................");
		System.out.println("Arrays.toString(����);�������ת�����ַ�����ʽ��");
		System.out.println(Arrays.toString(arrays1));
		
		//fill();��������и�ֵ
		System.out.println("..........................................");
		System.out.println("Arrays.fill(����,ֵ);��ֵ�����飺");
		int arr[]= {1,2,3};
		Arrays.fill(arr, 40);
		System.out.print(Arrays.toString(arr));
		
		//copyOf();�����鸴�Ƴ�һ���µĳ��ȵ�����
		System.out.println("...........................................");
		System.out.println("Arrays.copyOf(����,�µĳ���);�����鸴�Ƴ�һ���µĳ��ȵ����飺");
		int arr1[]= {1,2,3,4,5};
		int[] arr2=Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr2));
		
		
		//binarySearch();����ĳ��Ԫ���������е��±�  ǰ������������
		System.out.println(".......................................");
		System.out.println("Arrays.binarySearch(���飬����ֵ); ����ĳ��Ԫ���������е��±� ǰ�������Ȱ���������");
		int nums[]= {1,2,3,5,4};
		//��������
		Arrays.sort(nums);
		
		//����ĳ��Ԫ���������е��±�
		System.out.println(Arrays.binarySearch(nums,3));
	}

}
