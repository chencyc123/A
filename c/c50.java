package c;
//ð������5����
public class c50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[] {98,76,100,6,55};
		
		//ð������(����)
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				//�����������ֱȽϣ����ǰ�����ִ��򽻻�
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
		//�������������Ԫ��
		for(int num:nums) {
			System.out.println(num);
		}
		
	}

}
