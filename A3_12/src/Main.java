import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int[] ar=new int[Num];
		int temp=0;
		
		for(int I=0;I<Num;I++) {
			ar[I]=scan.nextInt();
		}
		for(int K=0;K<Num;K++) {
			for(int M=1;M<Num;M++) {
				if(ar[M-1]<ar[M]) {
					temp=ar[M-1];
					ar[M-1]=ar[M];
					ar[M]=temp;
				}
			}
		}
		scan.close();
		System.out.println("After sorting:");
		for(int L=0;L<Num;L++) {
			System.out.print(ar[L]+"\t");
		}

	}

}
