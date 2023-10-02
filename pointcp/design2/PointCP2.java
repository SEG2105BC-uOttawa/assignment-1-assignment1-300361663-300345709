package design2;

import design3.PointCP3;
import design5.PointCP5;

//represent Polar.
public class PointCP2 extends PointCP5 {

	public PointCP2(double Rho, double Theta) {
		super(Rho, Theta);
	}
	// Instance methods **************************************************

	// computed on demand, but not stored
	@Override
	public double getX() {
		return (Math.cos(Math.toRadians(super.yOrTheta)) * super.xOrRho);
	}

	@Override
	// computed on demand, but not stored
	public double getY() {
		return (Math.sin(Math.toRadians(super.yOrTheta)) * super.xOrRho);
	}

	@Override
	// simply return
	public double getRho() {
		return super.xOrRho;
	}

	@Override
	// simply return
	public double getTheta() {
		return super.yOrTheta;
	}

	/**
	 * Converts Cartesian coordinates to Polar coordinates.
	 */
	@Override
	public PointCP5 convertStorageToPolar() {
		// Calculate RHO and THETA
		double xOrRho = getRho();
		double yOrTheta = getTheta();
		// convert to Polar and assign the values to instance of Polar.
		PointCP5 cp2 = new PointCP2(xOrRho, yOrTheta);
		return cp2;
	}

	/**
	 * Converts Polar coordinates to Cartesian coordinates.
	 */
	@Override
	public PointCP5 convertStorageToCartesian() {
		// Calculate X and Y
		double xOrRho = getX();
		double yOrTheta = getY();
		// convert to Cartesian and assign the values to instance of Cartesian
		PointCP5 cp3 = new PointCP3(xOrRho, yOrTheta);
		return cp3;
	}

	/**
	 * Calculates the distance in between two points using the Pythagorean theorem
	 * (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	@Override
	public double getDistance(PointCP3 pointB) {
		// Obtain differences in X and Y, sign is not important as these values
		// will be squared later.
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	 * Rotates the specified point by the specified number of degrees. Not required
	 * until E2.30
	 *
	 * @param point    The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	@Override
	public PointCP3 rotatePoint(double rotation) {
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();

		return new PointCP3((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
				(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}

	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	@Override
	public String toString() {
		return "Stored as Polar [" + getRho() + "," + getTheta() + "]" + "\n";
	}

}
