package dkj;

import java.util.Scanner;

public class rf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc= new Scanner(System.in);
System.out.printf("Nhap vao so N = ");
int N = Sc.nextInt();
int S=0,i;
for (i=1;i<=N;i++)
  S=S+(10*i+i);
System.out.printf("\n%d",S);

	}

}
