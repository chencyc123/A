package c;
//����ĸ��ɵ���������
//˼·��һ������һ�����������ĵڶ�����ʼ������a�����м�
public class c43 {
	private String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",  

            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",  

            "x", "y", "z" };  
    public void test() {  
        for (int i = 0; i < arr.length; i++) {  
            for (int j = arr.length; j > i; j--) {  
                System.out.print(" ");  
            }  
            for (int j = i; j > 0; j--) { // �����������  
                System.out.print(arr[j]);  
            }  
            System.out.print(arr[0]); // ʼ��������ĵ�һ��ֵΪ����  
            for (int j = 0; j < i; j++) { // �����������  
                System.out.print(arr[j + 1]);  
            } 
            System.out.println(""); // ����  
        }  
    }  
    public static void main(String[] args) {
		c43 a=new c43();
		a.test();
	}
}
