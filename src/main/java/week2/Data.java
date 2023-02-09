package week2;


import java.util.ArrayList;

public class Data implements IData {
    private class Person {
        String cpr;
        String name;
        double height;
        double weight;

        public Person(String cpr, String name, double height, double weight) {
            this.cpr = cpr;
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    private ArrayList<Person> persons;

    public Data() {
        persons = new ArrayList<Person>();
        // Add people
        persons.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
        persons.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
        persons.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
    }

    //Return the name of the person
    public String getName(String cpr) {
        for (int in = 0; in < persons.size(); in++)
            if (persons.get(in).cpr.equals(cpr))
                return persons.get(in).name;
        return null;
    }

    //Return the person's weight
    public double getWeight(String cpr) {
        for (int in = 0; in < persons.size(); in++)
            if (persons.get(in).cpr.equals(cpr))
                return persons.get(in).weight;
        return -1.0;
    }

    //Return the person's height
    public double getHeight(String cpr) {
        for (int in = 0; in < persons.size(); in++)
            if (persons.get(in).cpr.equals(cpr))
                return persons.get(in).height;
        return -1.0;
    }
}

