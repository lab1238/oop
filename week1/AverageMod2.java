class AverageMod2{
  public static void main(String[] args) {
          double Avg;
          double mul=1;
          if(args.length == 0)System.out.println("No argument");
          else{
            for (int i=0;i<args.length ;i++) {
              mul*=Double.parseDouble(args[i]);
            }
            System.out.println("Multiplication:"+mul);
          }
  }
}
