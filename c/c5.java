package c;

public class c5 {

	private String name;
	private int age;
	public c5(){
		this.name="С��";
	}
	
	public c5(String name){
		System.out.println("����"+this.name);
	}
	
	public c5(int age) {
		this.age =11;
		System.out.println("����"+this.age );
	}
	
	public static void main(String[] args){
//		c5 test=new c5();//�������� ����
		c5 test=new c5("Сǿ");//new c5("Сǿ")�����������ش�����ִ��һ��
		test.age =12;
		test.name="������";
		System.out.println("���䣺"+test.age +"���ǣ�"+test.name);

	}

}
