Requirements

Search Functionality: 
* User should be able to search feature without a login.
* User should be able to search a category
* User should be able to search a product based on 
    * Name
    * Company
    * Type  
    
DB DESIGN
    
    Product Table    
    |PID|ProductName|INGREDIENTS|COMPANY|CATEGORY|PRICE|
    
    Vendor
    
    |VID|Vendor Name|Location|Vendor Address|
    
    INVENTORY
    
    |PID|VID|DISCOUNT|ITEMS REMAINING|
    
    Think of search queries
    1) Find all products based on category 
        (i) select * from Product where TYPE=categor
    2) Find all available products based on category
        (i) select * from INVENTORY  JOIN Product  on INVENTORY.pid=PRODUCT.pid where TYPE=category
    3) Find all available product based on availability of location
        (i) Assume that location is stored as some longitude/latitude combination
        (ii) select PRICE,DISCOUNT ,PRODUCT NAME,INGREDIENTS,COMPANY,TYPE,VENDOR NAME,VENDOR ADDRESS from INVENTORY i join product p on i.pid=p.pid join Vendor v on i.vid=v.vid where location =${location}and items remaining>0
     //The above query is wrong need to check but you get the idea
     
Cart Functionality:
* User can add item to his/her cart
* User can remove item from his/her cart
* User can view his cart
* User can edit quantity of item
* User can flush/clear cart

DB DESIGN

    CART
    |USER ID|USER DETAILS|PID|VID|QUANTITY(q of items added to cart)|

    Think of search queries
    1) Find all entries in cart for a user
        (i) select * from cart c JOIN inventory i on c.pid=i.pid and c.vid=i.vid
    2) Find all available entries in cart for a user
        (i) select * from cart c JOIN inventory i on c.pid=i.pid and c.vid=i.vid where i.items remaining>0;
    3) Delete all items(Clear cart)
        (i) delete from cart where user=;
    4) Remove certain item from cart
        (i) delete from cart where user= , pid =   and vid=;
    5) Update quantity
        (i) update cart set quantity= where pid=,vid= and uid=;
        
Order Functionality:
* User can have order a list of product or a single product
* Order table should have details about payments related to that particular order
* Order should be linked to shipment table

DB DESIGN
    RELATIONSHIPS
   
    1 OrderID->M Products
    
    1 OrderID -> 1 Payment
    
    1 OrderID -> M SHIPMENTS 
    
    ORDER
    |ORDER ID|PID|VID|COST|PAYMENT_ID|SHIPMENT ID|ORDER DATE|
    
    PAYMENT
    |PAYMENT ID|PAYMENT TYPE|PURCHASE DATE|
    
    SHIPMENT
    |SHIPMENT_ID|SHIPMENT DESTINATION|ESTIMATE DELIVERY|SHIPMENT METHOD|
    