package Person_Address;

public class Person {
    private String name;
    private int age;
    Address address;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public Person(String name, int age, Address address){
        setName(name);
        setAge(age);
        this.address=address;
    }

    public void printInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Address: "+address.getFullAddress());
    }
}
