package c;
//冒泡排序5个数
public class c50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[] {98,76,100,6,55};
		
		//冒泡排序(升序)
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				//两个相邻数字比较，如果前面数字大，则交换
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
		//输出排序后的数组元素
		for(int num:nums) {
			System.out.println(num);
		}
		
	}

}
