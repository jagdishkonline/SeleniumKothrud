package threePkg;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] strTwoDim= new String[4][3];//As per excel sheet we taken 4 rows and 3 columns
		strTwoDim[2][2]="g";
		strTwoDim[2][0]="3";
		strTwoDim[3][1]="d";
		int row = strTwoDim.length;
		int col = strTwoDim[0].length;//in matrix Every row having same column numbers i.e. array of row is zero here i.e column
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(strTwoDim[i][j]);
			}
		}

	}

}
