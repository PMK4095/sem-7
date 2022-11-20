import java.util.*;

public class Fibonacci1{
	static int fun(int n){
		if(n==1) return 0;
		else if(n==2) return 1;
		return fun(n-1)+fun(n-2);
	}
 	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n==1){
			System.out.println(0+" ");
		}else{
			System.out.print(0+" "+1+" ");
			int temp1 = 0;
			int temp2 = 1;
			for(int i = 2;i<n;i++){
				int cur = temp1+temp2;
				System.out.print(cur+" ");
				temp1 = temp2;
				temp2 = cur;
			}
		}
		System.out.println();
		for(int i = 1;i<=n;i++){
			System.out.print(fun(i)+" ");
		}
		
	}

}