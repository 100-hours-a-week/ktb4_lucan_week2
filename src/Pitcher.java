public class Pitcher extends Player{
    double era;

    Pitcher(String name, int age, int backNum, String position,
            double era){
        super(name, age, backNum, position);
        this.era = era;
    }
    void showInfo(){
        System.out.println(position + " " + name + " " + age + "세 등번호: " +
                backNum + " 평균자책점: " + era);
    }
}
