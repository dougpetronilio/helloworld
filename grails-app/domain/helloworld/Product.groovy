package helloworld

class Product {

    String name
    String description
    Double price

    static constraints = {
        description(nullable: true)
        name(blank: false)
        price(min: 0D)
    }
}
