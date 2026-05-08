package shopping.product

class Product(
    var id: Int,
    val name: String,
    val price: Int,
    val imageUrl: String,
) {
    constructor(
        name: String,
        price: Int,
        imageUrl: String,
    ) : this(0, name, price, imageUrl)

    init {
        require(name.length <= 15)
    }
}
