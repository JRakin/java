import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num1=scan.nextInt();
		int Num2=scan.nextInt();
		scan.close();
		
		for(int I=1;I<=Num1;I++) {
			for(int K=1;K<=Num2;K++) {
				System.out.print(K);
			}
			System.out.println();
		}

	}

}
