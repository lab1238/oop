import java.util.Scanner;
class Foreach{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size=scan.nextInt();
    int[] array=new int[size];
    System.out.println("Enter the elements of array:");
    for (int i=0;i<array.length ;i++ ) {
      array[i]=scan.nextInt();
    }
    System.out.println("Enter the search element:");
    int key=scan.nextInt();
    boolean flag=false;
    int p=0;
    for(int n : array){
      if(n==key){
          System.out.println("Element is present in the array at position "+p);
          flag=true;
          break;
      }
      p++;
    }
    if(!flag)System.out.println("Search unsuccessful");
  }
}
