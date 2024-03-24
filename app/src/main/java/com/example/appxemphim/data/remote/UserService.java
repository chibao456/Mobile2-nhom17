package com.example.appxemphim.data.remote;

import com.example.appxemphim.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("api/User/login")
    Call<User> checkLogin();
}
