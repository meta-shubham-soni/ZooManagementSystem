
public class AnimalSpecific extends AnimalCategory {

	//Constructor initializing the animalName
	AnimalSpecific(String category,String name,String type){
		super(category);
		animalName = name;
		animalType = type;
	}
	///////setters///////
	@Override
	void setId(int animalId) {
		id = animalId;
	}
		
	
	@Override
	void setName(String nameInp) {
		name = nameInp;
		
	}
	@Override
	void setAge(double inputAge){
		age = inputAge;
	}
	@Override
	void setWeight(double inputWeight){
		weight = inputWeight;
	}
	@Override
	void setSound(String sound){
		animalSound = sound;
	}
	
	///////setters///////
	@Override
	String getName(){
		return animalName;
	}
	@Override
	String getAnimalCategory(){
		return animalCategory;
	}
	@Override
	String getAnimalType(){
		return animalType;
	}
	@Override
	String getAnimalName() {
		return animalName;
	}
	@Override
	int getId() {
		return id;
	}
	@Override
	String getSound() {
		return "Roar";
	}
}