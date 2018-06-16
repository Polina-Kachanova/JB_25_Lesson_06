package by.epam.tr.start;

import java.util.Scanner;

public class Student {

    private String name;
    private String surname;
    private int mathMark;
    private int englishMark;
    private int literatureMark;
    private int geographyMark;
    private double averageMark;

    private static Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getLiteratureMark() {
        return literatureMark;
    }

    public void setLiteratureMark(int literatureMark) {
        this.literatureMark = literatureMark;
    }

    public int getGeographyMark() {
        return geographyMark;
    }

    public void setGeographyMark(int geographyMark) {
        this.geographyMark = geographyMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void enterStudentName () {
        System.out.println();
        System.out.print("Enter Student name: ");
        String temp = sc.nextLine();
        this.setName(temp);
    }

    public void enterStudentSurname () {
        System.out.print("Enter Student surname: ");
        String temp = sc.nextLine();
        this.setSurname(temp);
    }

    public void enterMathMark() {
        System.out.print("Enter Math mark: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter Math mark: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setMathMark(temp);
        } else {
            System.out.println("Incorrect mark! Try again.");
            enterMathMark();
        }
    }

    public void enterEnglishMark() {
        System.out.print("Enter English mark: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter English mark: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setEnglishMark(temp);
        } else {
            System.out.println("Incorrect mark! Try again.");
            enterEnglishMark();
        }
    }

    public void enterLiteratureMark() {
        System.out.print("Enter Literature mark: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter Literature mark: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setLiteratureMark(temp);
        } else {
            System.out.println("Incorrect mark! Try again.");
            enterLiteratureMark();
        }
    }

    public void enterGeographyMark() {
        System.out.print("Enter Geography mark: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter Geography mark: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setGeographyMark(temp);
        } else {
            System.out.println("Incorrect mark! Try again.");
            enterGeographyMark();
        }
    }

    public double calculateAverageMark() {
        double average = ((double)getMathMark() + (double)getEnglishMark() + (double)getLiteratureMark() + (double)getGeographyMark())/4;
        setAverageMark(average);
        return average;
    }

    public boolean isHignAchiever() {
        if(calculateAverageMark() >= 9) {
            return true;
        } else return false;
    }

    public boolean isLooser() {
        if (getMathMark() == 2 || getEnglishMark() == 2 || getLiteratureMark() == 2 || getGeographyMark() == 2) {
            return true;
        } else return false;
    }

    public void printStudent() {
        System.out.println();
        System.out.println("Student name: " + getName());
        System.out.println("Student surname: " + getSurname());
        System.out.println("Math mark: " + getMathMark());
        System.out.println("English mark: " + getEnglishMark());
        System.out.println("Literature mark: " + getLiteratureMark());
        System.out.println("Geography mark: " + getGeographyMark());
        System.out.println("Average mark: " + getAverageMark());
    }
}