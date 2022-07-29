
public class OverLoadingFinal {
	final void Addition(int a,int b)
	   {
		   System.out.println("sum of two number:-"+(a+b));
	   }
	   final void Addition (float z,float y)
	   {
		   System.out.println("sum of two flaot number:-"+(z+y));
	   }
	public static void main(String[] args) {
		 OverLoadingFinal s=new  OverLoadingFinal();
		 s.Addition(45, 50);
		 s.Addition(2.5f, 3.0f);

	}

}
