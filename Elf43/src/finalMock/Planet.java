package finalMock;

public class Planet {
	String name;
	String surface_gas;
	int moons;
	boolean rings;
	Planet(String name , String surface_gas,int moons,boolean rings){
		this.name=name;
		this.surface_gas=surface_gas;
		this.moons=moons;
		this.rings=rings;
	}
	public static void main(String[] args) {
		Planet mer=new Planet("Mercury",null,0,false);
		Planet ven=new Planet("Venus","Carbon_di_oxide Nitrogen",0,false);
		Planet ear=new Planet("Earth","Nitrogen Oxygen",1,true);
	}
}
