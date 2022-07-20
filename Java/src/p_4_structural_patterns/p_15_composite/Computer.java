package p_4_structural_patterns.p_15_composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements IPart{

    private List<IPart> IPartList = new ArrayList<>();

    public List<IPart> getIPartList() {
        return IPartList;
    }

    public void setIPartList(List<IPart> IPartList) {
        this.IPartList = IPartList;
    }

    public void addPart( IPart IPart ) {
        getIPartList().add(IPart);
    }

    public void removePart( IPart IPart ) {
        if ( getIPartList().contains(IPart) ) {
            getIPartList().remove( IPart );
        }
    }

    public IPart getPart( int index ) {
        IPart IPart = null;
        try {
            IPart = getIPartList().get(index);
        }catch (Exception ex) {
            throw new NullPointerException("index not found");
        }
        return IPart;
    }

    @Override
    public String title() {
        return "Computer :" + this.hashCode();
    }

    @Override
    public int price() {
        int total = 0;
        for ( IPart item : getIPartList() ) {
            total += item.price();
        }
        return total;
    }
}
