class Animal{
    public void move(){
       System.out.println("animal can move");
    }
 }
  
 class Dog extends Animal{
    public void move(){
       System.out.println("dog can move");
    }
    public void bark(){
       System.out.println("the dog can woof");
    }
 }
  
 public class july_21_1 {
    public static void main(String args[]){
        Animal a = new Animal(); 
        Dog b = new Dog();
        a.move();
        b.move();
        b.bark();
    }
 }