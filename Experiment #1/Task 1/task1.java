public class Main
{
	public static void main(String[] args) {
		double pi =(double) 4 / 1;
		boolean state = false;
		
		for (int i = 3; i <= 15; i+=2) {
          if (state == false) {
              pi -=(double) 4 / i;
          }else{
              pi +=(double) 4 / i;
          }
          
          state = !state;
        }
        
        System.out.println("Pi: " + pi);
	}
}
