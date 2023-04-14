
public class SCEReImp1 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		num1+=10;//0에서 시작하였고 8번 부터는 +10
		num2+=10;//0에서 시작하였고 9번 부터는 +10
		result = (num1<0) && (num2>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		num1+=10;//10에서 시작하였고 14번 부터는 +20
		num2+=10;//10에서 시작하였고 15번 부터는 +20
		result = (num1>0) || (num2>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
	}

}
