public class Student {
    private String name;
    private int age;
    private double grade;

    Student(String name, int age, double grade){
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGrade(double grade){
        if(grade>=0 && grade<=100){
            this.grade=grade;
        }
        else{
            throw new IllegalArgumentException("The grade is out of bonds");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }

    boolean isPassed(){
        if(grade>=60)
            return true;
        else
            return false;
    }

    double increaseGrade(double percent){
        grade*=percent/100+1;
        grade=Math.round(grade*100.0) /100.0;
//        System.out.printf("Grade after increase: %.2f%n", grade);
        return grade;
    }

    void printInfo(){
        System.out.println("\nStudent info");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Grade: "+getGrade()+"\n");
    }
}
