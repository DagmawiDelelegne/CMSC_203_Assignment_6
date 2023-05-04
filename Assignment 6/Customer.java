package bevShop;

public class Customer {
String name = " ";
int age = 0;
Customer(String name, int age){
	this.name = name;
	this.age = age;
}
//copy constructor
public Customer(Customer other) {
    this.name = other.name;
    this.age = other.age;
}

// getters and setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

// toString method
@Override
public String toString() {
    return "Customer [name=" + name + ", age=" + age + "]";
}
}
