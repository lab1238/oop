class AverageMod1{
  public static void main(String[] args) {
          float Avg;
          int sum=0;
          if(args.length == 0)System.out.println("No argument");
          else{
            for (int i=0;i<args.length ;i++) {
              sum+=Integer.parseInt(args[i]);
            }
            Avg = (float)sum/args.length;
            System.out.println(Avg);
          }
  }
}
