class Product {
    String productName;
    double price;

    double calculateDiscount() {
        return 0;
    }
}

class Electronics extends Product {
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    double calculateDiscount() {
        return price * 0.20;
    }
}
