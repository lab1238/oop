import java.util.Scanner;
class Arrayreverse{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t;
    System.out.println("Enter the size of array:");
    int size=scan.nextInt();
    int[] array=new int[size];
    System.out.println("Enter the elements of array:");
    for (int i=0;i<array.length ;i++ ) {
      array[i]=scan.nextInt();
    }
    for(int i=0;i<=(array.length)/2;i++){
      t=array[size-1-i];
      array[size-1-i]=array[i];
      array[i]=t;
    }
    System.out.println("Elements after reversing:");
    for (int i=0;i<array.length ;i++ ) {
      System.out.println(array[i]);
    }
  }
}
