package PhysicsLab;

public enum GasTable {
	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
	helium(0.18, 5.1),
	metan(0.72, 2.21);

	double density;
	double heatCapacity;

	GasTable(double d, double hc){
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}
}
