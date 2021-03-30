package dkj;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan = new Scanner(System.in);
System.out.printf("Nhap vao n = "); int n= Scan.nextInt();
float S=0;
for (int i=1;i<n;i++) {
	S=(float) (S+(1/(2*n)));
}
System.out.printf("%f",S);
	}

}
