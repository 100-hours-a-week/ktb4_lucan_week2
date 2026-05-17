import java.util.Scanner;
import java.util.ArrayList;

void main(){
    Scanner sc = new Scanner(System.in);
    ArrayList<Batter> batterList = new ArrayList<>();
    ArrayList<Pitcher> pitcherList = new ArrayList<>();

    while(true) {
        System.out.println("======== 삼성 선발 엔트리 관리 ========");
        System.out.println("1. 선발 선수 등록");
        System.out.println("2. 선발 타자 조회");
        System.out.println("3. 투수 조회");
        System.out.println("4. 선수 삭제");
        System.out.println("0. 종료");

        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("======== 타자 입니까?(y/n) :     ========");

                String type = sc.next();

                if (type.equals("y")) {
                    System.out.print("이름 입력 : ");
                    String name = sc.next();
                    System.out.print("나이 입력 : ");
                    int age = sc.nextInt();
                    System.out.print("등번호 입력 : ");
                    int backNum = sc.nextInt();
                    System.out.print("포지션 입력 : ");
                    String position = sc.next();
                    System.out.print("타순 : ");
                    int batOrder = sc.nextInt();
                    System.out.print("타율 : ");
                    double avg = sc.nextDouble();

                    Batter batter = new Batter(name,age, backNum, position, avg, batOrder);
                    batterList.add(batter);
                } else if (type.equals("n")) {
                    System.out.println("투수 정보를 입력하시오.");
                    System.out.print("이름 입력 : ");
                    String name = sc.next();
                    System.out.print("나이 입력 : ");
                    int age = sc.nextInt();
                    System.out.print("등번호 입력 : ");
                    int backNum = sc.nextInt();
                    System.out.print("포지션 입력 : ");
                    String position = sc.next();
                    System.out.print("평균 자책점 : ");
                    double era = sc.nextDouble();

                    Pitcher pitcher = new Pitcher(name, age, backNum, position, era);
                    pitcherList.add(pitcher);
                } else {
                    System.out.println("다시 입력하세요.");
                }
                break;
            case 2:
                System.out.println("============== 선발 타자 조회 ==============");
                for( Batter batter : batterList){
                    batter.showInfo();
                }
                System.out.println("=========================================");
                break;
            case 3:
                System.out.println("============== 투수 조회 ==============");
                for( Pitcher pitcher : pitcherList){
                    pitcher.showInfo();
                }
                System.out.println("=====================================");
                break;
            case 4:
                System.out.println("============== 선수 삭제 ==============");
                System.out.println("타자를 삭제하시겠습니까? (y/n) ");
                String type1 = sc.next();
                if (type1.equals("y")){
                    System.out.println("삭제할 선수 이름 : ");
                    String name = sc.next();
                    for (int i = 0; i < batterList.size(); i++){

                    }

                }
                break;
            case 0:
                System.out.println("================ 종료 ================");
                return;
            default:
                System.out.println("번호를 다시 입력하세요.");
        }
    }
}
