package ch11;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		int a = 10;
		int b = 0;
		int c = 0;
		int[] arr = {1,2,3};
		String name = null;
		
		try {
			c = a / b; // 예외 발생(프로그램 중지)
			// 예외 발생하지만 위에 코드가 먼저 잡혀서 실행X
			System.out.println(arr[3]); // 예외 발생
			System.out.println(name.length());
		
			System.out.println("실행문 마지막");
		} catch (ArithmeticException e) {
			System.out.println("예외 발생"); // 예외 발생 시 실행되는 블럭
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		} catch (Exception e) {// 모든 예외 잡아냄
			System.err.println("모든 예외 처리");
		}
		System.out.println(c);
		System.out.println("끝");

		}
//	public static int test() {
//		// 강제 예외 발생
//		int r = 0;
//		try {
//			throw new NullPointerException("어떤 예외 발생");			
//		} catch (SomeException e) {
//			r = 1;
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			r = 2;
//		}
//		return r;
//	}

}
class SomeException extends Exception {
	public SomeException() {
		
	}
	public SomeException (String msg) {
		super(msg);
	}
}

