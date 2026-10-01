package JavaCollections.list.EmployeeManagement;

import java.util.*;

public class EmployeeDriver {
    public static List<Employee> groupByDept(List<Employee> al, String dept) {
        if (al != null && dept != null && al.size() > 0) {
            List<Employee> byDept = new ArrayList<>();

            for (Employee employee : al) {
                if (employee.department.equals(dept)) {
                    byDept.add(employee);
                }
            }

            return byDept;
        }

        return null;
    }

    public static void highestSalaryOfEachDept(List<Employee> al, List<String> depts) {
        for (String dept : depts) {
            List<Employee> byDept = groupByDept(al, dept);

            double maxSal = 0;
            int index = 0;

            for (int i = 0; i < byDept.size(); i++) {
                if (byDept.get(i).salary > maxSal) {
                    maxSal = byDept.get(i).salary;
                    index = i;
                }
            }

            System.out.println(dept + " -> " + byDept.get(index));
        }
    }

    public static void aeverageSalaryOfAllDept(List<Employee> al, List<String> depts) {
        for (String dept : depts) {
            List<Employee> byDept = groupByDept(al, dept);

            double sumOfSal = 0;
            for (Employee employee : byDept) {
                sumOfSal += employee.salary;
            }

            System.out.println(dept + " -> " + sumOfSal / byDept.size());
        }
    }

    public static String deptWithHightestAeverageSalary(List<Employee> al, List<String> depts) {
        List<Double> avgSals = new ArrayList<>();
        int index = 0;

        for (String dept : depts) {
            List<Employee> byDept = groupByDept(al, dept);

            double sumSal = 0;
            for (Employee employee : byDept) {
                sumSal += employee.salary;
            }

            avgSals.add(sumSal / byDept.size());

            double maxAvgSal = 0;
            for (int i = 0; i < avgSals.size(); i++) {
                if (avgSals.get(i) > maxAvgSal) {
                    maxAvgSal = avgSals.get(i);
                    index = i;
                }
            }
        }

        return depts.get(index);
    }

    public static void removeLowAvgSalEmployee(List<Employee> al) {
        double sumSal = 0;

        for (Employee employee : al) {
            sumSal += employee.salary;
        }

        double avgSal = sumSal / al.size();

        Iterator<Employee> itr = al.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.salary < avgSal) {
                itr.remove();
            }
        }

        System.out.println(al);
    }

    public static void sortAllInDescendingOrder(List<Employee> al) {
        Comparator<Employee> c1 = (o1, o2) -> o1.salary > o2.salary ? -1 : (o1.salary == o2.salary ? 0 : 1);

        Collections.sort(al, c1);
    }

    public static void main(String[] args) {
        List<Employee> al = new ArrayList<>();

        al.add(new Employee(101, "Kunal", 75000, "IT"));
        al.add(new Employee(102, "Rahul", 65000, "HR"));
        al.add(new Employee(103, "Priya", 82000, "Finance"));
        al.add(new Employee(104, "Amit", 55000, "IT"));
        al.add(new Employee(105, "Sneha", 72000, "Marketing"));
        al.add(new Employee(106, "Rohan", 68000, "Sales"));
        al.add(new Employee(107, "Neha", 90000, "IT"));
        al.add(new Employee(108, "Vishal", 58000, "HR"));
        al.add(new Employee(109, "Pooja", 77000, "Finance"));
        al.add(new Employee(110, "Akash", 62000, "Sales"));

        al.add(new Employee(111, "Anjali", 85000, "IT"));
        al.add(new Employee(112, "Saurabh", 71000, "Marketing"));
        al.add(new Employee(113, "Snehal", 60000, "HR"));
        al.add(new Employee(114, "Aditya", 95000, "Finance"));
        al.add(new Employee(115, "Megha", 67000, "Sales"));
        al.add(new Employee(116, "Nikhil", 73000, "IT"));
        al.add(new Employee(117, "Isha", 88000, "Marketing"));
        al.add(new Employee(118, "Harsh", 59000, "HR"));
        al.add(new Employee(119, "Tanvi", 79000, "Finance"));
        al.add(new Employee(120, "Yash", 69000, "Sales"));

        for (Employee employee : al) {
            System.out.println(employee);
        }

        List<String> depts = Arrays.asList("IT", "HR", "Finance", "Sales", "Marketing");

        System.out.println("\n");

        System.out.println("GROUP BY DEPARTMENT ->");
        System.out.println(groupByDept(al, "IT"));

        System.out.println("\n");

        System.out.println("HIGHEST SALARY OF EACH DEPARTMENT ->");
        highestSalaryOfEachDept(al, depts);

        System.out.println("\n");

        System.out.println("AEVERAGE SALARY OF ALL DEPARTMENT ->");
        aeverageSalaryOfAllDept(al, depts);

        System.out.println("\n");

        System.out.println("DEPARTMENT WITH HIGHEST AEVERAGE SALARY ->");
        System.out.println(deptWithHightestAeverageSalary(al, depts));

        System.out.println("\n");

        System.out.println("REMOVE EMPLOYEE WHOSE SALARY IS LESS THAN AEVERAGE SALARY ->");
        removeLowAvgSalEmployee(al);

        System.out.println("\n");
        System.out.println("SORT IN DESCENDING ORDER ACCORDING TO SALARIES ->");
        sortAllInDescendingOrder(al);
        System.out.println(al);
    }
}
