package fibnocci;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1, b=2, i=0 , c=0, total=0;
		
		for(i=0;i<4000000;i++) {
			c=a+b;
			if(c%2 == 0)
				total += c;
			a=b;
			b=c;
					
			
			//System.out.println("A= " + a + "B= " + b + "C= " + c);
			
		}
		
	System.out.println("total of added Even Numbers are = " + total);

	}

}
