package encapsulation;

public class CallingEncapsulation {

	public static void main(String args[]){
        EncapsulationClass obj = new EncapsulationClass();
        obj.setEmpName("Sanket");
        obj.setEmpAge(24);
        obj.setEmpCode(341234);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpCode());
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 

}
