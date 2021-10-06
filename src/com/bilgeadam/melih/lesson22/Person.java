package com.bilgeadam.melih.lesson22;

public abstract class Person {
    protected Gender gender;
    protected int age;
    protected long identitiyNumber;
    protected PersonName name;
    protected Occupation occupation;

    public Person(long identitiyNumber, Gender gender, String firsName, String lastName){
        this.gender = gender;
        this.age =0;
        this.identitiyNumber = identitiyNumber;
        this.name = new PersonName(firsName, lastName);
        this.occupation = Occupation.NO_OCCUPATION;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public long getIdentitiyNumber() {
        return identitiyNumber;
    }

    public PersonName getName() {
        return name;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setPersonMiddleName (String middleName){
        this.getName().setMiddleName(middleName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", age=" + age +
                ", identitiyNumber=" + identitiyNumber +
                ", name=" + name +
                ", occupation=" + occupation +
                '}';
    }
}
