package Assignment_1;
import java.util.Scanner;


public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int num = 1;
		int space = n-1;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k <= num) {
				System.out.print("* ");
				k++;
			}
			if (row< n/2+1) {
				num+=2;
				space--;
			}
			else {
				num-=2;
				space++;
			}
			row++;
			System.out.println();
		}

	}

}
