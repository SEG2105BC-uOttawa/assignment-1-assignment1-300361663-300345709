import design2.*;
import design3.*;
import design5.*;
import java.time.Duration;
import java.time.Instant;

public class part1Test {

	public static void main(String[] args) {

		// initiate random integer for timer
		int myRandInt = (int) (Math.random() * 10000 + 100);

		
		
		// clock the time taken for design 1 coordinate conversion
		Instant startDesign1 = Instant.now();
		for (int i = 0; i < myRandInt; i++) {
			PointCP point = new PointCP('C', 2.5, 2.4);
			point.convertStorageToCartesian();
			 //System.out.println("\nAfter asking to store as Cartesian:\n" + point);
			point.convertStorageToPolar();
			// System.out.println("\nAfter asking to store as Polar:\n" + point);
		}
		Instant FinishDesign1 = Instant.now();
		long timeElapsedDesign1 = Duration.between(startDesign1, FinishDesign1).toMillis();
		System.out.print("time tooked to excute " + myRandInt + " times of design1: " + timeElapsedDesign1
				+ " millis seconds\n");

		
		
		// clock the time taken for design 5 coordinate conversion
		Instant startDesign5 = Instant.now();
		for (int i = 0; i < myRandInt; i++) {
			PointCP5 cp = new PointCP3(2.5, 2.4);//new c
			PointCP5 cp2 = cp.convertStorageToPolar();// return new cp2/P
			PointCP5 cp3 = cp.convertStorageToCartesian();//return cp3/C
			
			 //System.out.println("\nAfter asking to store as Cartesian:\n" + cp3);
			 //System.out.println("\nAfter asking to store as Polar:\n" + cp2);
		}
		Instant FinishDesign5 = Instant.now();
		long timeElapsedDesign5 = Duration.between(startDesign5, FinishDesign5).toMillis();
		System.out.print("time tooked to excute " + myRandInt + " times of design5: " + timeElapsedDesign5
				+ " millis seconds\n");

	}

}
