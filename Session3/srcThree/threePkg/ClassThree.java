package threePkg;

public class ClassThree {

	public static void main(String[] args) {
		// array of type String,always index starts with zero
		String [] strArr1 = new String[3];  //strArr = it is type of string which reference to this memory allocation
		strArr1[1]= "Sankalp";
		for(int i=0; i<=strArr1.length-1;i++) //length()= it will return you size of array 
			//if -1 is not there it will throws exception i.e ArrayIndexOutofBoundException
		{
			System.out.println(strArr1[i]);
		}
		
		//Integer Array
		int [] arrAge= new int[3];
		arrAge[1] =30;
	//	arrAge[2] ='c';  it will print ASCII value i.e 99
		for(int i=0;i<=arrAge.length-1;i++)
		{
			System.out.println(+arrAge[i]+"   "+strArr1[i]);
		}
		
	/*	Assignment Print       null     0
		                                           Sankalp  30
		                                               null     0
		                        
		                        */
		
		
		Object[] arrObject =new Object[3];//Object is class it can be hold any diff kind of data type as well as different Class Object
		arrObject[0] = 1000000;
		arrObject[1] = "abc";
		arrObject[2] = 20;
		
		//String[] arrString = {"a","b"};
		
	//Assigment	=I have five Car Model in String Array Each Car model has its own price so i need to print first three car model with its price
     //  String[] carModel = {"Maruti","Tata","Suzuki","I10","Santro"};
      // carModel[0]= 500000;
		String [] strArr = new String[5];
		strArr[0]= "Maruti";
		strArr[1]= "Tata";
		strArr[2]= "Suzuki";
		strArr[3]= "I10";
		strArr[4]= "Honda";
		int[] arrInt = new int[5];
		arrInt[0]=10;
		arrInt[1]=20;
		arrInt[2]=30;
		arrInt[3]=40;
		arrInt[4]=50;
		
		for(int j=0;j<=2;j++)
		{
			System.out.println("Car Model is= " +strArr[j]  +"<<>>"  +   " *Price is= "+ arrInt[j]);
		}
		
		
	}

}
