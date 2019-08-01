package c;
/*
 * 选择排序
 */
public class c60 {
	public static void main(String[] args) {
		int arr[]= {4,7,3,9,1};
		int min=-1;//记录最小值的下标
		
		//外层循环：比较几轮
		for(int i=0;i<arr.length-1;i++) {
			min=i;//每轮min的初始值
			//内层循环：当前的元素比较后面的元素，记录最新的最小元素下标
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {//如果降序小于<   升序大于>
					min=j;
				}
			}
			
			
			//如果min值发生变化，说明发现了更小的值，则将当前值和更小的值交换，保证小值放在数组前面
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			System.out.print("第"+(i+1)+"轮："+"\n");
			for(int num:arr) {
				
				System.out.print(num+"\t");
				
				
			}
			System.out.println();
			System.out.println("--------------------------------------------------");
			
		}
		
		
		//输出排序后的数组
		for(int num:arr) {
			System.out.print(num+"\t");
		}
		
	}
}
