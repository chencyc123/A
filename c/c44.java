package c;
//java���Խ�������ʦ���źƷ�����һ��������������ȫ�ࣨ30�ˣ���ƽ���֡�
import java.util.Scanner;
//���鳤�ȣ���������  .length
public class c44 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double scores[]=new double[30];//ȫ������
		double sum=0;//��¼ƽ����
		for(int i=0;i<scores.length;i++) {
			System.out.println("���"+(i+1)+"��ͬѧ�ĳɼ���");
			scores[i]=input.nextDouble();//��¼ȫ��ÿ��ͬѧ�ĳɼ�
			sum+=scores[i];
			
		}
		//����ƽ����
		double avg=sum/scores.length;
		System.out.println("�༶ѧԱ��ƽ�����ǣ�"+avg);
	}
}
