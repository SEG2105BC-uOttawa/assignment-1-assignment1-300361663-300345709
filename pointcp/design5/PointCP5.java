package design5;

import design3.PointCP3;

// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

public abstract class PointCP5 {
	// Instance variables ************************************************

	/**
	 * Contains the current value of X or RHO depending on the type of coordinates.
	 */
	protected double xOrRho;

	/**
	 * Contains the current value of Y or THETA value depending on the type of
	 * coordinates.
	 */
	protected double yOrTheta;

	// Constructors ******************************************************

	/**
	 * Constructs a coordinate object, with a type identifier.
	 */
	public PointCP5(double xOrRho, double yOrTheta) {
		this.xOrRho = xOrRho;
		this.yOrTheta = yOrTheta;
	}

	// Instance methods **************************************************

	public abstract double getX();

	public abstract double getY();

	public abstract double getRho();

	public abstract double getTheta();

	/**
	 * Converts Cartesian coordinates to Polar coordinates.
	 */
	public abstract PointCP5 convertStorageToPolar();

	/**
	 * Converts Polar coordinates to Cartesian coordinates.
	 */
	public abstract PointCP5 convertStorageToCartesian();

	/**
	 * Calculates the distance in between two points using the Pythagorean theorem
	 * (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public abstract double getDistance(PointCP3 pointB);

	/**
	 * Rotates the specified point by the specified number of degrees. Not required
	 * until E2.30
	 *
	 * @param point    The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	public abstract PointCP3 rotatePoint(double rotation);

	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	public abstract String toString();

}
