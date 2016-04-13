/*
 * MySimpleStack
 *
 *
 * 13/04/2016
 *
 * Copyright Ernesto MARKELINY
 */
package dcll.emar;

/**
 * calsse Item.
 */
public class Item {
    /**
     *
     */
    private Object value;

    /**
     * Constructeur sans parametre.
     */
    public Item() {
        this(new Object());
    }

    /**
     * constructeur avec parametre.
     * @param val un objet quelconque
     */
    public Item(final Object val) {
        this.setVal(val);
    }

    /**
     *
     * @param val un objet quelconque
     */
    public void setVal(final Object val) {
        this.value = val;
    }

    /**
     *
     * @return un objet contenu dans cet item
     */
    public Object getVal() {
        return this.value;
    }
}
