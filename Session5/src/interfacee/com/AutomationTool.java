package interfacee.com;

public interface AutomationTool {// by default in  interface all methods Abstract i.e 100 % Abstraction
void add();
void devide();

}
interface ManualTool
{
	void substract();
}
abstract class ABC implements AutomationTool,ManualTool{
	public void add(){}
}
