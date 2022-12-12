package OOBasics

object OOBasics extends App{

  val person=new Person("Amal",24)
  print(person)
  person.greet("Aleph")




}

class Person(name: String , age:Int){//Constructor

  //method
  def greet(name:String):Unit=print(s"${this.name} says: Hello $name")
}

class writer{
  
}