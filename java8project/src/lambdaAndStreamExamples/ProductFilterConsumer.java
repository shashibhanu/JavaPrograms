package lambdaAndStreamExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Product {
    private int productId;
    private String name;
    private String type;
    private String productGrade;

    public Product(int productId, String name, String type, String productGrade) {
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.productGrade = productGrade;
    }

    public String getName() {
        return name;
    }

    public String getProductGrade() {
        return productGrade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", productGrade='" + productGrade + '\'' +
                '}';
    }
}

public class ProductFilterConsumer {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "ProductA", "Type1", "premium"));
        productList.add(new Product(2, "ProductB*", "Type2", "premium"));
        productList.add(new Product(3, "ProductC*", "Type3", "standard"));
        productList.add(new Product(4, "ProductD", "Type4", "premium"));
        productList.add(new Product(5, "ProductE*", "Type5", "premium"));

        // Define a Consumer to process each filtered product
        Consumer<Product> productConsumer = product -> {
            // Check if the product name ends with "*"
            if (product.getName().endsWith("*") && "premium".equals(product.getProductGrade())) {
                // Perform some action on the filtered product
                System.out.println("Filtered Product: " + product.getName());
            }
        };

        // Apply the consumer to each product using forEach
        productList.forEach(productConsumer);
    }
}
