package c;
//   答案：包名.类名@十六进制
//new了自己 每次调用打印自己  十六进制：本质还是进程作为最小的资源分配单位 它所拥有的内存怎么分配的问题
public class Test {

	static  Test t=new Test();
	
	public void show(){
		System.out.println(t);
	}
	
	public static void main(String[] args){
		t.show();
	}

}
