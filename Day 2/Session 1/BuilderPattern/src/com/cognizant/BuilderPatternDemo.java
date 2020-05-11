package com.cognizant;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		
		//Veg Meal Builder
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		//Scenario-1
		//Non Veg Meal Builder type-1
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("NonVeg Meal Type-1");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		//Scenario-2
		//Non Veg Meal Builder type-3
		Meal nonVegMeal2=mealBuilder.prepareNonVegMeal2();
		System.out.println("NonVeg Meal Type-2");
		nonVegMeal2.showItems();
		System.out.println("Total Cost: " + nonVegMeal2.getCost());
		
		

	}

}
