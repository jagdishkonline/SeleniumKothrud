package oops.com;

abstract class AbstractClass {

	abstract void add(); //declartion semicolon is end of statement(here we are using 0 to 50%
	
	public void subtract()//implementation concreatte method 
	{
		
	}
	abstract void devide(); //abstract method i.e implemented method
}
abstract class ChildClass extends AbstractClass
{
	void add(){}// it converts non abstract method,In Child Class Implement three methods
}
class CallingClass
{
	public static void main(String[] args) {
		ChildClass inst = new ChildClass() {

			@Override
			void devide() {
				// TODO Auto-generated method stub
				
			}//Its Not Possible To create Instance of Abstract Class
			
			
				
			
		};
	}
}
