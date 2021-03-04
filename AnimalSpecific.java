
public class AnimalSpecific extends AnimalCategory {
	String animalSound;
	String intrestingFact;
	int animalAge;
	int animalWeight;
	AnimalSpecific(int id,String name,String category,int age,int weight,String sound,String intrestingFact){
		super(id,name,category);
		animalSound = sound;
		this.intrestingFact = intrestingFact;
		animalAge = age;
		animalWeight = weight;
	}
	
	String getSound(){
		return animalSound;
	}
	
}
