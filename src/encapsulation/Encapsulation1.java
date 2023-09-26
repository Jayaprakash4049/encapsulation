package encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person x1 = new Person();
        x1.setName("Jayaprakash");
        x1.setAge(28);
  
        System.out.println("Name: " + x1.getName());
        System.out.println("Age: " + x1.getAge());
	}

}
class Person {
    private String name;
    private int age;
  
    public String getName() { return name; }
  
    public void setName(String name) { this.name = name; }
  
    public int getAge() { return age; }
  
    public void setAge(int age) { this.age = age; }
}