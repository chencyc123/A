package c;
import java.util.*;
//�ж�һ���Ƿ�Ϊż�����ܱ�2����������
public class c9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����0�����֣�");
		int num=input.nextInt();
		String result=(num%2==0)?"ż��":"����";
		System.out.println(result);
	}
}
