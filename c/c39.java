package c;

import java.util.Scanner;

//ʹ��continue����1~10֮�������ż���ĺ�
public class c39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("���������֣�");
		int core=input.nextInt();
		int sum=0;//��¼ż����
		for(int i=1;i<=core;i++) {
			if(i%2==1) {
				continue;
			}else if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~10֮�������ż���ĺͣ�"+sum);
		
	}

}
