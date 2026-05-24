import java.util.ArrayList;
import java.util.Random;

public class InjuryEventTask implements Runnable{

    private ArrayList<Player> playerList;

    public InjuryEventTask(ArrayList<Player> playerList){
        this.playerList = playerList;
    }

    @Override
    public void run(){

        Random random = new Random();

        while(true){

            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println("부상 스레드 오류");
            }

            if(playerList.isEmpty()){
                continue;
            }

            int playerIndex = random.nextInt(playerList.size());

            Player player = playerList.get(playerIndex);

            int injuryChance = random.nextInt(100);
            if (injuryChance < 10) {
                player.setInjured(true);
                System.out.println(player.getName() + " 선수가 부상 당했습니다.");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("복귀 스레드 오류");
                }
                player.setInjured(false);
                System.out.println(player.getName() + " 선수가 복귀했습니다.");
            }
        }
    }
}
