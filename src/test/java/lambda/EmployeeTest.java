package lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class EmployeeTest {

    Employee[] employees;

    @Before
    public void steUp() {
        employees = new Employee[]{
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};
    }

    @Test
    public void testPrintList() {
        List<Employee> list = Arrays.asList(employees);
        //prints employee.toString();
        list.stream().forEach((Employee e) -> {System.out.print(e.getFirstName()); System.out.println();});
//        list.stream().forEach(System.out::println); //Object::function

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        IntStream.of(values)
                   .forEach(value -> System.out.printf("%d ", value));

    }

//    @Test
    public void testPrintEmployeeInSalaryRange() {
        List<Employee> list = Arrays.asList(employees);
        Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        System.out.println("");

        list.stream()
                .filter(e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000))
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);


        System.out.println("");

        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());

        System.out.printf("%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream().mapToDouble(Employee::getSalary).sum());



        System.out.printf("Average of Employees' salaries: %.2f%n",
                            list.stream()
                                    .mapToDouble(e -> e.getSalary())
                                    .average()
                                    .getAsDouble());

    }

}