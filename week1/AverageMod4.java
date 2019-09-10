//Accepts radius of a circle as its command line argument display the area
class AverageMod4{
  public static void main(String[] args) {
          if(args.length == 0)System.out.println("No argument");
          else{
            double r,a;
            r=Double.parseDouble(args[0]);
            a=Math.PI*r*r;
            System.out.println("Area:"+a);
          }
  }
}
