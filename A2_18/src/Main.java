import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		scan.close();
		
		for(int I=1;I<=Num;I++) {
			for(int K=1;K<=Num-I;K++) {
				System.out.print(" ");
			}
			for(int M=1;M<=I*2-1;M++) {
				System.out.print(M);
			}
			System.out.println();
		}
		for(int L=1;L<=Num;L++) {
			for(int K=1;K<=L;K++) {
				System.out.print(" ");
			}
			for(int M=1;M<=Num*2-(L*2+1);M++) {
				System.out.print(M);
			}
			System.out.println();
		}

	}

}
