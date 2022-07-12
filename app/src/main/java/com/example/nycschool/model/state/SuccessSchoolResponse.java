package com.example.nycschool.model.state;

import com.example.nycschool.model.pojo.NYCSchoolResponse;

import java.util.List;

public class SuccessSchoolResponse extends UIState{
    private List<NYCSchoolResponse> data;

    public List<NYCSchoolResponse> getData() {
        return data;
    }

    public void setData(List<NYCSchoolResponse> data) {
        this.data = data;
    }
}
