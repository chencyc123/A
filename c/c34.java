package c;

import java.util.Scanner;

//ѭ��¼��ĳѧ��5�ſεĳɼ�������ƽ���֣����ĳ����¼��Ϊ����ֹͣ¼�벢��ʾ¼�����
public class c34{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name=input.next();

		System.out.println("�����뼸�ſΣ�");
		int shu=input.nextInt();
		double sum=0; //��¼�ɼ����ܺ�
		double avg=0;//��¼5�ſγɼ���ƽ����
		//flag��ʶ����¼�û��Ƿ���������:true��������false��������
		boolean flag=true;
		for(int i=1;i<=shu;i++) {
			System.out.println("������ѧ��"+i+"�ſεĳɼ���");
			//ÿ�ſγɼ�
			double score=input.nextDouble();
			
			//���¼��Ϊ����ֹͣ¼�벢��ʾ
			if(score<=0) {
				System.out.println("��Ǹ������¼����������½���¼�룡");
				flag=false;
				break;
			}
			sum+=score;
			
		}
		if(flag) {
			avg=sum/5;
			System.out.println(name+"��5�ſγɼ���ƽ���֣�"+avg);
		}
		
		
	}

}
