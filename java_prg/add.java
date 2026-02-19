class Blessings
{
	int y=20;
	
	void dispaly()
	{
		System.out.println("Method 2");
	}
	
	public static void main(String args[])
	{
		int x=10;
		Blessings b1=new Blessings();
		System.out.println(x);
		System.out.println(b1.y);
		b1.display();
	}
	
	
	
}

