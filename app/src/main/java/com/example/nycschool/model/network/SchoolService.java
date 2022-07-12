package com.example.nycschool.model.network;

import com.example.nycschool.model.pojo.NYCSATResponse;
import com.example.nycschool.model.pojo.NYCSchoolResponse;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface SchoolService {
    @GET(ENDPOINTS.ENDPOINT_SCHOOL)
    Single<List<NYCSchoolResponse>> getSchoolList();

    @GET(ENDPOINTS.ENDPOINT_SAT)
    Single<List<NYCSATResponse>> getSatList();
}
