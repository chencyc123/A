package c;
/*/
 * ð������   ÿһ�����Ҫ�Ƚϴ���   ��ѡ����������Ƚ϶�
 */
public class c59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores= {16,25,9,90,23};
		
		//���ѭ����������
		for(int i=0;i<scores.length-1;i++) {
			System.out.println("��"+(i+1)+"��");
			//�ڲ�ѭ���Ƚ�ÿһ�ֵĴ���
			for(int j=0;j<scores.length-1-i;j++) {
				
				if(scores[j]>scores[j+1]) {//�������С��<   �������>
					//����Ԫ��
					int temp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
				}
				System.out.println("��"+(j+1)+"��");
				for(int score:scores) {
					System.out.print(score+"\t");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------------------------");
		}
		
		
		System.out.println("ð�������");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
		
	}

}
