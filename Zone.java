import java.util.*;

public class Zone {
	int zoneId;
	String animalCategory;
	int limitOfCages;
	boolean hasPark;
	boolean hasCanteen;
	List<Cage> listOfCages;
	
	Zone(int zoneId,String category,int limitOfCages,boolean hasPark,boolean hasCanteen){
		this.zoneId = zoneId;
		animalCategory = category;
		this.limitOfCages = limitOfCages;
		this.hasPark = hasPark;
		this.hasCanteen = hasCanteen;
		listOfCages = new ArrayList<Cage>();
	}
	
	public int addCage(Cage newCage){
		if(listOfCages.size() >= limitOfCages)
			return -1;
		
		listOfCages.add(newCage);
		return 1;
	}
}
