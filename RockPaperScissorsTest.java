public class RockPaperScissorsTest {
    public static void main(String[]args){
        System.out.println("Rock paper Scissors test cases");

        paperBeatsRockTest();
        
    }

    public static void paperBeatsRockTest(){
        RockPaperScissors rps = new RockPaperScissors();
        Players player1 = Players.PAPER;
        Players player2 = Players.ROCK;
        Outcome result = rps.play(player1, player2);

        if(result.equals(Outcome.WIN)){
            System.out.println("paperBeatsRocktest: WIN");
        }
        else{
            System.out.println("paperBeatsRockTest: Failed");
        }
        

    }
}
