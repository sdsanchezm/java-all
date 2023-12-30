class Area1
{
	public static int K;
	public static int M;
	public static Boolean flag = true;

	static
	{
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		M = sc.nextInt();
		if (M <= 0 || K <= 0)
		{
			flag = false;
			System.out.println("java.lang.Exception: K and M must be positive");
		}
		else
		{
			flag = true;
		}
	}


	public static void main(String[] args)
	{
		if(flag)
		{
			int area=K*M;
			System.out.print(area);
		}	
	}
}