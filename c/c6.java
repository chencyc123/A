package c;

public class c6 {
	public int coutStr(String[] arry,String str){
		int count=0;
		for(int i=0;i<arry.length;i++){
			if(arry[i].indexOf(str) !=-1) 
//			{
				count++;
//			}
		}
		return count;
		}
		public static void main(String[] args){
		String[] arry={"happy","apple","money","ending"};
		String findStr="a";
		c6 test=new c6();
		int count=test.coutStr(arry,findStr);
		System.out.println("此java的数组中有"+count+"个字符串包含字符"+findStr);
		}
		
}
