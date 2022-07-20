package p_5_behavioral_patterns.p_20_iterator;

import java.util.ArrayList;

public class ArrayListIterator implements IIterator{

    private ArrayList<Player> players;
    private int position;

    public ArrayListIterator(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        if(position >= getPlayers().size() || getPlayers().get(position) == null)
            return false;

        return true;
    }

    @Override
    public Object next() {
        Player player = getPlayers().get(position);
        position++;
        return player;
    }
}
