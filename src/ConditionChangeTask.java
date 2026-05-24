import java.util.ArrayList;
import java.util.Random;

public class ConditionChangeTask implements Runnable{
    private ArrayList<Player> playerList;

    public ConditionChangeTask(ArrayList<Player> playerList){
        this.playerList = playerList;
    }
    @Override
    public void run() {

        String[] condition = {"좋음", "보통", "나쁨"};

        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("스레드 오류 발생");
            }

            if (playerList.isEmpty()) {
                continue;
            }

            int playerIndex = random.nextInt(playerList.size());
            Player player = playerList.get(playerIndex);

            int conditionIndex = random.nextInt(condition.length);

            player.setCondition(condition[conditionIndex]);

            //System.out.println(player.getName() + "의 컨디션 " + player.getCondition() + "으로 변경");

        }
    }
}
