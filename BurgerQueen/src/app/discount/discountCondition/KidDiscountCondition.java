package app.discount.discountCondition;

import app.discount.DiscountPolicy;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;

import java.util.Scanner;

public class KidDiscountCondition implements DiscountCondition {
    private boolean isSatisfied;
    private DiscountPolicy discountPolicy;

    public KidDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }

    public void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이가 어떻게 되십니까?");
        int input = Integer.parseInt(scanner.nextLine());

        setSatisfied(input < 20);
    }

    public int applyDiscount(int price)
    {
        return discountPolicy.calculateDiscountedPrice(price);
    }
}
