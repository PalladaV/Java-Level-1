/**
 * Java 1. Home Work #5
 *
 * @author Yana
 * @version 23/02/2022
 */
 
public class HomeWork5 {
    public static void main(String[] args) {
        new HomeWork5().run();
    }
    
    public void run() {
        Employee[] empArray = new Employee[5];
	empArray[0] = new Employee("Petrov Ivan", "Manager", "petrov@mail.com", "89261110154",80000,30);
	empArray[1] = new Employee("Ivanov Petr", "Engineer", "ivanov@mail.com", "89262220253",85000,46);
	empArray[2] = new Employee("Sidorova Elena", "Accountant", "sidorova@mail.com", "89263330352",58000,34);
	empArray[3] = new Employee("Sorokina Ekaterina", "Secretary", "sorokina@mail.com", "89264440451",50000,25);
	empArray[4] = new Employee("Naumov Alexey", "Designer", "naumov@mail.com", "89265550550",60000,42);
        for (Employee employee : empArray) {
            if (employee.getAge()>40) {
    		System.out.println(employee);
            }
        }
    }
    
    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

	public Employee(String name, String position, String email, String phone, int salary, int age) {
	    this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
	} 
    
        public int getAge() {
	    return age;
        }
        
	@Override
	public String toString(){
	    return "name='" + name + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary=" + salary +
                    ", age=" + age;
	} 
    }     
}      
