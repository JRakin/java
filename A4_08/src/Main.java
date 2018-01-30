import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int[] ar=new int[Num];
		
		for(int I=0;I<Num;I++) {
			ar[I]=scan.nextInt();
		}
		scan.close();
		for(int K=0;K<Num;K+=2) {
			System.out.print(ar[K]+" ");
		}
		for(int M=1;M<Num;M+=2) {
			System.out.print(ar[M]+" ");
		}

	}

}
