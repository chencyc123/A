package c;

import java.util.Scanner;

//����������λ���ֵĻ�Ա����
//ʹ�á�/���͡�%��������ֽ��û�Ա������λ�ϵ����֣�������λ���������
public class c8 {
	//����һ����λ��Ա���ţ�����̨�����Ա���ŵĸ�λ�������������֮�͡�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ��Ա����");
		int a=input.nextInt();//8369
		System.out.println("��Ա�����ǣ�"+a);
		int gewei=a%10;//��λ9  8369%10=836 ����9
		int shiwei=a/10%10;//ʮλ6  8369/10%10=836%10=83 ����6
		int baiwei=a/100%10;//��λ3  8369/100%10=83%10=8 ����3
		int qianwei=a/1000;//ǧλ8  8369/1000=8
		int sum=gewei+shiwei+baiwei+qianwei;
		System.out.println("��Ա���Ÿ�λ����"+gewei);
		System.out.println("��Ա����ʮλ����"+shiwei);
		System.out.println("��Ա���Ű�λ����"+baiwei);
		System.out.println("��Ա����ǧλ����"+qianwei);
		System.out.println("��Ա����"+a+"��λ��֮��Ϊ��"+sum);
		System.out.println("��λ��֮��Ϊ��"+((a%10)+(a/10%10)+(a/100%10)+(a/1000)));
		String b=(sum>20)?"���н��ˣ���Ʒ��MP3��":"û���н���";
		System.out.println("��Ա����"+a+"�Ļ�Ա��"+b);
	}
}
