public class Person {
    String name;
    int age;
    private String condition = "보통";
    private boolean injured = false;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCondition(){
        return condition;
    }

    public boolean isInjured(){
        return injured;
    }

    public void setCondition(String condition){
        this.condition = condition;
    }

    public void setInjured(boolean injured){
        this.injured = injured;
    }

}
