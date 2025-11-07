package lab_13;

public class lab_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(5,10)); 
		System.out.println(gcd(35,7)); 
		System.out.println(gcd(1071,462)); 
		System.out.println(gcd(1386,3213)); 
		System.out.println();
		System.out.println(sumDigits(123)); // 6
		System.out.println(sumDigits(12345)); // 15
		System.out.println(sumDigits(954736163)); // 44
		System.out.println();
		System.out.println(toBinary(0)); // 0
		System.out.println(toBinary(1)); // 1
		System.out.println(toBinary(5)); // 101
		System.out.println(toBinary(10)); // 1010
		System.out.println(toBinary(42)); // 101010

		
		
		
	}
	public static int gcd(int a, int b)
	{
		if (b == 0)
		{
			return a;
		}
		return gcd(b, a % b);
		
	}
	public static int sumDigits(int num)
	{
		if (num % 10 == num)
		{
			return num;
		}
		return (num % 10) + sumDigits(num / 10);
	}
	public static String toBinary(int n)
	{
		 	if (n == 0) 
		 	{
	            return "0";
	        } 
		 	else if (n == 1) 
	        {
	            return "1";
	        } 
		 	else 
		 	{
	            return toBinary(n / 2) + (n % 2);
	        }
	}
	

}
