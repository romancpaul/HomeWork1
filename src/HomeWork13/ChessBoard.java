package HomeWork13;

/*13.
  Given the position of a knight on a chess board
  (e.g column = 2, row = 4, print the list of possible squares that he can move to;
  for the above examples these would be (1, 6), (1, 2), (3, 6), (3, 2), (4, 3), (4, 5).
 */

public class ChessBoard {
    public static void main(String[] args) {
        int knightStartColumn =2 ;
        int knightStartRow = 4;

        boolean isStartColumnValid = (knightStartColumn >= 1) && (knightStartColumn <= 8);
        boolean isStartRowValid = (knightStartRow >= 1) && (knightStartRow <= 8);

        String result0 = (!isStartColumnValid) || (!isStartRowValid) ?
                "Position not valid." : "";
        System.out.print(result0);

        int knightMoveUp = knightStartColumn + 2;

        int moveUpRight = knightStartRow + 1;
        boolean isMoveUpRightValid = (knightMoveUp >= 1) && (knightMoveUp <= 8) &&
                                      (moveUpRight >=1) && (moveUpRight <=8);
        String result1 = ((isStartColumnValid && isStartRowValid) && isMoveUpRightValid) ?
                "(" +knightMoveUp+ ", " + moveUpRight+ "), " : "";
        System.out.print(result1);

        int moveUpLeft = knightStartRow -1;

        boolean isMoveUpLeftValid = (knightMoveUp >=1) && (knightMoveUp <=8) &&
                                    (moveUpLeft >=1) && (moveUpLeft <=8);
        String result2 = ((isStartColumnValid && isStartRowValid) && isMoveUpLeftValid)?
                "(" +knightMoveUp+ ", " +moveUpLeft+ "), " : "";
        System.out.print(result2);

        int  knightMoveUp2 = knightStartColumn + 1;
        int moveUpRight2 = knightStartRow +2;

        boolean isMoveRightUpValid2 = (knightMoveUp2 >=1) && (knightMoveUp <=8) &&
                (moveUpRight2 >=1) && (moveUpRight2 <=8);
        String result3 = ((isStartColumnValid && isStartRowValid) && isMoveRightUpValid2)?
                "(" +knightMoveUp2+ ", " +moveUpRight2+ "), ":"";
        System.out.print(result3);

        int moveUpLeft2 = knightStartRow -2;

        boolean isMoveUpLeftValid2 = (knightMoveUp2 >=1) && (knightMoveUp2 <=8) &&
                (moveUpLeft2 >=1) && (moveUpLeft2 <=8);
        String result4 = ((isStartColumnValid && isStartRowValid) && isMoveUpLeftValid2)?
                "(" + knightMoveUp2+ ", " +moveUpLeft2+ ") ,":"";
        System.out.print(result4);

        int knightMoveDown = knightStartColumn -1;
        int moveDownRight = knightStartRow +2;

        boolean isMoveDownRightValid = (knightMoveDown >=1) && (moveDownRight <=8) &&
                (moveDownRight >=1) &&(moveDownRight <=8);
        String result5 = ((isStartColumnValid && isStartRowValid) && isMoveDownRightValid) ?
                "(" +knightMoveDown+ ", "+moveDownRight+ ") ," : "";
        System.out.print(result5);

        int knightMoveDownLeft = knightStartRow -2;

        boolean isMoveDownLeftValid = (knightMoveDown >=1)&&(knightMoveDown <=8)&&
                (knightMoveDownLeft >=1) && (knightMoveDownLeft <=8);
        String result6 = ((isStartColumnValid && isStartRowValid) && isMoveDownLeftValid )?
                "(" +knightMoveDown+ ", "+knightMoveDownLeft+ ")":"";
        System.out.print(result6);

    }


}
