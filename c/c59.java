package c;
/*/
 * 冒泡排序   每一轮里度要比较次数   比选择排序次数比较多
 */
public class c59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores= {16,25,9,90,23};
		
		//外层循环代表轮数
		for(int i=0;i<scores.length-1;i++) {
			System.out.println("第"+(i+1)+"轮");
			//内层循环比较每一轮的次数
			for(int j=0;j<scores.length-1-i;j++) {
				
				if(scores[j]>scores[j+1]) {//如果降序小于<   升序大于>
					//交换元素
					int temp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
				}
				System.out.println("第"+(j+1)+"次");
				for(int score:scores) {
					System.out.print(score+"\t");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------------------------");
		}
		
		
		System.out.println("冒泡排序后：");
		for(int score:scores) {
			System.out.print(score+"\t");
		}
		
	}

}
