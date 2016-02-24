package dcll.emar;

/**
 * Created by Neness on 17/02/2016.
 */
public class Item {
    /**
     *
     */
    private int val;

    /**
     *
     */
    public Item(){
        this(0);
    }

    /**
     *
     * @param val
     */
    public Item(int val){
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public int oppose(){
        return -1 * val;
    }

    public boolean estNegatif(){
        return val < 0;
    }
}
