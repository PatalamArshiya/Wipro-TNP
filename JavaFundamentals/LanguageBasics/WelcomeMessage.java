public class WelcomeMessage{
    public static void main(String[] args){
        if(args.length !=1){
            System.out.println("please provide one command line arguments");
            return;
        }
        System.out.println("Welcome " + args[0]);
    }
}