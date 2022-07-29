

 








public class OverLoadingFinal {
   final void Addition(int a, int b)
   {
	   System.out.println("sum of number:-"+(a+b));
   }
   class Load extends OverLoadingFinal
   {
	   final void Addition(int a, int b)
	   {
		   System.out.println("sum of number:-"+(a+b));
		   
	   }
   }
	public static void main(String[] args) {
		Load s=new Load();
		s.Addition(0, 0);
	}

}
