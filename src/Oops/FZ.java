package Oops;

 class FZ extends Bike {

  String colour;
  int CC;

  FZ(String colour, int CC) {
   this.colour = colour;
   this.CC = CC;

  }

  @Override
  void colour() {
   System.out.println("my bike colour=blue");
  }

  @Override
  void CC() {
   System.out.println("my bike CC=160");
  }
 }