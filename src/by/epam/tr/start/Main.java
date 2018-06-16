package by.epam.tr.start;

public class Main {

    public static void main(String[] args) {
        Group group = new Group();

        int numberOfStudents = group.enterNumberOfStudents();
        group.enterGroup(numberOfStudents);
        group.calculateAverageMarkForEachStudent();
        group.calculateAverageMarkByGroup();
        group.calculateNumberOfHighAchievers();
        group.calculateNumberOfLoosers();
        group.printGroup();
    }
}

