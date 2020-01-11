package testData;

public class Demo1 
{
	public static void main(String[] args)
	{
		String un = Datautility.getPropertyData("un");
		System.out.println("user name is "+un);
		String pw =  Datautility.getPropertyData("pw");
		System.out.println("passowrd is   "+pw);
	}

}
