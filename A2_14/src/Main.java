import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		scan.close();
		
		for(int I=1;I<=Num;I++) {
			for(int K=1;K<=I;K++) {
				System.out.print(K);
			}
			System.out.println();
		}

	}

}
