/*
Interfaces

You love all animals, and have a dog and a cat as pets.
The program you are given defines an abstract class Animal, and has Dog & Cat classes inherited from it.
Implement the Swimmer and Player interface and override their methods swim() and play(), so that the given method calls output the following messages:
swim():
Dog => "Dog is swimming"
Cat => "Cat is swimming"
play():
Dog => "Dog is playing"
Cat => "Cat is playing"
*/

class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();

   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal implements Swimmer, Player{
   public void swim(){
      System.out.println("Animal is swimming");
   }
   public void play(){
      System.out.println("Animal is playing");
   }
}


class Dog extends Animal {
    //Override the swim() and the play() methods
     public void swim(){
      System.out.println("Dog is swimming");
   }
   public void play(){
      System.out.println("Dog is playing");
   }
}

class Cat extends Animal {
    //Override the swim() and the play() methods
   public void swim(){
      System.out.println("Cat is swimming");
   }
   public void play(){
      System.out.println("Cat is playing");
   }
}
