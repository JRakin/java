import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int Num=scan.nextInt();
		scan.close();
		
		for(int I=0;I<Num;I++) {
			for(int K=0;K<=I;K++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
