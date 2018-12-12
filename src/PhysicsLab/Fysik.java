package PhysicsLab;

public class Fysik {
	static double G = 9.82;
	static double R = 8.3144598;
	static double p_0 = 101325;
	static double c = 299792458;
	static double g_swe = 9.82;
/**
 * Gör om Fahrenheit till Celcius
 * 	
 * @param fahrenheit 
 * @return 
 */	
	
public static double fahrenheitToCelsius(double fahrenheit){
	return (fahrenheit -32) /1.8;
}
/**
 *  Gör om Kelvin till Celsius 
 * 
 * @param kelvin
 * @return
 */

public static double kelvinToCelsius(double kelvin){
	return kelvin + -273.15;
}
/**
 * 
 * Räknar ut trycket på en vätska vid ett djup
 * 
 * @param fluid = Vilken vädska
 * @param depth = Vilket djup det mäts
 * @return
 */

public static double fluidPressure(FluidTable fluid, double depth){
	return fluid.density * G * depth;	
}
/**
 * 
 * Räknar ut trycket under vatten vid ett djup
 * 
 * @param depth = Vilket djup trycket bräknas
 * @return
 */

public static double pressureUnderWater(double depth){
	
	return FluidTable.H2O.density * G * depth;
}
/**
 * Räknar ut kinetiskt energi på ett objekt
 * 
 * 
 * @param mass = Massan på objektet
 * @param velocity = Hastigheten på objektet
 * @return
 */

public static double kineticEnergy(double mass, double velocity){
	return (mass * (velocity * velocity)  / 2);
}
/**
 * Räknar ut den potentiella energin på ett objekt
 * 
 * @param mass = Massan på objektet
 * @param height = Höjden på obektet 
 * @return
 */

public static double potentialEnergy(double mass, double height){
	return mass * G * height;	
}
/**
 * Räknar ut hastigheten på ett fallande objekt
 * 
 * @param height = Höjden objektet föll från
 * @return
 */
public static double fallSpeed(double height){
	return Math.sqrt(2*G*height);
}
/**
 * Räknar ut skillnaden på två nummer
 * 
 * @param first = Första nummeret
 * @param last = Andra nummeret
 * @return
 */

public static double delta(double first, double last){
	return last - first;
}
/**
 * Gör om vätskas volym till massa 
 * 
 * @param fluid = Vilket vätska
 * @param volume = Vilken Volym
 * @return
 */

public static double volumeToMass(FluidTable fluid, double volume){
	return fluid.density * volume;
}

/**
 * Gör om gas volym till massa
 * 
 * @param gas
 * @param volume
 * @return
 */

public static double volumeToMass(GasTable gas, double volume){
	return gas.density * volume;
}
/**
 * 
 * Gör om solid volym till massa
 * 
 * @param solid
 * @param volume
 * @return
 */

public static double volumeToMass(SolidTable solid, double volume){
	return solid.density * volume;
}
/**
 * Räknar ut hastigheten med hjäp av svt metoden
 * 
 * @param distance
 * @param time
 * @return
 */

public static double svtVelocity(double distance, double time){
	return distance / time;
}
/**
 * Räknar ut sträckan med hjäp av svt metoden
 * 
 * @param velocity
 * @param time
 * @return
 */

public static double svtDistance(double velocity, double time){
	return velocity * time;
}
/**
 * Räknar ut tid med hjäp av svt metoden
 * 
 * @param distance
 * @param velocity
 * @return
 */

public static double svtTime(double distance, double velocity){
	return distance / velocity;
}

/**
 * Räknar ut arbete på ett objekt
 * 
 * @param mass = massan på objektet
 * @param acceleration = accelartionen på objektet
 * @return
 */

public static double work(double mass, double acceleration){
	return mass * acceleration;
}
/**
 * Räknar ut kraften på ett obkjekt
 * 
 * @param work = objektets arbete
 * @param time = tiden
 * @return
 */

public static double power(double work, double time){
	return work / time;
}

/**
 * Gör om hastighet till höjd
 * 
 * @param velocity = hastigeten 
 * @return
 */

public static double velocityToHeight(double velocity){
	return velocity * velocity / (2 * G);
}
/**
 * Räknar ut värmen på ett solid
 * 
 * @param solid
 * @param mass
 * @param deltaT
 * @return
 */

public static double heat(SolidTable solid, double mass, double deltaT){

	return solid.heatCapacity * mass * (Math.abs(deltaT));
}
/**
 * Räknar ut värmen på en vätska
 * 
 * @param fluid
 * @param volume
 * @param deltaT
 * @return
 */

public static double heat(FluidTable fluid, double volume, double deltaT) {
	return fluid.heatCapacity * volume * fluid.density * (Math.abs(deltaT));
}
/**
 * Räknar ut värmen på en gas
 * 
 * @param gas
 * @param volume
 * @param deltaT
 * @return
 */
public static double heat(GasTable gas, double volume, double deltaT) {
	return gas.heatCapacity * volume * gas.density * (Math.abs(deltaT));
}
}