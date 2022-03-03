package awesomeCucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @Before
    public static void before() {
        System.out.println("I'm from Before hook");
    }

    @After
    public static void after() {
        System.out.println("I'm from After hook");
    }
}
