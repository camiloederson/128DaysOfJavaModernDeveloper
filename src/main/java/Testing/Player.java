package Testing;

public class Player {

    Dice dice;
    int numberToWin;

    public Player(Dice dice, int numberToWin) {
        this.dice = dice;
        this.numberToWin = numberToWin;
    }

    public boolean rollTheDice(){
        int number = dice.roll();
        return number >= numberToWin;
    }
}
