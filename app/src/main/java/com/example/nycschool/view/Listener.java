package com.example.nycschool.view;

public interface Listener {
    void openDetails(String dbn, String name,String loc, String email, String phone);
    interface ListClickEvent{
        void clickDetails(String dbn, String name,String loc, String email, String phone);
    }
}
