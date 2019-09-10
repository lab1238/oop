import java.util.Scanner;
public class Sales
{
  public static void main(String[] args)
  {
    final int SALESPEOPLE;
    float average;
    int max=0;
    int min=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter no of Sales people:");
    SALESPEOPLE = scan.nextInt();
    int[] sales = new int[SALESPEOPLE];
    int sum;
    for (int i=0; i<sales.length; i++)
    {
      System.out.print("Enter sales for salesperson"+(i+1)+":");
      sales[i] = scan.nextInt();
      if(i==0)min=sales[0];
      if(max<sales[i])max=sales[i];
      if(min>sales[i])min=sales[i];

    }
    System.out.println("\nSalesperson Sales");
    System.out.println("--------------------");
    sum = 0;
    for (int i=0; i<sales.length; i++)
    {
      System.out.println(" " + (i+1) + " " + sales[i]);
      if(sales[i]==max)System.out.println("Salesperson "+(i+1)+" had a highest sale of $"+sales[i]);
      if(sales[i]==min)System.out.println("Salesperson "+(i+1)+" had a lowest sale of $"+sales[i]);
      sum += sales[i];
    }
    average=(float)sum/SALESPEOPLE;
    System.out.println("\nTotal sales: " + sum);
    System.out.println("\nAverage sales: " + average);
    System.out.println("Enter a value:");
    int c = scan.nextInt();
    int count=0;
    for (int i=0; i<sales.length; i++)
    {
      if(sales[i]>c){
        count++;
      System.out.println(" " + (i+1) + " " + sales[i]);
      }

    }
    System.out.println("No of salesperson exeeding the value:"+count);
  }
}
