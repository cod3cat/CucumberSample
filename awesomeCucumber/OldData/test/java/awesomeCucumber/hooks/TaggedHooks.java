package awesomeCucumber.hooks;

import io.cucumber.java.Before;

/***
 * Tagged hooks are used to tag hooks to particular scenarios. If the tag of the scenario is same as the tag of the hook, then that
 * hook will be used for that particular scenario. If there are tagged and untagged hooks, both will be run. Tagged will only run for
 * the scenarios with same tag
***/
public class TaggedHooks {
    @Before ("@dummy")
    public static void beforeOrder0(){
        System.out.println("This is before for dummy scenario");
    }

    @Before("@scenario2")
    public static void beforeOrder1() {
        System.out.println("This is before for scenario2");
    }
}
