package c;

public class c5 {

	private String name;
	private int age;
	public c5(){
		this.name="小新";
	}
	
	public c5(String name){
		System.out.println("我是"+this.name);
	}
	
	public c5(int age) {
		this.age =11;
		System.out.println("年龄"+this.age );
	}
	
	public static void main(String[] args){
//		c5 test=new c5();//不带参数 不会
		c5 test=new c5("小强");//new c5("小强")带参数会重载带参数执行一遍
		test.age =12;
		test.name="陈永昌";
		System.out.println("年龄："+test.age +"我是："+test.name);

	}

}
