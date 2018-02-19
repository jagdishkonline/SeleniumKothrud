package encapsulation;

public class EncapsulationClass {
    private int empCode;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpCode(){
        return empCode;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpCode(int newValue){
        empCode = newValue;
    }
}