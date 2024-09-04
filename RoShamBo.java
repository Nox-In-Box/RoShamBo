
public class RoShamBo {
    public static void main(String[]args){
        rockBeatsScissorsTest();
        paperBeatsRockTest();
        scissorsBeatsPaperTest();
    }

    public static void rockBeatsScissorsTest() {
        Players one = Players.ROCK;
        Players two = Players.SCISSORS;

        System.out.println("rockBeatsScissorsTest: Failed.");
    }

    public static void paperBeatsRockTest() {
        Players one = Players.PAPER;
        Players two = Players.ROCK;

        System.out.println("paperBeatsRockTest: Failed");
    }

    public static void scissorsBeatsPaperTest() {
        Players one = Players.SCISSORS;
        Players two = Players.PAPER;
        System.out.println("scissorsBeatsPaperTest: Failed");
    }
}
