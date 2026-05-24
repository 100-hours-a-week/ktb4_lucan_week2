public class Batter extends Player{
    double avg;
    int batOrder;

    Batter(String name, int age, int backNum, String position,
           double avg, int batOrder){
        super(name, age, backNum, position);
        this.avg = avg;
        this.batOrder = batOrder;
    }
    @Override
    void showInfo(){
        System.out.println(batOrder + "번 타자 " + name + " " + age + "세 " +
                position + " 등번호: " + backNum + "번," + " 타율: " + avg + ", 컨디션: " + getCondition()
                + ", 출전상태: " + (isInjured() ? "출전 불가" : "출전 가능"));
    }
}
