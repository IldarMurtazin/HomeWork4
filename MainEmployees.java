package HomeWork;

public class MainEmployees {µ


    private static void increaser(Employee[] emp, byte age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].changeSalary(increment);
            }
        }
    }


    private static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();

        return result / emp.length;
    }

    private static float averageAge(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();

        return result / emp.length;
    }

    public static void main(String[] args) {

        Employee employeeIvan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 80000, 1985);


        System.out.println("Please welcome our " + employeeIvan.getPosition() + ", " +
                employeeIvan.getName() + " " + employeeIvan.getSecondName() + " " + employeeIvan.getSurname() + ".");



        Employee[] employees = {
                employeeIvan,
                new Employee("Andrey", "Viktorovich",
                        "Bezrukov", "8(495)111-22-33",
                        "fitter", 52000, 1973),
                new Employee("Evgeniy", "Viktorovich",
                        "Del'finov", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new Employee("Natalia", "Pavlovna",
                        "Keks", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new Employee("Tatiana", "Sergeevna",
                        "Krasotkina", "8(495)444-55-66",
                        "accountant", 50000, 1983)
        };

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFullInfo());

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());

        increaser(employees, (byte) 45, 5000);

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());
        System.out.println("--------------------------------------------------------");

        System.out.println("Avg. age: " + averageAge(employees) + " years");
        System.out.println("Avg. salary: " + averageSalary(employees) + " RUR");
    }
}
