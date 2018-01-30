import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int[] ar=new int[Num];
		boolean isDuplicate=false;
		int Count=1;
		System.out.println();
		
		while(Count<=Num) {
			isDuplicate=false;
			int temp=scan.nextInt();
			for(int I=0;I<=Count-2;I++) {
				if(temp==ar[I]) {
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate) {
				System.out.println("Duplicate found please enter again");
			}
			else {
				ar[Count-1]=temp;
				System.out.print(ar[Count-1]+" ");
				Count++;
			}
			System.out.println();
		}
		scan.close();

	}

}
