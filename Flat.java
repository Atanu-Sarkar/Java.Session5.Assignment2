package com.acadgild.session.five;

public class Flat extends Building{
	int balcony;
	int toilet;
	void attributesflat() {
	      // The subclass refers to the members of the superclass
	      System.out.println("Color of Flat : " + color);
	      System.out.println("Rooms in Flat : " + rooms);
	      System.out.println("Balcony in Flat : " + balcony);
	      System.out.println("No of toilet in Flat : " + toilet);
	   }
		public static void main(String args[]) {
			  Flat b1 = new Flat();
		      b1.color = "Blue";
		      b1.rooms = 3 ;
		      b1.balcony=3;
		      b1.toilet =2;
		      b1.attributesflat();
	}
}
