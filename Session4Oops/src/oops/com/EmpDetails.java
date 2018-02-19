package oops.com;

abstract class EmpDetails {
	
	abstract void empCode();
	abstract void empAge();
	abstract void empName();
	

}
abstract class EmpCode extends EmpDetails
{
	void empCode() {
		System.out.println(10);
		
	}
}
abstract class EmpName extends EmpCode
{
	void empName()
	{
		System.out.println("abc");
	}
}
class EmpAge extends EmpName
{
	void empAge()
	{
		System.out.println(23);
	}
}
class CallingClass1{
	public static void main(String[] args) {
		EmpAge a = new EmpAge();
		a.empAge();
		a.empCode();
		a.empName();
	}
	
}
