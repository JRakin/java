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
		scan.close();
		//sorting
		for(int K=0;K<Num;K++) {
			for(int M=1;M<Num;M++) {
				if(ar[M-1]<ar[M]) {
					temp=ar[M-1];
					ar[M-1]=ar[M];
					ar[M]=temp;
				}
			}
		}
		System.out.println("Printing only even number in reverse order:");
		for(int L=0;L<Num;L++) {
			if(ar[L]%2==0) {
				System.out.print(ar[L]+" ");
			}
		}

	}

}
