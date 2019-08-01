package c;

import java.util.Arrays;

//使用Arrays类升序排列一组字符，并查找某个特殊字符在升序后数组中的位置。
public class c54 {
	public static void main(String[] args) {
		char chars[]= {'a','c','d','b'};
		System.out.println("数组没升序排序前：");
		for(char charss:chars) {
			System.out.print(charss+"\t");
		}
		Arrays.sort(chars);
		System.out.println("\n数组升序排序后：");
		for(char charsss:chars) {
			System.out.print(charsss+"\t");
		}
		
		 System.out.print("\n字符a在数组中的位置："+Arrays.binarySearch(chars, 'a'));
	}
}
