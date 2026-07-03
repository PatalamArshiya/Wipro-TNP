public class SumOf2Numbers{
    public static void main(String[] args){
        if(args.length !=2){
            System.out.println("please provide two command line arguments");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
    }
}