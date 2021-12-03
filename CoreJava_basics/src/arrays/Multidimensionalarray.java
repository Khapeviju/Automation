package arrays;

public class Multidimensionalarray {

	public static void main(String[] args) {
		
		
		String[][]data = new String[3][2];
		
		//Row1
		data[0][0]="user1";
		data[0][1]="Password1";
		
		//row 2
		
		data[1][0]="user2";
		data [1][1]="password2";
		
		//row 3
		
		data [2][0]="user3";
		data [2][1]="password3";
		
		for(int r=0; r<3; r++)
		{ 
			for(int c=0; c<2; c++)
			{
				System.out.println(data[r][c]);
			}
			
			/*System.out.println(data[r][0]);
			 * 
			System.out.println(data[r][1]);
			*/
			
		}
		
		
		}
		

	}

