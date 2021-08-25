package First;
 
public class Abc{
	int x = 6;
	static int j =5;

	
	 
    public static void main(String args[])
    {
    	My m = new My() {
    		public void show() {
    			System.out.println("hello");
    		}
    	};
    	m.show();
    	
    }
}
interface My{
	default void show() {
		System.out.println("bye");
	}
}
