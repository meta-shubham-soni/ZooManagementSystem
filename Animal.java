
public abstract class Animal {
	protected String animalName;
	protected String animalCategory;
	protected String animalType;
	protected double weight;
	protected double age;
	protected int id;
	protected String name;
	protected String animalSound;
	
	///////getters///////
	abstract String getSound();  //return the sound of animal
	abstract String getAnimalName(); //return the name of the animal like lion,snake etc
	abstract String getAnimalCategory(); //return the category of the animal like mammal,reptile etc.
	abstract String getAnimalType(); //return the category of the animal like tiger,lion etc.
	abstract String getName(); //return the name of a animal like there will be a name of mighty Kumbha etc
	abstract int getId(); //return the id of the animal
	
	///////setters///////
	abstract void setName(String nameInp); //set the name of the animal ,will take string as arg.
	abstract void setAge(double age); //set the age of the animal ,will take double as argument
	abstract void setWeight(double weight); //set the weight of the animal , will take double value
	abstract void setId(int animalId); //set the id of a animal ,will take int argument
	abstract void setSound(String sound); // set sound of a animal , will take String argument
	
}