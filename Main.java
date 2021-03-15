import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Zone> zones = new ArrayList<>();
	static int animalId = 0;
	
	
	//takes animal Object and add the animal to its type of zone and it also
	//takes the scanner object as second argument
	public static void addAnimal(Scanner sc){
		Animal animal;
		String name , type ,category;
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter " + name + " Category");
		category = sc.next();
		System.out.println("Enter " + name + " Type");
		type = sc.next();
		animal = new AnimalSpecific(category,name,type);
		System.out.println("Enter "+animal.getAnimalName()+" sound");
		animal.setSound(sc.next());		
		System.out.println("Enter "+animal.getAnimalName()+" age");
		animal.setAge(sc.nextDouble());
		System.out.println("Enter "+animal.getAnimalName()+" weight");
		animal.setWeight(sc.nextDouble());
		animal.setId(animalId++);
		boolean success = false;
		for(Zone zone:zones){
			if(category==animal.getAnimalCategory()){
				success = zone.addAnimal(animal);	
			}
		}
		if(!success){
			Zone newZone = new Zone();
			newZone.setCategory(category);
			newZone.addAnimal(animal);
			zones.add(newZone);
		}
	}
	
	//display all the zones in the zoo
	public static void displayZoo(Scanner sc){
		if(zones.size()==0){
			System.out.println("\nZoo is empty\n");
			return;
		}
		for(Zone zone:zones){
			System.out.println("##########ZONE : "+zone.getCategory()+"###########");
			zone.dispayCages();
		}
		System.out.println("\n\n");
	}

	//takes animal Id as input and remove the animal from the zoo
	private static void removeAnimal(int deadId) {
		boolean success = false;
		for(Zone zone:zones){
			ArrayList<Cage> cages = zone.getCages();
			for(Cage cage:cages){
				ArrayList<Animal> animals = cage.getAnimals();
				for(Animal animal:animals){
					if(animal.getId()==deadId){
						success = animals.remove(animal);
						break;
					}
					
				}
				if(success){
					if(cage.getCurrentCap()==0){
						cages.remove(cage);
					}
					break;
				}
			}
			if(success){
				if(zone.getCages().size()==0){
					zones.remove(zone);
				}
				break;
			}
		}
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. Add Animal");
			System.out.println("2. Display Zoo");
			System.out.println("3. Delete Animal");
			System.out.println("4. Exit");
			int option = sc.nextInt();
			switch(option){
			case 1:
				addAnimal(sc);
				break;
			case 2:
				displayZoo(sc);
				break;
			case 3:
				System.out.println("Enter Dead Animal ID");
				int deadId = sc.nextInt();
				removeAnimal(deadId);
				break;
			case 4:
				return;

			default:
				return;
			}
		}
	}
}