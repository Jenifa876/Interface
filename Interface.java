interface Base
{
	default void show()
	{
		System.out.println("Show");
	}
}
interface Interface1 extends Base
{
	void display();
}
interface Interface2 extends Base
{
	void print();
}
class Test implements Interface1,Interface2
{
	public void display()
	{
		System.out.println("Display");
	}
	public void print()
	{
		System.out.println("Print");
	}
}
class Ex8_2
{
	public static void main(String s[])
	{
		Test t=new Test();
		t.show();
		t.display();
		t.print();
	}
}