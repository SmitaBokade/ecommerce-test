--- Admin can create product and manage inventory----

Step 1: Create any product(one by one) with quantity
Sample request:
POST: http://localhost:8080/products
{
	"productName":"cycle",
	"quantity":4
}

Step2: Get the list of all products
GET: http://localhost:8080/products

Capture the response of GET request(ProductId)

--- Customer can place single order / multiple orders

Step 3:
Sample request 1
POST: http://localhost:8080/orders
{
	"orderItems":[
		{
		"productId":"5eb85fe2fa27c177118fc33f",
		"productName":"cycle",
		"quantity":2
	}
]
}
Sample request 2:
{
	"orderItems":[
		{
		"productId":"5eb86c506a41b74c6b985684",
		"productName":"cycle",
		"quantity":1
	},
	{
		"productId":"5eb86caa6a41b74c6b985686",
		"productName":"bike",
		"quantity":2
	},
	{
		"productId":"5eb86cb96a41b74c6b985687",
		"productName":"truck",
		"quantity":3
	}
]
}

----- -------- -------
As soon as the order is placed, product quantity is decremented by the number of quantity ordered
Repeat
 Step2: Get the list of all products ( to check the available quatity of any product)
 GET: http://localhost:8080/products