package c;
/**
 * 1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ����
 * ��ʾ��
 * 1��ʹ��ѭ�������ۼӣ���1��10
 * 2���ж��ۼ�ֵ�Ƿ����20
 * 3���������20��������ѭ��������ӡ��ǰֵ
 * @author cyc
 *
 */
public class c35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//�ۼ�ֵ
		int i=1;
		for(;i<=10;i++) {
			sum+=i;
			if(sum>20) {
				break;
			}
			
		}
		System.out.println("1��10֮���������ӣ�" +i);
	}

}
