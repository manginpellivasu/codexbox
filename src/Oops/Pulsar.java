package Oops;

class Pulsar extends Bike {
    String colour;
    int CC;

Pulsar(String colour,int CC){
    this.colour=colour;
    this.CC=CC;
}

    @Override
    void colour() {
        System.out.println("my bike colour=black");
    }

    @Override
    void CC() {
        System.out.println("my bike CC=150");

    }
}