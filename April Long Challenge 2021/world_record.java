import java.util.Scanner;

public class Solution {
	
	public void solve(float k1, float k2, float k3, float v)
	{
		float mul = k1*k2*k3*v;
		//double roundOffMul = Math.round(mul * 100.0) / 100.0;
		float result = 100/mul;
		double resultRoundOff = Math.round(result * 100.0) / 100.0;
		
		
		
		if(resultRoundOff<9.58)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		float k1,k2,k3,v;
		while(T-- > 0)
		{
			k1=s.nextFloat();
			k2=s.nextFloat();
			k3=s.nextFloat();
			v=s.nextFloat();
			
			Solution s1=new Solution();
			s1.solve(k1,k2,k3,v);
		}
	}

}
