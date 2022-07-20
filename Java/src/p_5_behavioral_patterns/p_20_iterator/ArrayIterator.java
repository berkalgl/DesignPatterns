package p_5_behavioral_patterns.p_20_iterator;


public class ArrayIterator implements IIterator {
    private Player[] players;
    private int position;

    public Player[] getPlayers() {
        return players;
    }

    public ArrayIterator(Player[] players) {
        setPlayers( players );
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPossition() {
        return position;
    }

    public void setPossition(int possition) {
        this.position = possition;
    }

    @Override
    public boolean hasNext() {
        if ( position >= getPlayers().length || getPlayers()[position] == null )
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Player player = getPlayers()[position];
        position++;
        return player;
    }
}
