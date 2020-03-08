package les12.packAuto;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int num = (int)(Math.random()*40 +1);
		List<Auto> autos = new ArrayList<Auto>();
		
		int horsePower;
		int yearOfProduction;
		int numberOfCylinders;
		int diameter;
		int material;
		String[] materials = {"Skin", "Alcantara"};
		
		for (int i = 0; i < num; i++) {
			horsePower = (int)(Math.random()*300+50);
			yearOfProduction = (int)(Math.random() * 70 + 1950);
			numberOfCylinders = (int)(Math.random()*12+1);
			diameter = (int)(Math.random()*30+40);
			material = (int)(Math.random()*2);
			autos.add(new Auto(horsePower, yearOfProduction,
					new Engine(numberOfCylinders), new SteeringWheel(diameter, materials[material])));
			}
		Scanner in = new Scanner(System.in);
		String str;
		boolean flag = false;
		while (!flag) {
			System.out.println("Choose: ");
			System.out.println("a) - Output toString() data of aray elements to the console ");
			System.out.println("b) - For all objects of the given array set the same object of class Auto");
			System.out.println("c) - Exit");
			str = in.nextLine();
			switch (str) {
			case "A":
			case "a":
				System.out.println(autos);
				break;
			case "B":
			case "b":
				Auto[] arr = new Auto[autos.size()];
					Arrays.fill(arr, new Auto(86, 2007, new Engine(4),
							new SteeringWheel(50, "Skin")));
					autos = Arrays.asList(arr);
				break;
			case "C":
			case "c":
				flag = true;
				break;
			default:
				System.out.println("Incorrect  value of String(str)!");
			}
		}
	}

}
