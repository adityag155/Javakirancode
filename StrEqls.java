package adiiapplication;

public class StrEqls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String str1="CPC";
		String str2="CPC";
		String str3="CPC";
		
		System.out.println(str1==str2);					//t
		System.out.println(str1==str3);					//t
	*/
		
		String str1=new String("CPC");
		String str2=new String("CPC");
		String str3=new String("CPC");
		
		System.out.println(str1==str2);					//f
		System.out.println(str1==str3);					//f
		System.out.println(str1.equals(str2));			//t
	}

}
