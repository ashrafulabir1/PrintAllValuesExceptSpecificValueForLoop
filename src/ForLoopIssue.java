/* print 0-9 except 2 and 4 using for loop */
public class ForLoopIssue {

	public static void main(String[] args) {
		forLoop();

	}
	static void forLoop() {
		for(int i= 0 ; i < 10; i++){
			 if(i==2 || i==4) {
			  continue;
			 }
			System.out.print("\n"+i);
		}
  }
}
