package utils;

import java.time.LocalDate;
import java.util.List;

import core.Brand;
import core.PetsToy;
import core.Species;

public class PopulatedToys {
	public static List<PetsToy> populateList(List<PetsToy> lists){
		
		lists.add(new PetsToy("Abc" ,Brand.FOODIE, Species.CAT ,"steel" , 6 , 100.00, LocalDate.parse("2020-10-02")));
		lists.add(new PetsToy("bcd" ,Brand.FUTUREKART, Species.DOG ,"aloy" , 5 , 500.00, LocalDate.parse("2021-05-01")));
		lists.add(new PetsToy("BatMan" ,Brand.PUPPIES, Species.RABBIT ,"aluminuim" , 3 , 670.00, LocalDate.parse("2023-09-03")));
		lists.add(new PetsToy("IronMan" ,Brand.PUPPIES, Species.CAT ,"steel" , 6 , 157.00, LocalDate.parse("2019-10-02")));
		lists.add(new PetsToy("tom" ,Brand.FOODIE, Species.RABBIT ,"copper" , 4 , 234.00, LocalDate.parse("2015-10-02")));
		lists.add(new PetsToy("jerry" ,Brand.FUTUREKART, Species.DOG ,"tin" , 2 , 1000.00, LocalDate.parse("2023-10-02")));
		
		return lists;
		
	}
}
