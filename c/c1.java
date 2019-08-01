package c;

public class c1 {
	String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好");
		int x=1,y=2,z=3;
		y+=z--/++x;
		System.out.println(y);
		int a=1,b=2,c=3;
		c=a;
		c=c+b;
		System.out.println(c);
		System.out.println((32+10)/(7*10)%3);
		int a1=5;
		int b1=7;
//		a1&=b1;
		a1=a1&b1;
		System.out.println(a1);
//		int a2=1;
//		int b2=1;
//		a2|=b2;
//		System.out.println(a2);
//		int x1=1;
//		x1+=x1+3;
//		System.out.println(x1);
//		int i=5;
//		i++;
//		++i;
//		i--;
//		System.out.println(i);
		
		   
		System.out.println(Integer.toBinaryString(37)); 
		System.out.println(Integer.toBinaryString(13));
		System.out.println(~9);
		System.out.println(Integer.toBinaryString(-43));
		int a2=4;
		a2=~a2;
		System.out.println(a2);
		int a3=6;
		a3>>=2;
		System.out.println(a3);
		int a4=6;
		a4>>>=2;
		System.out.println(a4);
		System.out.println(Integer.toBinaryString(-6));
		int a5=18;//Integer.toUnsignedString(a5, 16)
		  System.out.format("%d", 10).println();
		System.out.println("进制："+Integer.toString(a5,16));//toString（参数 ，转换2、8、16进制  ）
		System.out.println("\t"+Integer.toHexString(a5));//toHexString十六进制 十进制转十六进制
		System.out.println(Integer.toOctalString(a5));//toOctalString八进制  十进制转八进制
		System.out.println(Integer.toBinaryString(a5));//toBinaryString二进制  十进制转二进制
		
//		System.out.println("十六进制18转换2进制"+Integer.toString(core, radix));
		int  a6=1+2*3%4/5;
		System.out.println(a6);
//		int a7=23+(9+87)%13*2;
		int a7=23+7/4+(12+1)%13*2;
		System.out.println(a7);
		int  a9=12;
		int  a10=6;
		int  a11=3;
		int a8=1+(a9--/a10++)+a11/1;
		System.out.println(a8);
		int  a12=3;
		int a13=~a12+3;
		System.out.println(a13);
		c1 s=new c1();
		System.out.println(s.s);
		int a14=1;
		if(a14++>0) {
			System.out.println(a14);
		}
		int x1=20,y1=10;
		int z1;
		if(x1%4==0) {
			if(y1%5==0) {
				z1=x1-y1;
			}else {
				z1=x1/y1;
			}
		}else {
			z1=x1+y1;
		}
		System.out.println(z1);
		
		int sum=0,i;
		for(i=1;i<=4;i++) {
			switch(i) {
			case 1:
				sum=sum+2;
			case 2:
				sum=sum+4;
				continue;
			case 3:
				sum=sum+16;
				break;
			}	
		}
		System.out.println(sum);
		
		int i1=0;
		while(i1<9){
		i1++;
		if(i1%2 !=0){
		continue;
		}
		System.out.print(i1);
		}
		System.out.println();
		System.out.println(1%2);
		
		int sum1=0;//代码1
		for(int i11=1;i11<=100;){//代码2
			sum1=sum1+i11++;//代码3
		}
		System.out.println("sum1："+sum1);
		
		int str2=11;
		double str3=11;
		System.out.println(str2==str3);
		String str1="ABC";
		String s12="ABC";
		System.out.println(str1.equals(s12));
		System.out.println(str1==s12);
		
//		Scanner input=new Scanner(System.in);
//		input.next
		//运算符+、-、*、/、%、++、--
		int num1=9;
		int num2=2;
		
	
		System.out.println("加+："+(num1+num2));
		System.out.println ("减-："+(num1-num2));
		System.out.println("乘*："+(num1*num2));
		System.out.println("除/："+(num1/num2));
		System.out.println("取余%："+(num1%num2));
		System.out.println("先自加++："+(++num1));
		System.out.println("先自减--："+(--num1));
		System.out.println("先赋值再自减--："+(num1--+1));
		System.out.println("先赋值再自加++："+(num1++-1));
		
		
		
		
	}

}
