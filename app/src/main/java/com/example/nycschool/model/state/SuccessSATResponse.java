package com.example.nycschool.model.state;

import com.example.nycschool.model.pojo.NYCSATResponse;

public class SuccessSATResponse extends UIState{
    private NYCSATResponse data;

    public NYCSATResponse getData() {
        return data;
    }

    public void setData(NYCSATResponse data) {
        this.data = data;
    }
}
