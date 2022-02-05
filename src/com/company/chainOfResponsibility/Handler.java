package com.company.chainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle();
}
