package pl.droidsonroids.jspoon.example.java.api;

import io.reactivex.Single;
import pl.droidsonroids.jspoon.example.java.model.AcMilanPage;
import pl.droidsonroids.jspoon.example.java.model.BlogPage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AcMilanService {
    @GET("/")
    AcMilanPage getAcMilanPage();
}