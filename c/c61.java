package c;
//���֣��۰룩���ҷ�
public class c61 {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		int searchNum=4;//Ҫ���ҵ�����
		int startIndex=0;//���忪ʼ���ҷ�Χ���±�
		int endIndex=arr.length-1;//����������ҷ�Χ���±�
		int midIndex=-1;//�����м�λ�õ��±�
		boolean isFind=false;//����Ƿ��ҵ���falseû�ҵ���true�ҵ���
		
		do {
			midIndex=(startIndex+endIndex)/2;
			if(arr[midIndex]==searchNum){
				System.out.println("��ϲ�����ҵ��ˣ��±��ǣ�"+midIndex);
				isFind=true;
				break;
			}else if(arr[midIndex]>searchNum) {
				endIndex=midIndex-1;
			}else {
				endIndex=midIndex+1;
			}
			
		}while(startIndex<=endIndex);
		
		if(!isFind) {
			System.out.println("������û���ҵ�");
		}
	}
}
