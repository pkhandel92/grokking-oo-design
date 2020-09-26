package com.amazon.sale;

import com.amazon.account.User;
import com.amazon.cart.IShoppingCart;
import com.amazon.inventory.IInventoryService;
import com.amazon.item.Product;
import com.amazon.payment.PaymentType;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SaleService implements ISaleService {
    private IInventoryService inventoryService;
    private IShoppingCart shoppingCart;
    private IPaymentService paymentService;
    private IOrderDao orderDao;
    @Override
    public OrderResponse buyNow(Product product,PaymentType paymentType) {
        if(inventoryService.checkStock(product)){
            OrderResponse response=new OrderResponse();
            response.setCode(0);
            response.setOrderSuccess(true);
            return response;
        }else {
            //throw error
            OrderResponse response=new OrderResponse();
            response.setCode(1);
            response.setOrderSuccess(false);
            return response;
        }

    }

    @Override
    public OrderResponse checkOutCart(User user) {
        List<Product> productList=shoppingCart.viewCart(user);
        String orderid=getNewOrderID();
        OrderResponse response=new OrderResponse();
        List<Product> unavailableProducts=productList.stream().filter(product->!inventoryService.checkStock(product)).collect(Collectors.toList());
        if(unavailableProducts.isEmpty()){
           response.setCode(0);
           response.setOrderSuccess(true);
           return response;
        }
        response.setOrderSuccess(false);
        response.setCode(1);
        response.setReason("All items are unavaialale");
        return response;
    }

    private String getNewOrderID() {
        //expect some random number generated from DB counter
        //for scaling this needs to cordinated using a zookeeper maybe
        return String.valueOf(new Random().nextInt(1000));
    }
}
