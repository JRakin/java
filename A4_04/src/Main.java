import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int [] ar=new int[Num];
		boolean isMatched=false;
		
		for(int I=0;I<Num;I++) {
			ar[I]=scan.nextInt();
		}
		for(int K=0;K<Num;K++) {
			System.out.print(ar[K]+" ");
		}
		System.out.println("\nEnter number to be searched:");
		int Search=scan.nextInt();
		scan.close();
		
		for(int M=0;M<Num;M++) {
			if(ar[M]==Search) {
				isMatched=true;
				break;
			}
		}
		if(isMatched) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
