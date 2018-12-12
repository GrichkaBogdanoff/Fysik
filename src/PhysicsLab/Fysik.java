package PhysicsLab;

public class Fysik {
	static double G = 9.82;
	static double R = 8.3144598;
	static double p_0 = 101325;
	static double c = 299792458;
	static double g_swe = 9.82;
/**
 * G�r om Fahrenheit till Celcius
 * 	
 * @param fahrenheit 
 * @return 
 */	
	
public static double fahrenheitToCelsius(double fahrenheit){
	return (fahrenheit -32) /1.8;
}
/**
 *  G�r om Kelvin till Celsius 
 * 
 * @param kelvin
 * @return
 */

public static double kelvinToCelsius(double kelvin){
	return kelvin + -273.15;
}
/**
 * 
 * R�knar ut trycket p� en v�tska vid ett djup
 * 
 * @param fluid = Vilken v�dska
 * @param depth = Vilket djup det m�ts
 * @return
 */

public static double fluidPressure(FluidTable fluid, double depth){
	return fluid.density * G * depth;	
}
/**
 * 
 * R�knar ut trycket under vatten vid ett djup
 * 
 * @param depth = Vilket djup trycket br�knas
 * @return
 */

public static double pressureUnderWater(double depth){
	
	return FluidTable.H2O.density * G * depth;
}
/**
 * R�knar ut kinetiskt energi p� ett objekt
 * 
 * 
 * @param mass = Massan p� objektet
 * @param velocity = Hastigheten p� objektet
 * @return
 */

public static double kineticEnergy(double mass, double velocity){
	return (mass * (velocity * velocity)  / 2);
}
/**
 * R�knar ut den potentiella energin p� ett objekt
 * 
 * @param mass = Massan p� objektet
 * @param height = H�jden p� obektet 
 * @return
 */

public static double potentialEnergy(double mass, double height){
	return mass * G * height;	
}
/**
 * R�knar ut hastigheten p� ett fallande objekt
 * 
 * @param height = H�jden objektet f�ll fr�n
 * @return
 */
public static double fallSpeed(double height){
	return Math.sqrt(2*G*height);
}
/**
 * R�knar ut skillnaden p� tv� nummer
 * 
 * @param first = F�rsta nummeret
 * @param last = Andra nummeret
 * @return
 */

public static double delta(double first, double last){
	return last - first;
}
/**
 * G�r om v�tskas volym till massa 
 * 
 * @param fluid = Vilket v�tska
 * @param volume = Vilken Volym
 * @return
 */

public static double volumeToMass(FluidTable fluid, double volume){
	return fluid.density * volume;
}

/**
 * G�r om gas volym till massa
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
 * G�r om solid volym till massa
 * 
 * @param solid
 * @param volume
 * @return
 */

public static double volumeToMass(SolidTable solid, double volume){
	return solid.density * volume;
}
/**
 * R�knar ut hastigheten med hj�p av svt metoden
 * 
 * @param distance
 * @param time
 * @return
 */

public static double svtVelocity(double distance, double time){
	return distance / time;
}
/**
 * R�knar ut str�ckan med hj�p av svt metoden
 * 
 * @param velocity
 * @param time
 * @return
 */

public static double svtDistance(double velocity, double time){
	return velocity * time;
}
/**
 * R�knar ut tid med hj�p av svt metoden
 * 
 * @param distance
 * @param velocity
 * @return
 */

public static double svtTime(double distance, double velocity){
	return distance / velocity;
}

/**
 * R�knar ut arbete p� ett objekt
 * 
 * @param mass = massan p� objektet
 * @param acceleration = accelartionen p� objektet
 * @return
 */

public static double work(double mass, double acceleration){
	return mass * acceleration;
}
/**
 * R�knar ut kraften p� ett obkjekt
 * 
 * @param work = objektets arbete
 * @param time = tiden
 * @return
 */

public static double power(double work, double time){
	return work / time;
}

/**
 * G�r om hastighet till h�jd
 * 
 * @param velocity = hastigeten 
 * @return
 */

public static double velocityToHeight(double velocity){
	return velocity * velocity / (2 * G);
}
/**
 * R�knar ut v�rmen p� ett solid
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
 * R�knar ut v�rmen p� en v�tska
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
 * R�knar ut v�rmen p� en gas
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