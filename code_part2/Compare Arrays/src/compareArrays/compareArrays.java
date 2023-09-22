package compareArrays;

import java.util.*;

public class compareArrays {

	public static int[] culculateTime(char type, int size) {
		Random random = new Random();
		int[] timeElapsed = new int[2];
		long sum, start, endOfConstruction, finish, timeForConstruction, timeForIteration;

		if (type == 'a') {
			int[] a = new int[size];
			start = System.currentTimeMillis();
			for (int j = 0; j < size; j++) {
				a[j] = random.nextInt(10);
			}
			endOfConstruction = System.currentTimeMillis();
			timeForConstruction = endOfConstruction - start;

			sum = 0;
			for (int j = 0; j < size; j++) {
				sum += a[j];
			}
			finish = System.currentTimeMillis();
			timeForIteration = finish - endOfConstruction;
		} 
		
		else if (type == 'l') {
			ArrayList a = new ArrayList<>();
			start = System.currentTimeMillis();
			for (int j = 0; j < size; j++) {
				a.add(random.nextInt(10));
			}
			endOfConstruction = System.currentTimeMillis();
			timeForConstruction = endOfConstruction - start;

			sum = 0;
			Iterator<Integer> it = a.iterator();
			while (it.hasNext()) {
				sum += it.next().intValue();
			}
			finish = System.currentTimeMillis();
			timeForIteration = finish - endOfConstruction;
		} 
		
		else if (type == 'v') {
			Vector a = new Vector<>();
			start = System.currentTimeMillis();
			for (int j = 0; j < size; j++) {
				a.add(random.nextInt(10));
			}
			endOfConstruction = System.currentTimeMillis();
			timeForConstruction = (endOfConstruction - start);

			sum = 0;
			Iterator<Integer> it = a.iterator();
			while (it.hasNext()) {
				sum += it.next().intValue();
			}
			finish = System.currentTimeMillis();
			timeForIteration = finish - endOfConstruction;
		} 
		
		else throw new IllegalArgumentException("Please enter a valid type");

		timeElapsed[0] = (int) timeForConstruction;
		timeElapsed[1] = (int) timeForIteration;
		return timeElapsed;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int size = 150000000;
		int[] temp = new int[2];
		ArrayList<Integer> timeForConstruction = new ArrayList<>();
		ArrayList<Integer> timeForIteration = new ArrayList<>();
		
		System.out.println("Please choose a type of data structure, "
				+ "'a' for array, 'l' for ArrayList, 'v' for vector");
		char a = input.next().charAt(0);
		String s = new String();
		if(a == 'a') s = "array";
		else if(a == 'l') s = "ArrayList";
		else if(a == 'v') s = "vector";

		for (int i = 0; i < 20; i++) {
			temp = culculateTime(a, size);
			timeForConstruction.add(temp[0]);
			timeForIteration.add(temp[1]);
		}
		
		timeForConstruction.sort(Comparator.naturalOrder());
		timeForIteration.sort(Comparator.naturalOrder());
		System.out.println("Construction time of " + s + " is:");
		System.out.println("min: " + timeForConstruction.get(0) + "ms");
		System.out.println("median: " + timeForConstruction.get(10) + "ms");
		System.out.println("max: " + timeForConstruction.get(19) + "ms");
		System.out.println("Iteration time of " + s + " is:");
		System.out.println("min: " + timeForIteration.get(0) + "ms");
		System.out.println("median: " + timeForIteration.get(10) + "ms");
		System.out.println("max: " + timeForIteration.get(19) + "ms");
		
	}
}
