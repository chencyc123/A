package c;
/*
 * ѡ������
 */
public class c60 {
	public static void main(String[] args) {
		int arr[]= {4,7,3,9,1};
		int min=-1;//��¼��Сֵ���±�
		
		//���ѭ�����Ƚϼ���
		for(int i=0;i<arr.length-1;i++) {
			min=i;//ÿ��min�ĳ�ʼֵ
			//�ڲ�ѭ������ǰ��Ԫ�رȽϺ����Ԫ�أ���¼���µ���СԪ���±�
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {//�������С��<   �������>
					min=j;
				}
			}
			
			
			//���minֵ�����仯��˵�������˸�С��ֵ���򽫵�ǰֵ�͸�С��ֵ��������֤Сֵ��������ǰ��
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			System.out.print("��"+(i+1)+"�֣�"+"\n");
			for(int num:arr) {
				
				System.out.print(num+"\t");
				
				
			}
			System.out.println();
			System.out.println("--------------------------------------------------");
			
		}
		
		
		//�������������
		for(int num:arr) {
			System.out.print(num+"\t");
		}
		
	}
}
