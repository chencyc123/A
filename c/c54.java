package c;

import java.util.Arrays;

//ʹ��Arrays����������һ���ַ���������ĳ�������ַ�������������е�λ�á�
public class c54 {
	public static void main(String[] args) {
		char chars[]= {'a','c','d','b'};
		System.out.println("����û��������ǰ��");
		for(char charss:chars) {
			System.out.print(charss+"\t");
		}
		Arrays.sort(chars);
		System.out.println("\n�������������");
		for(char charsss:chars) {
			System.out.print(charsss+"\t");
		}
		
		 System.out.print("\n�ַ�a�������е�λ�ã�"+Arrays.binarySearch(chars, 'a'));
	}
}
