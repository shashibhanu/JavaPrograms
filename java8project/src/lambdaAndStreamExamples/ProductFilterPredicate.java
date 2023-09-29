package lambdaAndStreamExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class ProductFilterPredicate {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "ProductA", "Type1", "premium"));
        productList.add(new Product(2, "ProductB*", "Type2", "premium"));
        productList.add(new Product(3, "ProductC*", "Type3", "standard"));
        productList.add(new Product(4, "ProductD", "Type4", "premium"));
        productList.add(new Product(5, "ProductE*", "Type5", "premium"));

        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.getName().endsWith("*") && "premium".equals(product.getProductGrade()))
                .collect(Collectors.toList());

        filteredProducts.forEach(System.out::println);
    }
}
