package c;
//��ά���� ����չʾһά���顢��ά���顢��ά���顢��λ����
public class c56 {
	public static void main(String[] args) {
	    /*һά����*/
	    int num[] = {0,1,2};
	    /*������� 3 �����ݣ�0 ~ 2*/
	    for (int i = 0; i < num.length; i++) {
	      System.out.println("һά�������ֵ��" + num[i]);
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) �������ǲ��Ǻܼ�����? ��ô���ǽ��ſ���ά����
	    int num1[][] = { {0,1,2},{3,4},{5} };//ע�� ��ʵ�������Ϊ�� �� �� �� 
	    for (int i = 0; i < num1.length; i++) {
	      System.out.print("��ά�������ֵΪ��");
	      for (int j = 0; j < num1[i].length; j++) {
	        System.out.print(" " + num1[i][j]);//num1[i][j] ��ֻ˵����һ�аɣ����� num1[0][1] ���� num1[0]ָnum1���{0,1,2} �������
	      }
	      System.out.println();
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) �����������ǲ�����Щ���������ˣ����ɣ����ſ�����ά���顣
	    int num2[][][] = {
	        {{0,1,2},{4,5}},
	        {{6},{7,8},{9}},
	        {{10,11}}
	    };
	    for (int i = 0; i < num2.length; i++) {
	      System.out.print("��ά�������ֵ��");
	      for (int j = 0; j < num2[i].length; j++) {
	        for (int k = 0; k < num2[i][j].length; k++) {
	          System.out.print(" " +num2[i][j][k]);
	        }
	      }
	      System.out.println();
	    }
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    //(!) ���Ѿ�������ά�ˣ��ǲ�����ͷ����?����׽ס��ʲô������? �� ���������������� ��ά����
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
	    //�������������ָ�ֵ���滻
	    //���� :
	    num3[1][0][0][1] = 404; //���ǰ� 8 ��ʼֵ���滻��Ϊ 404
	    for (int i = 0; i < num3.length; i++) {
	      System.out.print("��ά�������ֵ��");
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
