 
public class HelloWorld {

	public static void main(String[] args) {
      System.out.println("Helloworld!!"); 
      System.out.println(args.length);
      System.out.println(args[0] + args[1]);
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]); 
      System.out.println(a + b);
	}

}
