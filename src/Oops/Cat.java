package Oops;

 class Cat extends Animal {

  String colour;
  int weight;

  Cat(String colour, int weight) {
   this.colour = colour;
   this.weight = weight;


  }

  @Override
  void colour() {
   System.out.println("animal colour :white");

  }

  @Override
  void weight() {
   System.out.println("animal weight:10kg");

  }
 }
