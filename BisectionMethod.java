import java.util.*;

public class BisectionMethod {
	public static float calcPoly(float x0, int[] ans, int d)
	{
		float res = 0;
		for (int i = 0; i < ans.length; i++)
		{
			res += Math.pow(x0, d) * ans[i];
			d--;
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degree: ");
		int d = sc.nextInt();

		int[] c = new int[d + 1];

		for (int i = 0; i < c.length; i++)
		{
			System.out.print("Enter coefficient value: ");
			c[i] = sc.nextInt();
		}

		float ans1 = 0;
		float ans2 = 0;
		float x0 = 0;
		float x1, x2;
		float pX0 = 0.0f;
		System.out.print("Enter values to be substituted (x1 x2): ");
		x1 = sc.nextFloat();
		x2 = sc.nextFloat();

		ans1 = calcPoly(x1, c, d);
		ans2 = calcPoly(x2, c, d);

		while (ans1 * ans2 > 0)
		{
			System.out.println("Re-enter the new values");
			System.out.print("Enter values to be substituted (x1 x2): ");
			x1 = sc.nextFloat();
			x2 = sc.nextFloat();
			ans1 = calcPoly(x1, c, d);
			ans2 = calcPoly(x2, c, d);
		}

		System.out.println("x1 \t x2 \t x0 \t px0");
		while (Math.abs(x1 - x2) >= 0.0005)
		{
			x0 = (x1 + x2) / 2;
			pX0 = calcPoly(x0, c, d);
			System.out.printf("%.2f \t %.2f \t %.2f \t %.2f\n", x1, x2, x0, pX0); // Formatting output to 2 decimal
																					// places
			if (pX0 < 0)
			{
				x2 = x0;
			}
			else
			{
				x1 = x0;
			}
		}
		System.out.println("The root of polynomial: " + String.format("%.4f", x0)); // Printing root with 2 decimal
		
		sc.close();
	}
}
