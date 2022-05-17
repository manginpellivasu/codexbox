package Oops;

         class Dog extends Animal{
             String colour;
             int weight;

             Dog(String colour,int weight){
                 this.colour=colour;
                 this.weight=weight;
             }

             @Override
             void colour() {
                 System.out.println("animal colour : black");
             }

             @Override
             void weight() {
                 System.out.println("animal weight : 20kg");

             }
         }
