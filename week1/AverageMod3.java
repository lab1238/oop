class AverageMod3{
  public static void main(String[] args) {
          if(args.length == 0)System.out.println("No argument");
          else{
            if(Integer.parseInt(args[0])%2==0)
              System.out.println("The no is even");
            else
              System.out.println("The no is odd");
          }
  }
}
