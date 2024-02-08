package program;

class Super_parent {
	
	public void getdata() {
		System.out.println("HELLO GAT DATA");
	}
}

public class Super_keyword extends Super_parent {

	public void getdata() {
		System.out.println("HELLO DATA");
		super.getdata();
	}
	public static void main(String[] args) {
		/*Super_keyword ob = new Super_keyword();
		ob.getdata();*/
		//Super_parent ob = new Super_keyword();
		Super_parent ob = new Super_keyword();
		ob.getdata();
	}
}
