import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int[] ar=new int[Num];
		
		for(int I=0;I<Num;I++) {
			ar[I]=scan.nextInt();
		}
		for(int K=Num-1;K>=0;K--) {
			System.out.print("\t"+ar[K]);
		}
		scan.close();
		
	}

}
