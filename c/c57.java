package c;
//��֪3���༶��5��ѧ������ʹ�ö�ά��������������ܳɼ���
public class c57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cores[][]={{12,15,17,18,19,20},{55,33,44,55,88,66},{15,80,60,80,100}};
		int sum=0;//����ÿ������ܳɼ�
		//���ѭ���༶
		for(int i=0;i<cores.length;i++) {
			sum=0;//ÿ�����ܳɼ�����
			System.out.println("��"+(i+1)+"�༶");
			
			//��ѭ�������Ƶ�ǰ���ÿ����
			for(int j=0;j<cores[i].length;j++) {
				sum=sum+cores[i][j];
			}
			System.out.println("�������ܳɼ��ǣ�"+sum);
			System.out.println("_________________________________");
		}
//		cores[0][0]= 12;
//		cores[0][1]=13;
//		cores[0][2]=15;
//		cores[0][3]=18;
//		cores[0][4]=20;
		
		
	}

}
