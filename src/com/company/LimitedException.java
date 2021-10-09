package com.company;

class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

}
