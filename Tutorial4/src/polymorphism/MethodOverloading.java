package polymorphism;

public class MethodOverloading {

	public int display(char c)
    {
         System.out.println(c);
    }
    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public void display(String c, int num)  
    {
         System.out.println(c + " "+num);
    }
    void add(){}
    void add(int a){}
    void add(int a, int b){}
    void add(int a, int b, int c){}
    void add(int d, int e){}
    
}

//invalid Scenario

/*int method(int a, int b, float c)
int method(int var1, int var2, float var3)

int method(int a, int b)
float method(int var1, int var2)*/