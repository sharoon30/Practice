package finalMock;

public class CombiOfBlocks {
	int a;
	CombiOfBlocks(){
		System.out.println("First constructor");
	}

	{
		System.out.println("IIB-1");
	}

	{
		System.out.println(this.a);
		System.out.println("IIB-2");
	}

	CombiOfBlocks(int num){
		a =  num;
	}

	public static void main(String args[]){
		CombiOfBlocks c1 = new CombiOfBlocks();
		CombiOfBlocks c2 = new CombiOfBlocks(10);
	}
	
}
