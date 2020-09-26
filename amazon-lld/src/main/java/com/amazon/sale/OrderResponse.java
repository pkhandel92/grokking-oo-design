package com.amazon.sale;

public class OrderResponse {
    private boolean isOrderSuccess;
    private String reason;
    private int code;
    private String orderId;

    public boolean isOrderSuccess() {
        return isOrderSuccess;
    }

    public void setOrderSuccess(boolean orderSuccess) {
        isOrderSuccess = orderSuccess;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
