package c;

public class c3 {
	int a;
	
	public static void main(String[] args) {
		c3 t=new c3();
		t.a();
		t.b();
		t.c();
		System.out.println(t.a);
		}
	
	
		void a(){
			a++;
		}
		
		void b(){
			a();
		}
		
		void c() {
			b();
		}
		
}
