package basicJavaPrograms;
//program to find whether the given number is STRONG NUMBER or not
public class A2 {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		if(sum==temp) {
			System.out.println(temp);
		}
	}	
}