package by.epam.tr.start;

import java.util.Scanner;

public class Group {

    private static int numberOfStudents;
    private static Student[] studentsArray;
    private static double averageMarkByGroup;
    private static int numberOfHighAchievers = 0;
    private static int numberOfLoosers = 0;
    private static Scanner sc = new Scanner(System.in);

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        Group.numberOfStudents = numberOfStudents;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        Group.studentsArray = studentsArray;
    }

    public double getAverageMarkByGroup() {
        return averageMarkByGroup;
    }

    public void setAverageMarkByGroup(double averageMarkByGroup) {
        Group.averageMarkByGroup = averageMarkByGroup;
    }

    public int getNumberOfHighAchievers() {
        return numberOfHighAchievers;
    }

    public void setNumberOfHighAchievers(int numberOfHighAchievers) {
        Group.numberOfHighAchievers = numberOfHighAchievers;
    }

    public int getNumberOfLoosers() {
        return numberOfLoosers;
    }

    public void setNumberOfLoosers(int numberOfLoosers) {
        Group.numberOfLoosers = numberOfLoosers;
    }

    public int enterNumberOfStudents() {
        System.out.print("Enter number of students: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter number of students: ");
        }
        numberOfStudents = sc.nextInt();
        return numberOfStudents;
    }


    public void enterGroup(int numberOfStudents) {
        Group.studentsArray = new Student[numberOfStudents];
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            Student student = new Student();
            student.enterStudentName();
            student.enterStudentSurname();
            student.enterMathMark();
            student.enterEnglishMark();
            student.enterLiteratureMark();
            student.enterGeographyMark();

            this.getStudentsArray()[i] = student;
        }
    }

    public void calculateAverageMarkForEachStudent() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].calculateAverageMark();
        }
    }

    public void calculateAverageMarkByGroup() {
        double temp = this.getAverageMarkByGroup();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            temp += this.getStudentsArray()[i].getMathMark();
            temp += this.getStudentsArray()[i].getEnglishMark();
            temp += this.getStudentsArray()[i].getLiteratureMark();
            temp += this.getStudentsArray()[i].getGeographyMark();

            this.setAverageMarkByGroup(temp);
        }
        this.setAverageMarkByGroup(this.getAverageMarkByGroup()/(this.getNumberOfStudents()*4));
    }

    public void calculateNumberOfHighAchievers() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isHignAchiever()) {
                this.setNumberOfHighAchievers(this.getNumberOfHighAchievers() + 1);
            }
        }
    }

    public void calculateNumberOfLoosers() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isLooser()) {
                this.setNumberOfLoosers(this.getNumberOfLoosers() + 1);
            }
        }
    }

    public void printGroup() {
        System.out.println();
        System.out.println("Number of Students: " + getNumberOfStudents());
        Student[] studentsArray = this.getStudentsArray();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].printStudent();
        }
        System.out.println();
        System.out.println("Average mark by group: " + getAverageMarkByGroup());
        System.out.println("Number of high achievers: " + getNumberOfHighAchievers());
        System.out.println("Number of loosers: " + getNumberOfLoosers());
    }
}