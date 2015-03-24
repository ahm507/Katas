package org.secc;

public class Tennis {

    public static String score(int score1, int score2) {

        //Winning
        if((score1 == 4 && score2 == 1) || (score1 == 6 && score2 == 4)) {
            return "Game, player1";
        } else  if((score1 == 1 && score2 == 4) || (score1 == 4 && score2 == 6)) {
            return "Game, player2";
        }

        //Advantage
        if((score1 == 4 && score2 == 3) || (score1 == 5 && score2 == 4)) {
            return "Advantage, player1";
        } else if((score1 == 3 && score2 == 4) || (score1 == 4 && score2 == 5)) {
            return "Advantage, player2";
        }

        //Equality
         if(score1 == score2) {
            if(score1 == 1 || score1 == 2)
                return getName(score1) + " All";
            else if(score1 == 3 || score1 == 4)
                return "Deuce";
        }
        //Other
        return getName(score1) + " - " + getName(score2);

    }

    private static String getName(int score) {

        String name;
        switch(score) {
            case 0: name = "Love"; break;
            case 1: name = "Fifteen"; break;
            case 2: name = "Thirty"; break;
            case 3: name = "Forty"; break;

            default: name = ""; break;
        }
        return name;
    }

}
