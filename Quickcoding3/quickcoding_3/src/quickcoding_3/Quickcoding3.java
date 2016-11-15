package quickcoding_3;
import java.util.*;
public class Quickcoding3 {

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
			System.out.println("0으로 나눌수 없습니다.");
		}
		catch(InputMismatchException e){
			System.out.println("int형만 입력가능합니다");
		}
		catch (Exception e){
			System.out.println("100이상은 나눌수 없습니다.");
		}
	}

}
