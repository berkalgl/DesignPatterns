package p_5_behavioral_patterns.p_20_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {

        List<User> ls = new ArrayList<>();
        ls.add(new User());
        ls.add(new User());
        ls.add(new User());

        for (User user:ls)
            System.out.println(user);
        System.out.println("----------------------");

        //Removes to element which has been used.
        Iterator<User> userIterator = ls.listIterator();
        while(userIterator.hasNext()){
            User item = userIterator.next();
            System.out.println(item);
        }
    }

}
