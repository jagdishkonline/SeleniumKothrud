package secondpack;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//syntax  for multiple choices or conditions we are using switch cases
		/*switch(choice){
		case 1: 
			System.out.println();
			break;
		case 2:
			default:
				System.out.println();
		}*/
		String carModel = "Hundai";
		switch(carModel){
		case "Honda": 
			System.out.println(20);
			break;
		case "Maruti":
				System.out.println(25);
			break;
		case "Hundai":
			System.out.println(15);
			break;
		default:
				System.out.println(100);
				
		}
		
		
	}

}
