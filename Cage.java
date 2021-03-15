import java.util.ArrayList;

public class Cage {
	private final int MAX_CAP = 3;
	String type;
	private ArrayList<Animal> animals = new ArrayList<>();
	
	
	///////setters///////
	void setType(String animalType){
		type = animalType;
	}
	///////getters///////
	String getType(){
		return type;
		
	}
	int getCap(){
		return MAX_CAP;
	}
	
	int getCurrentCap(){
		return animals.size();
	}
	
	/**
	 * Function to get list of all animals
	 * @return
	 */
	ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	/**
	 * takes an animal as an argument and add to the cage
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		setType(animal.getAnimalType());
		animals.add(animal);
		
	}

	/**
	 * show all the animals present in the cage
	 */
	public void showAnimals() {
		System.out.println("ID\tName\tSound");
		for(Animal animal:animals){
			System.out.println(animal.getId()+"\t"+animal.getName()+"\t"+animal.getSound());
		}
		
	}
	

}