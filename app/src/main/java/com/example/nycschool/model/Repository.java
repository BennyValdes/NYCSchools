package com.example.nycschool.model;

import com.example.nycschool.model.state.UIState;

import io.reactivex.rxjava3.core.Single;

public interface Repository {
    Single<UIState> getSchoolList();
    Single<UIState> getSchoolDetails(String dbn);
}
