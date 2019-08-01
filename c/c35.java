package c;
/**
 * 1~10之间的整数相加，得到累加值大于20的当前数。
 * 提示：
 * 1、使用循环进行累加，从1到10
 * 2、判断累加值是否大于20
 * 3、如果大于20，则跳出循环，并打印当前值
 * @author cyc
 *
 */
public class c35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//累加值
		int i=1;
		for(;i<=10;i++) {
			sum+=i;
			if(sum>20) {
				break;
			}
			
		}
		System.out.println("1到10之间的整数相加：" +i);
	}

}
