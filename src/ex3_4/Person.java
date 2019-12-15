package ex3_4;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString (){
        return name + " " + age ;
    }

    public Boolean addPerson (Person[] people){
        for (int i = 0; i < people.length; i++){
            if (people[i] == null){
                people[i] = this;
                return true;
            }
        }
        return false;

    }

    @Override
    public int compareTo(Person person) {
        int nameDiff = this.name.compareTo(person.name);
        if (nameDiff != 0){
            return nameDiff;
        }
        return this.age - person.age;
    }
}
