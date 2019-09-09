package com.cod3cat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ((age > 100) || (age < 0)) ? 0 : age;

    }

    public String getFullName(){
        if(getFirstName().isEmpty() && lastName.isEmpty()){
            return "";
        }else if(getFirstName().isEmpty()){
                return getLastName();
                }else if (getLastName().isEmpty()){
                    return getFirstName();
                }else{
            return getFirstName() + " " + getLastName();
        }

    }

    public boolean isTeen(){
        return (age > 12) && (age < 20) ? true : false;
    }
}
