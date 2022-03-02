package awesomeCucumber.types;

import awesomeCucumber.objects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterTypess {
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }
}
