import java.util.Scanner;

public class TemperatureConverter
{
    public static double CelsToFah(double temp){
        double tempInFah = temp * 1.8 + 32;
        return tempInFah;
    }

    public static double FahToCels(double temp){
        double tempInCels = (temp - 32) * 0.556;
        return tempInCels;
    }
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);

		System.out.println("Temperature Converter");
		System.out.println("Enter either 1 or 0 to convert from celcius or fahrenheit with 1 being c->f and 0 being f->c:");

		int a = scnr.nextInt();

		System.out.println("Now enter the value that will be converted to f/c:");
		double temp = scnr.nextDouble();

		switch(a){
		    case 0:
		        System.out.println(FahToCels(temp));
		        break;
		    case 1:
		        System.out.println(CelsToFah(temp));
		        break;
		    default:
		        System.out.println("Please enter either c or f to convert a value.");
		        break;
		}




		}


	}
