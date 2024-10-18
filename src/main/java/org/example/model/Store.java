package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Tablet", 350, "sweet", "White" ),
                new Coke("Bottle", 45, "cherry coke", true),
                new Bread("Baguette", 25, "French style", "Wheat")
        };

        Store store = new Store();
        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }

    }
}



//    //org.example.model.Store sınıfında main metodu içerisinde ProductForSale değeri alabilen bir
//    // dizi oluşturmalısınız.
//    //
//    //Bu dizinin içerisine Chocolate, Coke, Bread objelerinden birer adet eklemelisiniz.
//    //
//    //Bu diziyi listProducts metoduna parametre olarak geçiniz.
//    //
//    //Her bir showDetails metodu çağırıldığında çağırıldığı objeye göre mesaj döndüğünden emin olunuz.