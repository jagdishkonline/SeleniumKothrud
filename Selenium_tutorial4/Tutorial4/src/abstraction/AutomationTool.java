package abstraction;

abstract class AutomationTool {
	abstract int getToolCost();  
}
class Selenium extends AutomationTool{  
	int getToolCost(){return 1000;}  
}  
  
class QTP extends AutomationTool{  
	int getToolCost(){return 7000;}  
}  
class SoapUI extends AutomationTool{  
	int getToolCost(){return 9000;}  
}  


/*Abstract Class
If class is declared with abstract keyword then it is called abstract class in java software development language.
If class has abstract method, you must have to declare class as abstract class.
In abstract class, You can only declare abstract methods but you can not define abstract methods.
Sub classes of abstract class must have to implement all abstract methods of super abstract class.
You can not instantiate(Can not create object of) abstract class.
Abstract classes can have concrete methods, constructors and Member variables too.*/