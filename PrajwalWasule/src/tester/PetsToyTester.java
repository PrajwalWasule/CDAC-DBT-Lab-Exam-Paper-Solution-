package tester;

import java.util.ArrayList;
import static utils.PetsToyOperations.*;
import java.util.List;
import java.util.Scanner;

import core.PetsToy;
import utils.PetsToyOperations;
import static utils.PopulatedToys.*;

public class PetsToyTester implements PetsToyOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PetsToy> lists = new ArrayList<>();
		lists = populateList(lists);
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Enter choice: \n1)ADD new Toy \n2)Update stock of a toy\n"
						+ " 3)Set Discount of 25% for all the toys which are 1 year old \n"
						+ "4)Remove Toys which are never sold once listed in 9 months \n"
						+ "5)Display all toys\n 0)Exit"  );
			
			try {
				switch(sc.nextInt()) {
				case 1: addToy(lists, sc);
					break;
				case 2: updateStock(lists, sc);
					break;
				case 3: discountOnToy(lists, sc);
					break;
				case 4: removeToy(lists);
					break;
				case 5:displayAll(lists);
					break;
				case 0: System.out.println("Thank You!!!");
				        exit = true;
					break;
				}
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
