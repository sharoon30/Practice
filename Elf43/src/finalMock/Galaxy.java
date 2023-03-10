package finalMock;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Galaxy{
	static ArrayList a1=new ArrayList();
	
	String planet;
	String gas[];
	int moons;
	boolean rings;
	Galaxy(String planet,String gas[],int moons,boolean rings){
		this.planet=planet;
		this.gas=gas;
		this.moons=moons;
		this.rings=rings;
	}
	public String toString() {
		String G="";
		for(int i=0;i<this.gas.length;i++) {
			G=G+this.gas[i]+" ";
		}
		return this.planet+" "+G+" "+this.moons+" "+this.rings;
	}
	public static void main(String[] args) {
		String venus[]={"Carbon DiOxide","Nitrogen"};
		String Earth[]= {"Nitrogen","Oxygen"};
		String Jupitor[]= {"Hydrogen","helium"};
		String Saturn[]= {"Hydrogen","helium"};
		String Uranus[]= {"Hydrogen","Helium","Methane"}; 
		Galaxy g1 = new Galaxy("Mercury",args,0,false);
		Galaxy g2 = new Galaxy("Venus",venus,0,false);
		Galaxy g3 = new Galaxy("Earth",Earth,1,false);
		Galaxy g4 = new Galaxy("Jupitor",Jupitor,79,true);
		Galaxy g5 = new Galaxy("Saturn",Saturn,83,true);
		Galaxy g6 = new Galaxy("Uranus",Uranus,27,true);
		Galaxy garr[]= {g1,g2,g3,g4,g5,g6};
		for(Galaxy var : garr) {
			if(!var.moonCount(var).isEmpty())
			System.out.println(var.moonCount(var));
		}
		for(Galaxy var : garr) {
			System.out.println(var.gasRetrive(var));
		}
	}
	public LinkedHashMap<String,Integer> moonCount(Galaxy var) {
//CREATE A METHOD THAT RETRIEVE COUNT OF ALL THE PLANETS HAVING RINGS 		
		 LinkedHashMap l1 = new LinkedHashMap();
		if(this.rings==true) {//CONDITION TO CHECK THE RINGS 
			l1.put(this.planet, this.moons);
		}
		return l1;
	}
	public String gasRetrive(Galaxy g) {
//METHOD THAT RETRIEVES THE GAS FOUND IN THE PLANETS 		
		String gas="";
		for(int i=0;i<g.gas.length;i++) {
			gas+=g.gas[i]+" ";		
		}
		return gas.trim();
	}
}