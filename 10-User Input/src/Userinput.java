import java.util.Scanner;//import java.util.*

public class Userinput {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
//		System.out.println("Enter a byte value");
//		byte b1=scanner.nextByte();
//		
//		System.out.println("Enter a short value");
//		short s1=scanner.nextShort();
//		
//		System.out.println("Enter int value");
//		int i1=scanner.nextInt();
		
//		System.out.println("Enter a boolean value");
//		boolean bool=scanner.nextBoolean();
//		System.out.println(b1+"|"+s1+" |"+i1+"|"+bool);
//	scanner.nextLine();	
//	
//	System.out.println("Enter your name");
//	String str=scanner.nextLine();
//	System.out.println(str);
//	
//	scanner.close();
		int sum=0;
		int counter=1;
		while(counter<=10) {
		System.out.println("Enter number # "+ counter);
		boolean bool=scanner.hasNextInt();
		if(bool) {
		int i=scanner.nextInt();
		sum=sum+i;
		counter++;
	}else {
		System.out.println("Invalid number");
	}
		scanner.nextLine();

}
		System.out.println("your total is :" + sum);
		scanner.close();
	}
}
