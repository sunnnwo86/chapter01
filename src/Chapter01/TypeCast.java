package Chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//imlpicity (암묵적) Type Cast 
		int i = 10;
		long l = i;
		
		System.out.println(i+":"+l);
		//explicity(명시적) Type Cast
		
		long l2 = 1234567890L;
		int i2 =(int)l2;
		
	}

}
