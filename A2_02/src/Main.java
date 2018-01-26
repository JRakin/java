import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int Num1=scan.nextInt();
		int Num2=scan.nextInt();
		scan.close();
		
		for(int I=0;I<Num1;I++) {
			for(int K=0;K<Num2;K++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
