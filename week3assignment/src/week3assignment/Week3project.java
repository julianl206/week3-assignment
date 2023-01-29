package week3assignment;

import java.util.Arrays;

public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] howOld = new int[9];
		howOld[0] = 3;
		howOld[1] = 9;
		howOld[2] = 23;
		howOld[3] = 64;
		howOld[4] = 2;
		howOld[5] = 8;
		howOld[6] = 28;
		howOld[7] = 93;
		howOld[8] = 21;
		
		int sum = 0, avg;
		for (int i = 0; i < howOld.length; i++) {
			sum += howOld[i];
		}
			avg = sum / howOld.length;

		
System.out.println("The remainder is " + (howOld[0] - howOld[8]));
		System.out.println("The average is "+ avg);
		
		
		String[] names = new String[6];
		
	names[0] = "Sam";
	names[1] = "Tommy";
	names[2] = "Tim";
	names[3] = "Sally";
	names[4] = "Buck";
	names[5] = "Bob";
			int average = 0;
	int total = 0;
			for (int i = 0; i < names.length; i++) {
				total += names[i].length();
		
			average = total / 6;
		
			}
			System.out.println("The average number of letters is "+ average);
			
			String newString = String.join(" ", names);
			System.out.println("The names in the array are: "+ newString);
			
			int[] namesLength = new int [6];
			
			for(int i = 0; i < names.length; i++) {
				namesLength[i] = names[i].length();
			}
			for (int i = 0; i < names.length; i++) {
			System.out.println(namesLength[i]);
			
			}
			int add = 0;
			for (int x = 0; x < namesLength.length; x++) {
			add += namesLength[x];
			}
			System.out.println("The sum of the array is "+ add);
			
			
			String word = "Moshpit";
			int howManyTimes = 6;
			String reapeat = "";
			for ( int i = 0; i < howManyTimes; i++) {
				reapeat += howManyTimes;
				System.out.print(word);			
		}	
			System.out.println(createStutter("punk" , 4));
			
			String firstName = "Julian";
			String lastName = "Luna";
			String fullName = createFullName(firstName, lastName);
			System.out.println(fullName);
			
			int[] numberOne = new int[4];
			
			numberOne[0] = 33;
		    numberOne[1] = 24;
		    numberOne[2] = 12;
		    numberOne[3] = 44;
		   
		    boolean result = sumGreaterThan100(numberOne);
	        System.out.println(result);
			
			double[] doubleAverage = new double[4];
			doubleAverage[0] = 4.25;
			doubleAverage[1] = 6.66;
			doubleAverage[2] = 8.89;
			doubleAverage[3] = 5.33;
			
		double ave = average(doubleAverage);
		System.out.println(result);
			
		double[] test1 = new double[3];
		test1[0] = 3.20;
		test1[1] = 5.02;
		test1[2] = 5.33;
		
		double[] test2 = new double [3];
		test2[0] = 6.33;
		test2[1] = 4.76;
		test2[2] = 2.56;
		
		boolean mean = compareArrayAverages(test1, test2);
		System.out.println(mean);
	
		boolean hot = true;
		double money = 12.0;
		boolean result3 = willBuyDrink(hot, money);
		System.out.println(result3); 
		
		double[] trackList = new double [5];
		
		trackList[0] = 3.10;
		trackList[1] = 1.59;
		trackList[2] = 5.30;
		trackList[3] = 2;
		trackList[4] = 3.06;
		
		goodAlbumLength(trackList);
		
		// I made the method goodAlbumLength.
		// this method would help check if an album or demo is at least 15 mins. long
		// I used the lengths of the songs on my bands new demo!
		
		
		
	}
	public static String createStutter(String x, int y) {	
	String result = "";
		
	for (int i = 0; i < y; i++) {
		result += x;
	}
return result;
	
	
	}
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	public static boolean sumGreaterThan100(int[] array) {
	    int sum = 0;
	    for (int num : array) {
	        sum += num;
	    }
	    return sum > 100;
	}


	public static double average(double[] array) {
	    double sum = 0;
	    for (double num : array) {
	        sum += num;
	    }
	    return sum / array.length;
	}

	public static boolean compareArrayAverages(double[] array1, double[] array2) {
		 double avg1 = 0, avg2 = 0;
		    for (double i : array1) {
		        avg1 += i;
		    }
		    for (double i : array2) {
		        avg2 += i;
		    }
		    avg1 = avg1 / array1.length;
		    avg2 = avg2 / array2.length;
		    return avg1 > avg2;
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}

	public static void goodAlbumLength(double[] tracks) {
	    double totalLength = 0;
	    for (double track : tracks) {
	        totalLength += track;
	    }
	    if (totalLength >= 15) {
	        System.out.println("The album is ready to record!");
	    } else {
	        System.out.println("This album could be longer.");
	    }
	}

	
	
	
	    
	}

	



