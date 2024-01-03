package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import core.Brand;
import core.PetsToy;
import core.Species;
import toyException.ToyException;

public interface PetsToyOperations {
	static void addToy(List<PetsToy> lists , Scanner sc) throws IllegalArgumentException, InputMismatchException, ToyException {
		System.out.println("Enter Detaiils of toy ");
		System.out.println("Enter Toy Name");
		String name = sc.next();
		System.out.println("Enter Brand from below ");
		for(Brand b : Brand.values()) {
			System.out.println(b.name());
		}
		Brand validBrand = Brand.valueOf(sc.next().toUpperCase());
		System.out.println("Choose targetSpecies from below");
		for(Species s: Species.values()){
			System.out.println(s.name());
		}
		Species validSpecies = Species.valueOf(sc.next().toUpperCase());
		System.out.println("Choose any Material");
		String material = sc.next();
		System.out.println("Add Stock of toys ");
		Integer stock = sc.nextInt();
		System.out.println("Enter Price");
		Double price = sc.nextDouble();
		System.out.println("enter date");
		LocalDate validDate = LocalDate.parse(sc.next());
		lists.add(new PetsToy(name, validBrand, validSpecies, material, stock, price,validDate));
		System.out.println("Succesfully Added");
		

	}
	static void updateStock(List<PetsToy> lists, Scanner sc) throws ToyException,InputMismatchException,IllegalArgumentException {
		System.out.println("Enter toy name ");
		String name = sc.next();
		PetsToy temp = new PetsToy(name);
		if(lists.contains(temp)) {
			System.out.println("How many "+temp+" you want to buy? ");
			int i =lists.indexOf(temp);
			System.out.println("Enter Stock to be added ");
			
			lists.get(i).setStock(lists.get(i).getStock()+sc.nextInt());
		}else {
			throw new ToyException("Invalid Id");
		}
			
	}
	
static void discountOnToy(List<PetsToy> lists, Scanner sc) {
	System.out.println("Enter Toy name ");
	String name = sc.next();
	PetsToy temp = new PetsToy(name);
	if(lists.contains(temp)) {
		lists.stream().filter(p-> Period.between(p.getStockListingDate(), LocalDate.now()).getYears()>1).forEach(p->p.setPrice(p.getPrice()-p.getPrice()*(0.25)));
		System.out.println("Succesfull");
	}
	
}
static void removeToy(List<PetsToy> lists) {
	lists.removeIf(p->Period.between(p.getStockUpdateDate(), LocalDate.now()).toTotalMonths()>=(long)9);

}
static void displayAll(List<PetsToy> lists) {
	lists.stream().forEach(System.out::println);
}
}
