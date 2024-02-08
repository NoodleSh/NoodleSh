package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
//        Person student1 = new Student(1,"정보시스템공학과","홍길동",20,178.2,70.0);
//        Person student2 = new Student(2,"경영학과","김말똥",21,187.3,80.0);
//        Person student3 = new Student(4,"정보통신공학과","강개순",23,167.0,45.0);

        
        
        Person[] studentArray = new Student[3];

        studentArray[0] = new Student(1,"정보시스템공학과", "홍길동",20,178.2,70.0);
        studentArray[1] = new Student(2,"경영학과","김말똥",21,187.3,80.0);
        studentArray[2] = new Student(4,"정보통신공학과","강개순",23,167.0,45.0);

//        for(int i = 0; i < studentArray.length; i++){
//            System.out.println("학생정보: "+ studentArray[i].getInformation());
//        }//for-each로 수정할것

        for(Person student : studentArray){
            System.out.println("학생정보: "+ student.getInformation());
        }


        Scanner sc= new Scanner(System.in);

        Employee[] employeeArray = new Employee[10];

        String name;
        int age;
        double height;
        double weight;
        int paycheck;
        String department;

        char chk;





        int count=0;

        while(true){
            System.out.print("사원 이름: ");
            name = sc.next();

            System.out.print("사원 나이: ");
            age = sc.nextInt();


            System.out.print("사원 키: ");
            height = sc.nextDouble();


            System.out.print("사원 몸무게: ");
            weight = sc.nextDouble();


            System.out.print("사원 월급: ");
            paycheck = sc.nextInt();

            System.out.print("사원 부서: ");
            department = sc.next();

            employeeArray[count] = new Employee(age,height,name,weight,paycheck,department);

            System.out.print("계속 입력하시겠습니까?: ");
            chk= sc.next().charAt(0);

            if(chk == 'Y' || chk == 'y'){
                ++count;

            }else {
                System.out.println("입력을 중단합니다.");
                break;
            }

        }

        /*for(Employee emp : employeeArray){
            if(emp != null)
            System.out.println(emp.getInformation());
        }*/ // for-each

        
        
       /* for(int i= 0; i < employeeArray.length; i++){
            if(employeeArray[i] != null) {
                System.out.println(employeeArray[i].getInformation());
            }else{
                break;
            }
        }*/ // 일반 for문

    }
}
