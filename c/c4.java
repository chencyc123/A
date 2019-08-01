package c;

public class c4{

	public static int num=10;
	
	public static void chang(){
	num=30;
	}
	
	public static void main(String[] args){
	num=20;
	chang();
	System.out.println(num);
	}
}
