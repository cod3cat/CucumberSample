package awesomeCucumber.hooks;

import io.cucumber.java.BeforeAll;

/***
 * Ordered hooks are used when we have multiple before or after methods. When order is specified, hooks will be run in that order
 ***/

public class OrderedHooks {
    @BeforeAll(order = 0)
    public static void beforeOrder0(){
        System.out.println("From before order 0");
    }

    @BeforeAll(order = 1)
    public static void beforeOrder1() {
        System.out.println("From before order 1");
    }
}
