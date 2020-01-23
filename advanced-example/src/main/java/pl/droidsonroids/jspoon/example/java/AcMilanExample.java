package pl.droidsonroids.jspoon.example.java;

import pl.droidsonroids.jspoon.example.java.api.AcMilanService;
import pl.droidsonroids.jspoon.example.java.model.AcMilanPage;
import pl.droidsonroids.jspoon.example.java.model.AcMilanPost;
import pl.droidsonroids.retrofit2.JspoonConverterFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class AcMilanExample {

    public static AcMilanPage getAcMilanPage() {
        AcMilanService acMilanService = createService();
        return acMilanService.getAcMilanPage();
    }

    private static AcMilanService createService() {
        return createRetrofit()
                .create(AcMilanService.class);
    }

    private static Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://acmilan24.com/")
                .addConverterFactory(JspoonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private static void printPage(AcMilanPage acMilanPage) {
        acMilanPage.posts.forEach(AcMilanExample::printPost);
    }

    private static void printPost(AcMilanPost post) {
        System.out.println(post.title);
//        System.out.println(post.excerpt);
//        System.out.println(post.imageUrl);
//        System.out.println(String.join(", ", post.tags));
        System.out.println();
    }
}