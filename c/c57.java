package c;
//已知3个班级各5名学生，请使用二维数组计算各个班的总成绩。
public class c57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cores[][]={{12,15,17,18,19,20},{55,33,44,55,88,66},{15,80,60,80,100}};
		int sum=0;//接收每个班的总成绩
		//外层循环班级
		for(int i=0;i<cores.length;i++) {
			sum=0;//每个班总成绩清零
			System.out.println("第"+(i+1)+"班级");
			
			//内循环：控制当前班的每个人
			for(int j=0;j<cores[i].length;j++) {
				sum=sum+cores[i][j];
			}
			System.out.println("这个班的总成绩是："+sum);
			System.out.println("_________________________________");
		}
//		cores[0][0]= 12;
//		cores[0][1]=13;
//		cores[0][2]=15;
//		cores[0][3]=18;
//		cores[0][4]=20;
		
		
	}

}
