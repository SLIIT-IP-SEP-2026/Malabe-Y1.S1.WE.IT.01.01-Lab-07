public class IT26102742Lab7Q2C{
	public static void main(String[] args){
		int count = 5;
		while(count>=1){
			int printCount= 1;
			while(count>=printCount){
				System.out.print(count);
				printCount +=1;
			}
			System.out.print("\n");
			count-=1;
		}
	}
}