package com.lqz.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 修改后的迪米特法则
 */
public class Demeter2 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院的员工类
class CollegeEmployee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager2 {
    public List<CollegeEmployee2> getAllEmployee() {
        List<CollegeEmployee2> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee2 emp = new CollegeEmployee2();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    //输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee2> list1 = getAllEmployee();
        System.out.println("----------分公司员工-------------");
        for (CollegeEmployee2 e : list1) {
            System.out.println(e.getId());
        }
    }
}

class SchoolManager2 {
    public List<Employee2> getAllEmployee() {
        List<Employee2> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee2 emp = new Employee2();
            emp.setId("学院总部员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息的一个方法
    void printAllEmployee2(CollegeManager2 sub) {

        sub.printEmployee(); //将打印放到类的内部进行

        List<Employee2> list2 = this.getAllEmployee();
        System.out.println("-----------总公司员工-------------");
        for (Employee2 e : list2) {
            System.out.println(e.getId());
        }
    }
}
