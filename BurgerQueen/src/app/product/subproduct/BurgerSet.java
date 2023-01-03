package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {


    public BurgerSet( String name, int price, int kcal, Hamburger hamburger, Side side, Drink drink) {
        super( name, price, kcal);
        this.hamburger = hamburger;
        this.side = side;
        this.drink = drink;
    }
    public BurgerSet(BurgerSet burgerSet) {
        super(burgerSet.getName(), burgerSet.getPrice(), burgerSet.getKcal());
        this.hamburger = new Hamburger(burgerSet.hamburger);
        this.side = new Side(burgerSet.side);
        this.drink = new Drink(burgerSet.drink);
    }
    private Hamburger hamburger;
    private Side side;
    private Drink drink;



    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
