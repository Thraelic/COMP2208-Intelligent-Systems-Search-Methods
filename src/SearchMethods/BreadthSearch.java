package SearchMethods;
import Game.BlocksWorld;
import java.util.Queue;
import java.util.LinkedList;

public final class BreadthSearch extends Search {

    @Override
    public String solveBlocksWorld(BlocksWorld b) {
        Queue<String> toExpand = new LinkedList<String>();
        toExpand.add("");

        while(toExpand.size() != 0) {
            String curNode = toExpand.remove();
            if(playGame(b, curNode)) {
                return curNode;
            } else {
                toExpand.addAll(getPossibleMoves(b,curNode));
            }
        }
        return null;
    }

}