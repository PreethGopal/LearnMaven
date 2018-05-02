package learningjava;

public class MultiDimentionalArray {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
        int columns=2;
        int rows=5;
		String [][] name = new String[rows][columns];
		String [][] bloodGroup = new String[rows][columns];
		
		name[0][0] = "Preethi";
		name[1][0] = "Prasanth";
		name[2][0] = "Meera";
		name[3][0] = "Divya";
		name[4][0] = "Gopal";		
						
		bloodGroup[0][1] = "O+";
		bloodGroup[1][1] = "B+";
		bloodGroup[2][1] = "AB+";
		bloodGroup[3][1] = "B-";
		bloodGroup[4][1] = "AB-";
		
		for (int i=0;i<5;i++)
		{
		for (int j=0;j<1;j++)
		{
			System.out.print(" Name: " +name[i][j]);
			System.out.print(" BloodGroup: " + bloodGroup[i][1]);
		}
		System.out.println();
		}
	}

}
