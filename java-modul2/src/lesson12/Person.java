package lesson12;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private Skills[] skills;
    private int countSkills;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        skills = new Skills[128];
        countSkills = 0;
    }

    public boolean addSkill(Skills skill) {
        if (countSkills < skills.length) {
            skills[countSkills] = skill;
            countSkills++;
            return true;
        }
        return false;
    }
    /*public void setSkills(Skills[] skills) {
        this.skills = skills;
        countSkills+=skills.length;
    }*/
}
