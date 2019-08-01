package c;
//用字母组成等腰三角形
//思路：一个正向，一个反向从数组的第二个开始，还有a夹在中间
public class c43 {
	private String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",  

            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",  

            "x", "y", "z" };  
    public void test() {  
        for (int i = 0; i < arr.length; i++) {  
            for (int j = arr.length; j > i; j--) {  
                System.out.print(" ");  
            }  
            for (int j = i; j > 0; j--) { // 逆向排列输出  
                System.out.print(arr[j]);  
            }  
            System.out.print(arr[0]); // 始终以数组的第一个值为中心  
            for (int j = 0; j < i; j++) { // 正向排列输出  
                System.out.print(arr[j + 1]);  
            } 
            System.out.println(""); // 换行  
        }  
    }  
    public static void main(String[] args) {
		c43 a=new c43();
		a.test();
	}
}
