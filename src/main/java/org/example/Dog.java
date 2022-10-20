package org.example;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogName,String dogColor,int dogAge,String dogType){
        this.dogAge=dogAge;
        this.dogType=dogType;
        this.dogName=dogName;
        this.dogColor=dogColor;
    }
    public int getDogAge(){
        return dogAge;
    }
    public String getDogType(){
        return dogType;

    }
    public String getDogName(){
        return dogName;
    }
    public String getDogColor(){
        return dogColor;
    }
    public void setDogType(String dogType){
        this.dogName=dogName;
    }
    public void setDogName(String dogName){
        this.dogName=dogName;
    }
    public void setDogColor(String dogColor){
        this.dogColor=dogColor;
    }
    public void setDogAge(int dogAge){
        this.dogAge=dogAge;
    }
    @Override
    public String toString(){
        return "Dgo type"+dogType+"dog name"+dogName+"dog colors"+dogColor+"dogage"+dogAge;

    }

}
