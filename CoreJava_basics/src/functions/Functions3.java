package functions;

public class Functions3 {
	public static void main(String[] args) {

		// IIT JEE>=40, CET>=60

		// You are eligible

		// You are not eligible

	//	eligibility(39, 50);
     boolean ret= eligibility(39, 60);
     if(ret)
     {
    	 System.out.println("you are eligible");
     }
     else
     {
    	 System.out.println("you are not eligible");
     }
		
        int a=sum(10,20);
        System.out.println(a);
        
        int b=sum(30,40);
        System.out.println(b);
        
        int c=sum(a,b);
        System.out.println(c);
        
	}

	public static boolean eligibility(int iit, int CET)

	{
		if (iit >= 40 || CET >= 60) 
		{
			return true;
		} else {
			return false;
		}
	}

	public static int sum(int a , int b)
	{
		return a+b;
	}
}
