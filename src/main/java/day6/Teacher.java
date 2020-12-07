package day6;

import java.util.Random;
import day6.Student;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Student objectClass) {
        String value = "";
        int min = 2;
        int max = 5;
        int diff = max - min;
        Random rand = new Random();
        int randomNumber = rand.nextInt(diff+1)+min;
        switch (randomNumber) {
            case 2:
                value = "неудовлетворительно";
                break;
            case 3:
                value = "удовлетворительно";
                break;
            case 4:
                value = "хорошо";
                break;
            case 5:
                value = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем "
                            + Student.getName() + " по предмету " + discipline + " на оценку "
                            + value);
    }
}
