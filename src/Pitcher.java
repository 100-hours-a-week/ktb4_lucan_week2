public class Pitcher extends Player{
    double era;

    Pitcher(String name, int age, int backNum, String position,
            double era){
        super(name, age, backNum, position);
        this.era = era;
    }
    @Override
    void showInfo(){
        System.out.println(position + " " + name + " " + age + "세 등번호: " +
                backNum + "번 평균자책점: " + era + ", 컨디션: " + getCondition()
                + ", 출전상태: " + (isInjured() ? "출전 불가" : "출전 가능"));
    }
}
