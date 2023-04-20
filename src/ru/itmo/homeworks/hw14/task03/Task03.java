package ru.itmo.homeworks.hw14.task03;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        // 1. Дописать класс Employee

        List<Employee> employeeList = Employee.employeeGenerator(20);
        Comparator<Employee> comparator01 = new NameComparator();
        Comparator<Employee> comparator02 = new NameComparator().thenComparing(new SalaryComparator());
        Comparator<Employee> comparator03 = new NameComparator()
                .thenComparing(new SalaryComparator())
                .thenComparing(new AgeComparator())
                .thenComparing(new CompanyComparator();)

        // 2. Отсортировать employeeList:
        // 2.1. по имени
        Collections.sort(employeeList, comparator01);

        // 2.2. по имени и зп
        Collections.sort(employeeList, comparator02);

        // 2.3. по имени, зп, возрасту, компании
        Collections.sort(employeeList, comparator03);

    }
}
    class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    }

    class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        }

    class AgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getAge() - o1.getAge());
        }
    }

    class CompanyComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getCompany().compareTo(o2.getCompany()));
        }
    }