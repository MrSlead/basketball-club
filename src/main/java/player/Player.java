package player;

import org.apache.log4j.Logger;
import request.RequestJoin;

public class Player {
    private static final Logger logger = Logger.getLogger(RequestJoin.class.getSimpleName());

    private String firstName;
    private String secondName;
    private int age;
    private int experienceYear;

    public Player(String firstName, String secondName, int age, int experience) {
        logger.debug("start constructor Player");
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.experienceYear = experience;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public int getAge()
    {
        return age;
    }

    public int getExperience() {

        return experienceYear;
    }

    @Override
    public String toString() {
        return "Player [firstName=" + firstName + ", secondName=" + secondName + ", age="
                + age + ", experience=" + experienceYear + "]";
    }
}
