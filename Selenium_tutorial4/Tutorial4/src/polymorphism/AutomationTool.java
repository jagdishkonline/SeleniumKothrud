package polymorphism;

public class AutomationTool {
	int getToolCost(){return 0;} 
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