     package com.company;

     public class Main{

      public static void main(String[] args) {
          Animal[] animal = {new Shark(),new Turtle(),new Eagle()};

          Shark[] sharks = new Shark[2];
          Turtle[] turtles = new Turtle[2];
          Eagle[] eagles = new Eagle[2];

         {
             for (Animal animals:animal) {



              if(animals instanceof Shark){
                 ((Shark) animals).attack();
                 System.out.println(animals.getClass().getName());
                 sharks[0]=(Shark)animals;
                 if(animals.getClass().getName()=="com.company.Shark"){
                     ((Shark) animals).attack();
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 }

                  if(animals instanceof Turtle){
                      ((Turtle) animals).swim();
                      turtles[0]=(Turtle) animals;
                      System.out.println(animals.getClass().getName());
                      if(animals.getClass().getName()=="com.company.Turtle"){
                          ((Turtle) animals).swim();
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                      }

                  }
                  if(animals instanceof Eagle) {
                      ((Eagle) animals).fly();
                      eagles[0] = (Eagle) animals;
                      System.out.println(animals.getClass().getName());
                      if (animals.getClass().getName() == "com.company.Eagle") {
                          ((Eagle) animals).fly();
                      }


                  }}}}}}