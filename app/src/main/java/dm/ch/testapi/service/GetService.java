package dm.ch.testapi.service;

import dm.ch.testapi.Model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
