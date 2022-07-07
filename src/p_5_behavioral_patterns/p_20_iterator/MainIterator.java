package p_5_behavioral_patterns.p_20_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {

        Tofas tofas = new Tofas();
        IIterator<Player> itTofas = tofas.getIterator();
        while (itTofas.hasNext() ) {
            Player player = itTofas.next();
            System.out.println( "Tofas : " + player.getName() + " " + player.getNo() );
        }


        Fenerbahce fenerbahce = new Fenerbahce();
        IIterator<Player> itFenerbahce = fenerbahce.getIterator();
        while (itFenerbahce.hasNext() ) {
            Player player =  itFenerbahce.next();
            System.out.println( "Fenerbahce : " + player.getName() + " " + player.getNo() );
        }
    }

}
