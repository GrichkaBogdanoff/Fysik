package PhysicsLab;

public enum FluidTable{

	H2O(0.998, 4.19, 0, 100, 2260), 
	WATER(0.998, 4.19, 0, 100, 2260),
	H2SO4(1.84, 1.38, 10, 336, 511),
	glycol(1.113, 2.40, -16, 198, 841),
	metanol(0.791, 2.50, -98, 65, 1100);

	double density;
	double heatCapacity;
	double smeltPoint;
	double boilPoint;
	double steamEntalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se){
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}
}