package learningjava;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int j = 2;
		String [][] name = new String[i][j];
		String [][] bloodGroup = new String[i][j];
		
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
		
		for (String[] c: name)
		{
			System.out.print(" Name: " + c);
		}
		for (String[] d: bloodGroup)
		{		
			System.out.print(" BloodGroup: " + d);
		}
		System.out.println();
	}

	}
