package PhysicsLab;

public class Uppgifter {
	
public static void main(String[] args) {
	
	//Uppgift1
	System.out.println("uppgift 1 = " + Fysik.volumeToMass(SolidTable.IRON,0.080) + "KG");

	//Uppgift2
	System.out.println("uppgift 2 = " + Fysik.svtDistance(2.8, 60 * 60));
	
	//Uppgift3
	System.out.println("uppgift 3 = "+ Fysik.heat(FluidTable.WATER, 0.005, 1));
	
	//Uppgift4
	System.out.println("uppgift 4 = " + Fysik.pressureUnderWater(100) + 101300);
	
	//Uppgift5
	System.out.println("uppgift 5 = " + Fysik.velocityToHeight(50/3.6) + "meter");
	
	//Uppgift6
	System.out.println("uppgift 6 = " + Fysik.power(Fysik.work(740, 100), 4.4));
	
	//Uppgift7
	double studs =0;
	for (double i = 10; i > 0.5;) {
		i = Fysik.velocityToHeight(Fysik.fallSpeed(i)) - (i/100);
				studs++;
	}
	//Uppgift8
	System.out.println("uppgift 8 = " + Fysik.fallSpeed(100) + "m/s");
}

}