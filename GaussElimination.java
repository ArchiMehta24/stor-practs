import java.util.Scanner;

public class GaussElimination
{
	public static void main(String[] args)
	{
		double[][] x = new double[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coefficients:");
		for (int i = 0; i < 3; i++)
		{
			System.out.println("Equation " + (i + 1) + ":");
			for (int j = 0; j < 4; j++)
			{
				System.out.print("Enter coefficient for x" + (j + 1) + ": ");
				x[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < 3; i++)
		{
			double div = x[i][i];
			for (int j = 0; j < 4; j++)
			{
				x[i][j] /= div;
			}

			for (int k = 0; k < 3; k++)
			{
				if (k != i)
				{
					double fact = x[k][i];
					for (int j = 0; j < 4; j++)
					{
						x[k][j] -= fact * x[i][j];
					}
				}
			}
		}

		System.out.println("Solution:");
		for (int i = 0; i < 3; i++)
		{
			System.out.println("x" + (i + 1) + " = " + Math.round(x[i][3]));
		}
	}
}

