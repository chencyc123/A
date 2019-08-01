package c;
//多维数组 这里展示一维数组、二维数组、三维数组、四位数组
public class c56 {
	public static void main(String[] args) {
	    /*一维数组*/
	    int num[] = {0,1,2};
	    /*下面输出 3 行数据，0 ~ 2*/
	    for (int i = 0; i < num.length; i++) {
	      System.out.println("一维数组输出值：" + num[i]);
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) 看起来是不是很简单明了? 那么我们接着看二维数组
	    int num1[][] = { {0,1,2},{3,4},{5} };//注： 其实你可以认为是 行 和 列 
	    for (int i = 0; i < num1.length; i++) {
	      System.out.print("二维数组输出值为：");
	      for (int j = 0; j < num1[i].length; j++) {
	        System.out.print(" " + num1[i][j]);//num1[i][j] 我只说明第一行吧，比如 num1[0][1] 就是 num1[0]指num1里的{0,1,2} 这个对象。
	      }
	      System.out.println();
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) 到了这里您是不是有些不明所以了？来吧！接着看看三维数组。
	    int num2[][][] = {
	        {{0,1,2},{4,5}},
	        {{6},{7,8},{9}},
	        {{10,11}}
	    };
	    for (int i = 0; i < num2.length; i++) {
	      System.out.print("三维数组输出值：");
	      for (int j = 0; j < num2[i].length; j++) {
	        for (int k = 0; k < num2[i][j].length; k++) {
	          System.out.print(" " +num2[i][j][k]);
	        }
	      }
	      System.out.println();
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) 您已经看到三维了，是不是有头绪了?或者捉住了什么规律了? 来 ！来！来，再来次 四维数组
	    int num3[][][][] = {
	          {
	            {
	              {0,1,2},{3,4,5,6}
	            }
	          },
	          {
	            {
	              {7,8,9},{10,11,12,13,14}
	            }
	          }
	        };
	    //给数组里面数字赋值或替换
	    //例如 :
	    num3[1][0][0][1] = 404; //就是把 8 初始值（替换）为 404
	    for (int i = 0; i < num3.length; i++) {
	      System.out.print("四维数组输出值：");
	      for (int j = 0; j < num3[i].length; j++) {
	        for (int k = 0; k < num3[i][j].length; k++) {
	          for (int l = 0; l < num3[i][j][k].length; l++) {
	            System.out.print(" " +num3[i][j][k][l]);
	          }
	        }
	      }
	      System.out.println();
	    }
	   
	  }
	
}
