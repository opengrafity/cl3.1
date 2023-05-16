var products = {
    "Rice":{
        "name":"Rice",
        "price":1500.0,
        "category":"essentials"
    },
    "Powder":{
        "name":"Powder",
        "price":150.0,
        "category":"cosmotics"
    },
    "Edible Oil":{
        "name":"Edible Oil",
        "price":300.0,
        "category":"essentials"
    },
    "Pen":{
        "name":"Pen",
        "price":15.0,
        "category":"stationary"
    }
};

var categories = {
    "essentials":5,
    "snacks":8,
    "cosmotics":18,
    "homedecors":18,
    "stationary":12
}

var cart=[
    {
        productName:"Rice",
        quantity:2
    },
    {
        productName:"Pen",
        quantity:4
    },
]; 

var productBill = 0;
var total = 0;
var totalTax = 0;
for(var i in cart){
    var cartItem = cart[i];    
    var product = products[cartItem.productName];
    productBill = cartItem.quantity*product.price;
    total = total + productBill;
    totalTax = totalTax + (productBill/100)*(categories[product.category]);
}

console.log("Total Bill:",total);
console.log("Total Tax:",totalTax);
console.log("Total Cost:",(total+totalTax));

