public class IT26102742Lab7Q2B{
	public static void main(String[] args){
		int count = 1;
		while(count<=5){
			int printCount= 1;
			System.out.print(count +" - ");
			while(count>=printCount){
				System.out.print("*");
				printCount +=1;
			}
			System.out.print("\n");
			count+=1;
		}
	}
}