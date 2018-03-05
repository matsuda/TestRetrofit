package com.github.matsuda.testretrofit.api;

import com.github.matsuda.testretrofit.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by matsuda on 2018/03/05.
 */

public interface GitHubService {
    @GET("users/{user}")
    Call<User> user(@Path("user") String user);
}
