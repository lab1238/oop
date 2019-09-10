import java.util.Scanner;
class test{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t;
    int size=scan.nextInt();
    int[] array=new int[size];
    for (int i=0;i<array.length ;i++ ) {
      array[i]=scan.nextInt();
    }
    for(int i=0;i<=(array.length)/2;i++){
      t=array[size-1-i];
      array[size-1-i]=array[i];
      array[i]=t;
    }
    for (int i=0;i<array.length ;i++ ) {
      System.out.println(array[i]);
    }
  }
}
