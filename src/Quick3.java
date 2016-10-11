import java.util.*;
public class Quick3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		int result;
		 
		try{
			int input = sc1.nextInt();
			int input2 = sc2.nextInt();
			result= input/input2;
			if (input>=100||input2>=100) {
				throw new Exception();
			}
			System.out.println(result);
			
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나누어서는 안됩니다.");
		}
		catch(InputMismatchException e){
			System.out.println("정수를 입력하세요.");
		}
		catch (Exception e){
			System.out.println("100미만으로 입력하세요");
		}
	}

}
