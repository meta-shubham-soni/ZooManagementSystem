import java.util.*;

public class Cage {
	int cageId;
	int limitOfAnimals;
	List<AnimalSpecific> listOfAnimals;
	boolean isFull;
	
	Cage(int id,int limit){
		cageId = id;
		limitOfAnimals = limit;
		listOfAnimals = new ArrayList<AnimalSpecific>();
		isFull = false;
	}
}
